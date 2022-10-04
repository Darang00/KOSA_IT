import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		String sql = "select * from sdept where dname = ?";
		return sql;
	}
	
	public static String insert() {
		String sql = "insert into sdept(deptno, dname, loc)";
		return sql;
	}
	
	public static String delete() {
		String sql = "delete ";
		return sql;
	}
	
	public static String update() {
		String sql = "select ";
		return sql;
	}

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = SingletonHelper.getConnection("oracle");
			String sql;
			
			//전부 조회
			sql = allSelect();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
		}catch{
			s
		}
		

	}

}
