import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 JDBC
 1. Java ��� (APP)�� ���ؼ� Oracle(����Ʈ����)�� �����ؼ� CRUD �۾� �ҰŴ�
 2. Java App: Oracle, My-sql, Ms-sql ��� ��� ������ ���̽��� ������ �� �ְ� �۾��� �� �ִ� (CRUD)
 2.1 ������ ��ǰ�� �´� ����̹��� ������ �־�� �Ѵ�. 
 CASE 1: �Ｚ ��Ʈ�� >> HP ������ ���� >> HP ������ ����Ʈ���� ����̹��� �ٿ� �޾Ƽ� >> �Ｚ ��Ʈ�Ͽ� ��ġ >> HP ������
 CASE 2: HP ������ ���� ȸ��� ... �Ｚ, LG ȸ�� ���� ������ �� �ִ� ����̹��� ������ ����
 �� �� �´� ����̹��� �ٿ�ε� �ؼ� ��ǰ�� �°� ��ġ�ϰ� ����...
 Oracle (C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib)
 Mysql (������.. Ȯ��)
 
 ����PC: (Ȯ��...)
 
 3. ����̹��� ���� (���� ������Ʈ���� ���) >> Java Project -> �Ӽ� -> build path ->
 (������.. Ȯ��...)
 
 3.1 ����̹� ��� �غ� �Ϸ� >> �޸𸮿� load ���...
 3.2 Class.forName("oracle.jdbc.OracleDriver"); ... new�ؼ� ��ü ����
  
4. JAVA CODE (CRUD) >> JDBC API ���� �޴´�
4.1 import.java.sql.* >> interface, class ����
4.2 �����ڴ� interface �� ���ؼ� ǥ��ȭ�� DB �۾� ����
POINT) why interface ���·� ����? >> JDBC API >> Oracle, Mysql, ....)
	// ���ƴ�..(Ȯ��)
	//
	//

>>�������� ���� (�������̽� Ȱ��)
import java.sql.Connection
import java.sql.ResultSet
import.java.sql.Statement ���

5. �۾� ���� (*�ܿ��*)
5.1 DB ���� >> ��� ���� >> ��� ���� >> ó�� >> �ڿ� ����
5.1 ���: DDL (create, alter, drop)
         CRUD (insert, select, update, delete)
    ����: �������� DB �������� ����
    ó��: ����� �޾Ƽ� ȭ�鿡 ���, �Ǵ� �ٸ� ���α׷��� ���� ���
    �ڿ� ����: ���� ����
 
 */



public class Ex01_Oracle_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// DB ���� -> ��ɻ��� -> �ǻ� -> ó��
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("����Ŭ ����̹� �ε�....");
	
		//loading �� ����̹��� ���ؼ� oracle  ����
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KOSA", "1004");
		System.out.println(conn.isClosed() +" ���� false");
		
		Statement stmt = conn.createStatement(); //��ɰ�ü ������
		
		//CRUD
		String sql = "select empno, ename, sal from emp";
		
		ResultSet rs = stmt.executeQuery(sql); //��� ����
		
		//rs�� ���ؼ� DB���� memory�� ������ ������ ��ȸ
		//ó��(ȭ����ȸ)
		//���࿡ �߰��� DB ���� close() ... ������ ���α׷�
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "/" 
							+ rs.getString("ename") 
							+ rs.getInt("sal"));
		}
		
		stmt.close();
		rs.close();
		conn.close();
		System.out.println("DB ����: " + conn.isClosed());

	}	
}
