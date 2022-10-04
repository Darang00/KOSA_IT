import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 DML(insert, update, delete)
 JDBC API ���ؼ� �۾�	
 1. ��� ������ ����. (resultSet �ʿ� ����)
 2. �ݿ���� (return ���� ��) >> update 5�� >> return 5
 
 java �ڵ�
 update emp set sal - 0 > ���� > update 14�� >> return 5
 
 java �ڵ� 
 update emp set sal = 0 > ���� > update 14�� >> return 14
 update emp set sal = 100 where empno = 4444 > update 0�� >> return 0
 
 ����� ������ java �ڵ�� ����ó��
 KEY POINT
 1. Oracle DML(developer, Cmd(sqlplus), Tool) �ϸ� commit or rollback ����
 2. JDBC API ����ؼ� java �ڵ带 ���ؼ� DML >> default >> autocommit; �ڹ� �ڵ忡�� delete �ϸ� ������ �ǹݿ�
 3. JDBC API ���ؼ� delete from emp >> ���� >> �ڵ����� commit >> �ǹݿ�
 4. �ʿ信 ���� commit(), rollback ó�� �ڵ� ... 
 
 begin
 	A���� ���� (update...
 	... 
 	B���¿� �Ա� (update ...
 end
 >> �ϳ��� ������ ���� ���� (transaction)
 >> ��ü commit �̰ų� ��ü rollback
 >> �Ѵ� ���� �̰ų� �� �� ����
 
 >> ���� ó�� >. JDBC >> autocommit �ɼ��� >> false ��ȯ
 >> �ݵ�� java code���� DML �۾��� ���ؼ� >> commit, rollback  ���� ȣ��
 
 select * from dmlemp;
alter table dmlemp
add constraint pk_dmlemp_empno primary key(empno);

select * from user_constraints where table_name = 'DMLEMP';
 
 */
public class Ex02_Oracle_DML_insert {

public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			 //����̹� �ε� 
			 //Class.forName("oracle.jdbc.OracleDriver"); ��������
			
			 //Connection �������̽��� �����ϰ� �ִ� ��ü�� �ּҰ� ���� ...
			 //�������� ���ؼ� Connection Ÿ���� conn ������ �ּҰ��� �޴´�
			 conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","KOSA","1004");
			 stmt = conn.createStatement(); //Statement �����ϰ� �ִ� ��ü�� �ּ� ����
			
			 //INSERT
			 int empno=0;
			 String ename="";
			 int deptno=0;
			 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("����Է�");
			 empno = Integer.parseInt(sc.nextLine());
			 
			 System.out.println("�̸��Է�");
			 ename = sc.nextLine();
			 
			 System.out.println("�μ��Է�");
			 deptno = Integer.parseInt(sc.nextLine());
			 
			 //insert into dmlemp(empno,ename,deptno) values(100,'ȫ�浿',10) �������� ���
			 String sql="insert into dmlemp(empno,ename,deptno) ";
			 sql+= "values(" + empno + ",'" + ename + "'," + deptno+ ")";
			 System.out.println(sql);
			 //���� 
			 //values(?,?,?)  >> ? parameter ���� ����
			 //executeUpdate() >> insert , update , delete  ��� ����
			 int resultrow = stmt.executeUpdate(sql);
			 
			 if(resultrow > 0) {
				 System.out.println("�ݿ��� ���� �� : " + resultrow);
			 }else {
				 System.out.println("���ܰ� �߻��� ���� �ƴϰ� : �ݿ��� ���� ���� ");
			 }
			 
		} catch (Exception e) {
			//�ߺ������� insert �ؼ� ������ ����� executeUpdate()���� �߻�
			//�ڵ� ó��
			System.out.println("SQL ���ܹ߻� : " + e.getMessage());
		}finally {
			//���� ���� ��
			//�ڿ����� 
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}



