import java.util.ArrayList;

import kr.or.kosa.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		// 1. ��� �� �� ������
		Emp emp = new Emp(1000, "������", "�屺");
		System.out.println(emp.toString());
		
		// 2. ��� 2�� ���弼�� (Array) // ���� �迭: �� ũ�� ������ ����
		Emp[] emplist = {new Emp(100, "�达", "����"), new Emp(200, "�ھ�", "IT")} ;
		for(Emp e: emplist) { //������  for��
			System.out.println(e.toString());
		}
		
		//3. ����� 1�� �� �Ի縦 �߾�� (300, "�̾�", "IT")
		//�� 3�� �迭 ���� -> �̻��� �� for�� ���鼭 �ٽ� ������ ��������
		
		//ArrayList ��� // ���� �迭: �� ũ�� ������ ���� ����. ��� ��� �߰� ����
		ArrayList elist = new ArrayList();
		elist.add(new Emp(100, "�达", "����"));
		elist.add(new Emp(200, "�ھ�", "IT"));
		elist.add(new Emp(300, "�̾�", "IT"));
		
		for(int i = 0; i<elist.size(); i++) {
			System.out.println(elist.get(i).toString());
			
			Emp e = (Emp) elist.get(i);
			e.toString();
		}
		
		elist.add(new Emp(400, "�־�", "����"));
		
		//toString() ������� ���� 4�� ����� ���, �̸�, ������ ����ϼ���
		//for�� �ȿ��� getEmpno, getEname(), getJob()
		for(int i = 0; i<elist.size(); i++) {
			Object obj = elist.get(i);
			//obj.toString()
			//Object ��� Ÿ���� �θ�Ÿ�� (Down casting)
			Emp e = (Emp)obj;
			System.out.println(e.getEmpno() + "." + e.getEname() + "." + e.getJob());
			
		}
		
		// ���� ������... (Object Ÿ�� �����ұ�?) ... downcasting ... �ڽĿ�� ����
		// Object���� ���� ... ���
		// Ÿ���� �����ؼ� �� Ÿ�Ը� ���� ����  >> �ϳ��� Ÿ�Ը��� ������ ������ ����
		// ���ʸ� (��ü ������ Ÿ�� �����ϴ� ���)
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1,"A", "IT"));
		
		for(Emp e: list2) {
			System.out.println(e.getEmpno());
		}
		

	}

}
