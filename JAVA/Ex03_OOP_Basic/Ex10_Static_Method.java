/*
 static member field : ��ü�� �����ڿ� ...
 static method : why : ù�� ù �ð� �ߴ� �ڵ�....
 1. ��ü ���� ����....
 2. ���� ����ؿ�
 3. ���赵�� ���鶧 ����ؾ��ؿ� (����� �� �ڿ�(���)�� ���� ����Ѵٸ�)
 4. �ڿ� ���� ����... ���ϰ� ���� ���ٰ�.. new ��ü ... ��������.. >> static ����
 
 */
class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {
		//�Ϲ��Լ�
		//new�� ���� heap�̶�� �޸𸮿� �ö󰡾� > ���
		//1. iv ���� ����
		cv = 100;
		//why: �������� (static �ڿ��� ��ü ���� ������ memory �ε�)
	}
	
	
	
	static void print() {
		//static �Լ�
		//1. cv�� ���� �� �� �ִ� (0) (�����)
		//2. static �Լ��� �Ϲݺ���iv�� ���� �Ұ��� ... static �ڿ��� ���� ó���ϱ� ������ �޸𸮿� �ö��ְ� 
		//�� �ڿ� �Ϲ��Լ��� �Ϲݺ��� ó���ǹǷ� �Ϲ��Լ��� ���� �޸� ���� �ö��ִ� static �ڿ����� ��� ���� 
		//�׷��� static �Լ��� �Ϲ� �Լ��� ���� ��� �Ұ��� 
		//iv = 1000; �������� (static �ڿ��� �Ϲ� �ڿ����� �켱�Ѵ�)
		
		//���: static �ڿ��� ������ ��ƿ�
		cv = 200000;
		System.out.println(cv); 
	}
}





public class Ex10_Static_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticClass.print();  // new ���� �Լ� ��� ...
		
		System.out.println(StaticClass.cv);
		
		//�Ϲ��ڿ� (��ü ����)
		StaticClass sc = new StaticClass();
		sc.print();
		
		

	}

}
