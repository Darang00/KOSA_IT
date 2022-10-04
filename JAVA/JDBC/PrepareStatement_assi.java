import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.or.kosa.SingletonHelper;

/*
 sdept 테이블에 대해서
전체조회
조건조회
삽입
삭제
수정
을 작업 하시면 됩니다
PreparedStatement
 */
public class PrepareStatement_assi {
	public static String allSelect() {
		String sql = "select * from sdept";
		return sql;
		
	}
	
	public static String Select() {
		String sql = "select * from sdept where deptno = ?";
		return sql;
	}
	
	public static String insert() {
		String sql = "insert into sdept (DEPTNO, DNAME, LOC) values(?, ?, ?)";
		return sql;
	}
	
	public static String delete() {
		String sql = "delete from sdept where DEPTNO = ?";
		return sql;
	}
	
	public static String update() {
		String sql = "update sdept set DEPTNO = ? where DNAME = ?";
		return sql;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 인터페이스 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		//Connection 연결
		try {
			conn = SingletonHelper.getConnection("oracle");
			System.out.println("데이터 관리: 1.전체조회  2.조건조회  3.삽입  4.삭제  5.수정");
			int optNum = scan.nextInt();
			
			switch(optNum) {
			case 1: 
				sql = allSelect();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("조회된 데이터가 없습니다.");
				}
				break;
				
			case 2:
				sql = Select();
				pstmt = conn.prepareStatement(sql);
				System.out.println("Enter the DEPTNO");
				int optDeptno = scan.nextInt();

				pstmt.setInt(1, optDeptno);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("조회된 데이터가 없습니다.");
				}
				break;
				
			case 3:
				sql = insert();
				pstmt = conn.prepareStatement(sql);
				
				System.out.print("Enter a DEPTNO >> ");
				int newDEPTNO = scan.nextInt();
				pstmt.setInt(1,  newDEPTNO);
				System.out.print("Enter a DNAME >> ");
				String newDNAME = scan.next();
				pstmt.setString(2,  newDNAME);
				System.out.print("Enter a LOC >> ");
				String newLOC = scan.next();
				pstmt.setString(3,  newLOC);
				
				int row = pstmt.executeUpdate(); // ? parameter 값들만 전달
				rs = pstmt.executeQuery();
				if(row>0) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("조회된 데이터가 없습니다.");
				}
				break;
				
			case 4:
				sql = delete();
				pstmt = conn.prepareStatement(sql);
				System.out.print("Enter a DEPTNO >> ");
				int deleteDEPTNO = scan.nextInt();
				pstmt.setInt(1,  deleteDEPTNO);

				int rowCount = pstmt.executeUpdate();
				if(rowCount ==1) {
					System.out.println("부서삭제 완료");
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("조회된 데이터가 없습니다.");
				}
				break;
				
			case 5:
				sql = update();
				pstmt = conn.prepareStatement(sql);
				System.out.print("Enter modifying LOC >>");
				String modLOC = scan.next();
				pstmt.setString(1, modLOC);
				System.out.print("Enter modifying DNAME >>");
				String modDNAME = scan.next();
				pstmt.setString(2, modDNAME);
				System.out.print("Enter modifying DEPTNO >>");
				String modDEPTNO = scan.next();
				pstmt.setString(3, modDEPTNO);
				
				int row2 = pstmt.executeUpdate(); //? parameter  값들만 전달
				rs = pstmt.executeQuery();
				if(row2>0) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				break;			
			}
						
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
			//싱글톤은 close() 하지 않음 app가 존속하는 한....
		}
	}
}