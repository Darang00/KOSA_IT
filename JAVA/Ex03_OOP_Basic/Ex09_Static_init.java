//'static ������ ��ü���� ���� ���� ������ �� �ž�' �� �������� ����
//instance ������ ��ü���� �ٸ� ���� ������ �Ұž߸� �������� ����

// �� ������ ���ؼ� �ʱ�ȭ....

class InitTest{
	static int cv = 10;
	static int cv2;
	int iv = 9;
	//3���� ��� default ���� ������ ������ �ʱ�ȭ�� ���� �ʾƵ� �ſ�
	
	static{
		//static �ڿ��� ���� �ʱ�ȭ ��
		//���� ����: static int cv = 10; �� static int cv2; �� �޸𸮿� �ö� ���� �����
		cv = 1111;
		cv2 = cv + 2222; // ���۵� ǥ���� ����
	}
	
	{
		//�ʱ��� �� (����� �ʿ��ϸ� member field �� ���⼭ �ʱ�ȭ �ϼ���)
		//��ü�� �����ǰ� ���� ������ int iv�� �޸𸮿� �ö󰡰� ���� �ٷ� ȣ�� { �� }
		//�������� �ڵ� if(iv>10) iv = 100;
		System.out.println("�ʱ��� ��");
		///iv = 2222;
		if(iv > 10) iv = 1000;
		
		//cv = 100; //�ʱ�ȭ >> ��ü new ���� ������ ... �ʱ�ȭ�� �ȵſ�(static�� ���ؼ�)
		
	}
	
	
}

public class Ex09_Static_init {

	public static void main(String[] args) {
		//InitTest t = new InitTest();
		//System.out.println(t.iv);
		
		System.out.println(InitTest.cv);
		System.out.println(InitTest.cv2);
		

	}

}
