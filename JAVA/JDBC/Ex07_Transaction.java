import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.or.kosa.SingletonHelper;

/*
 create table trans_A(
    num number,
    name varchar2(20)
);

create table trans_B(
    num number constraint pk_trans_B_num primary key,
    name varchar2(20)
);

JDBC >> default(dml) >> autocommit >> 실반영

JDBC >> autocommit >> 개발자 >> false >> 반드시 >> commit, rollback


 */
public class Ex07_Transaction {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		conn = SingletonHelper.getConnection("oracle");
		
		String sql = "insert into trans_A(num, name) values(100, 'A')";
		String sql2 = "insert into trans_B(num, name) values(100, 'B')";
		
		try {
			//원하는 것: 둘 다 성공 아니면 둘 다 실패 (하나의 논리적 단위로 묶음)
			 conn.setAutoCommit(false); //JDBC 개발자 (commit or rollback)
			 //begin tran
			  pstmt = conn.prepareStatement(sql);
			  pstmt.executeQuery();
			 
			  pstmt2 = conn.prepareStatement(sql2);
			  pstmt2.executeQuery();
			 //end tran
			 conn.commit(); //둘다 정상적으로 실행되고 예외가 발생되지 않으면 :commit
			 
		} catch (Exception e) {
			System.out.println("문제발생 : " + e.getMessage());
			try {
				conn.rollback(); //둘다 취소
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			SingletonHelper.close(pstmt);
			SingletonHelper.close(pstmt2);
		}

	}

}