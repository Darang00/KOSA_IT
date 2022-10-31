package kr.or.kosa.dao;
import kr.or.kosa.utils.ConnectionHelper;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import kr.or.kosa.dto.RegisterDto;


/*
1. DB연결 POOL
2. insert 작업 
insert into mvcregister(id,pwd,email) values(?,?,?)

*/
public class RegisterDao {
  
	//writeOk ...
	//insert into mvcregister(id,pwd,email) values(?,?,?)
	public int writeOk(RegisterDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int resultrow=0;
		try {
				conn = ConnectionHelper.getConnection("oracle");
				String sql="insert into koreaMember(id,pwd,name, age, gender, email, ip) values(?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1,dto.getId());
				pstmt.setString(2,dto.getPwd());
				pstmt.setString(3,dto.getName());
				pstmt.setInt(4,dto.getAge());
				pstmt.setString(5, dto.getGender());
				pstmt.setString(6,dto.getEmail());
				pstmt.setString(7,dto.getIp());
								
				resultrow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn);
		}
		return resultrow;
	}
						
		//id 중복체크
		public boolean idCheck(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bituser","1004");
			//비기능적 요구사항
			conn = ConnectionHelper.getConnection("oracle");
			String sql="select id, pwd from koreamember where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			rs = pstmt.executeQuery(); 
			
			//업무
			while(rs.next()){
				//데이터가 있다 (id가 존재)
				
				//ID 존재
//				if(pwd.equals(rs.getString("pwd"))){
				  //ID 존재 , PWD(0) 
				  //정상회원
				  
				  //Top.jsp 정보 로그인 상태 ...
				  
				  //이동처리
		
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			ConnectionHelper.close(rs);
			ConnectionHelper.close(pstmt);
			ConnectionHelper.close(conn);
		}
		return false; 
	}
	
	////////////////////////////////////////////////////////////////////
	
}