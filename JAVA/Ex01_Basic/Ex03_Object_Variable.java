
//����Ʈ ���赵
class Apt{   //���赵 == ������ Ÿ�� (���� Ÿ���� ��� ���� ū Ÿ��)
	int window;
}

// ������ Ÿ�� ������ ex) int number;  >> number ��� ������ Ÿ�Կ� �´� ���� ������.
//Apt apt;


public class Ex03_Object_Variable {

	public static void main(String[] args) {
		
		
		int number=100;
		
		Apt apt; // ���� Apt�� Ÿ��, apt�� ����
		         // apt������ AptŸ���� ���� ������ �ϴµ� �ּҰ�
		         // ������ ����Ʈ�� �޸𸮿� �÷��� ����Ʈ�� �����ǰ� �� �ּҰ� ���������.
		         // ������ ��� : new (������)
		apt = new Apt(); // heap �޸𸮿� ����Ʈ�� �� ä ���������, �׸��� �ּҰ� �����ǰ�
		                 // ������ �ּҰ��� apt��� ������ ������. 
		System.out.println("apt ������ ������ ���� : " + apt);
		//apt ������ ������ ���� : Apt@626b2d4a  : ���۵� ��
		//Apt + @ + 626b2d4a >> ���赵�� �̸� + @ + �ּҰ� (16byte: 0~9, A~F)
		
		Apt apt2 = new Apt();
		
		//System.out.println(apt == apt2); // �� ���� apt�� apt2�� �ּҰ� ����?? (���: false)
		// . �� �ǹ�: �ּҸ� ã�ư��� ������
		
		//Apt apt3 = apt2; // �ּҰ��� �Ҵ�
		//System.out.println(apt3 == apt2); // �� ���� apt3 �� apt2�� �ּҰ� ���� (���� ���� ���Ÿ� ����)
		//apt2.window =20;
		
		//System.out.println("apt3 : â���� �� : " + apt3.window);
		
		//��Ÿ�԰� �ּ�Ÿ�� �����ϱ�
		/*
		 >>>>>
		 Ex03_Object_Variable �ҽ�����
		 javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class ��������
		 java Ex03_Object_Variable ����
		 
		 JVM ���� >> OS >> JAVA �޸� ���� (��ȹ����) >> �ڿ��Ҵ� (�޸�) >> ���α׷� ����
         >> ����ߴ� �޸� OS ��ȯ ... end
         >>>>>
         ��Ŭ���� ���� ���� ������ ctrl + F11 Ű ���ÿ� ������ �� ���� ����		  
		  
		  1. main �Լ� �ȿ� ���������� �ݵ�� �ʱ�ȭ �ϰ� ��� 
		  2. ��� >> main �Լ� >> ������ >> ���α׷� ���� �� �� ������ ���� ���� �����
		 
		 */
		
		
	}

}
