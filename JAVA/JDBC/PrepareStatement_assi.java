import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.kosa.SingletonHelper;

/*
 sdept ���̺� ���ؼ�
��ü��ȸ
������ȸ
����
����
����
�� �۾� �Ͻø� �˴ϴ�
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
			
			//���� ��ȸ
			sql = allSelect();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
		}catch{
			s
		}
		

	}

}
