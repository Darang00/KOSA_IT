package kr.or.kosa;

public class Ex11_Static_Method {
	
	public void method() { //heap �޸𸮿� �ε� �ǰ� ���� ���(new ...)
		System.out.println("�� �Ϲ��Լ���");
	}
	
	public static void smethod() {
		System.out.println("�� static �Լ���");
	}
	public static void main(String[] args) {
		
		//�ȿ��� smethod ���
		//Ex11_Static_Method.smethod(); Ex11_Static_Method.smethod() �� �ڿ�
		smethod(); //ȣ��
		
		Ex11_Static_Method ex11 = new Ex11_Static_Method () ;
		//ex11 �������� (�ּҸ� ������ �ִ� ����) �� static ����, �Ϲ� ���� ����
		ex11.method();
		

	}

}
