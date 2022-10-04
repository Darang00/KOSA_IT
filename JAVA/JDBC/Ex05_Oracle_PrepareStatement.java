import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.or.kosa.SingletonHelper;

/*
 PreparedStatement (�غ�� Statement )

(1) ���� 
�̸� SQL���� ���õ� Statement �� DB�� ���۵Ǿ����� �����ϵǾ�����, SQL���� ?�� ���߿� �߰� �����ؼ� ���� 
�� �Ǿ����� �غ�� Statement 

ex) �̰� �ΰ� �ٸ� �ɷ� ����.. ������
	select * from emp where empno = 7788 -> �����м� -> �����ȹ -> �޸� ...
	select * from emp where EMPNO = 7788 -> �����м� -> �����ȹ -> �޸� ...

(2) ����
<1> Statement �� ���ؼ� �ݺ����� SQL���� ����� ��쿡 �� ������. ( Ư��, �˻��� )
<2> DB�÷�Ÿ�԰� ������� ?�ϳ��� ǥ���ϸ� �ǹǷ� �����ڰ� ����� �ʰ� ����. ( Ư��, INSERT�� )
(����: ?�� ������ SQL���� DB���� �̸� �����ϵǾ����� ���)

(3) ����
SQL������ PreparedStatement ��ü�� ���� �����ؾ� �ϹǷ� ����Ұ�
(but, Statement ��ü�� SQL���� �޶������� �� ���� �����ؼ� ������ �����ϴ�. )

(4) Ư¡
<1> Statement stmt = con.createStatement(); //���� stmt.execute(sql);//����
<2> PreparedStatement pstmt = con.prepareStatement(sql); //���� pstmt.execute(); //����

(5) ����
DB ��ü��(table, ..)�� ����( ���̺�� or �÷��� or �������� ���� ��ü�� �Ӽ���)�� ?�� ǥ���� �� ����.
��, data �ڸ����� ?�� ǥ���� �� �ִ�.
cf) �׷���, DDL�������� PreparedStatement�� ������� �ʴ´�.
 ����: ���� (��ü������ DB�� ������ �ʾƿ�) �����.... SQL�� ������ ������... �� �������� parameter (©���� �Ⱥ���.. Ȯ��)
      �̸� ������ ������ (�������� DB �������� ����) >> �� ���� ���� >> parameter ���� >> ��Ʈ��ũ Ʈ���� ����
 ����: �������� �ٲ�� �ٽ� ������ ... (�̷� ���� �� ����)

4. CallableStatement ( ȣ���� �� �ִ� Statement )
(1) ����
DataBase �� �̸� �����ϵǾ� �ִ� Stored Procedure �� ȣ���ϱ� ���� Statement

(2) ���� / ȣ��
String sql = "{call incre(?,?)}";
CallableStatement cstmt = con.prepareCall(sql);
(ex: day3/JDBC12.java )
 */
public class Ex05_Oracle_PrepareStatement {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = SingletonHelper.getConnection("oracle");
			String sql = "select empno, ename from emp where deptno = ?"; //?�� parameter ���̴�
			//where id = ? and name = ? and job = ?
			// ? �� parameter
			pstmt = conn.prepareStatement(sql); //�̸� ������ (������ DB ������ ������ �־��)
			
			//���Ŀ��� parameter �����ؼ� DB ������ ������ �ſ�
			pstmt.setInt(1, 30); //where deptno = 30
			
			//ResultSet rs = stmt.executeQuery(sql); //��� ����....
			rs = pstmt.executeQuery();
			//���İ��� ����
			//������ 1�� or 1�� �̻� or ���� ���
			if(rs.next()) { //�ּ� 1��
				do {
					System.out.println(rs.getInt(1) + "/" + rs.getString(2));
				}while(rs.next()) ;			
			} else {
				//������ ����
				System.out.println("��ȸ�� �����Ͱ� �����ϴ�");
			}
			
		} catch (Exception e) {
			
		}finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
			//�̱����� close() ���� �ʾƿ� Application�� �����ϴ� �� ... 
		}
	}

}
