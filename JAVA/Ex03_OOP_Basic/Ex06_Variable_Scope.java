/*
 instance variable >> class Car {private String color;}
 >>  �����Ǵ� ��ü���� �ٸ� ������ ���� �� �ִ�.
 
 local variable >> class Car { public void move() {int speed = 0; // �ݵ�� �ʱ�ȭ �ʿ� } }
 main �Լ� >> local variable
 
 block variable >> class Car { public void move() {for(int i; i< 10....)} ��� ���� �� �������� >> ��� ������ �Ҹ�}
 
 static variable >> �����ڿ� (��ü��) , ��ü ���� ������ memory�� �ö󰡴� �ڿ� (����: class area, method area)
 
 ��ü�� ����� ������ ���: new�� ���ؼ� �޸𸮿� �ø��� ��
 ... static�� new ���̵� �޸𸮿� �ö󰡿�
 
 ** ��Ģ: �ڿ��� �޸𸮿� �ø��� ������ �� ���� ���� **
 Ex06_Variable_Scope �� class�� >> ��üȭ(�޸�)(new)�� �÷��� �� �� ���� >> Ex06_Variable_Scope >> new �� ���� ���µ� ���α׷� ���ư�.. ��??
 
 */
///////////////////////////////////////////////////////////////////////////
class Variable {
	int iv; 
	/*
	 1. member field, instance variable
	 2. iv�� ���� ��밡���ұ��? (�޸𸮿� ���� �ö� �����)
	 2.1 Variable v = new Variable(); >> heap ��ü ���� >> ��ü �ȿ� iv ����
	     Variable v2 = new Variable(); >> heap ��ü ���� >> ��ü �ȿ� iv ����
	     
	 3. ����: ������ (����), �ڷḦ ���� ����
	 3.1 ���� : ���� ����, ���� ����, ��ǰ(class)
	 - �����Ǵ� ��ü���� �ٸ� ���� ���� �� �ִ�
	 - �׷��� �ʱ�ȭ�� �ؼ� ���� �������� �ʴ´�.
	 - default ���� ������ �ִ�. (int > 0, double > 0.0 , char > ����'\u0000' , 
	                          boolean > false, String > null, Car > null)
	                          
	 - iv ������ ���� ����: new ��� �����ڸ� ���ؼ� heap Variable �̸��� ��ü�� ��������� ���� �ٷ� ����(�� �ȿ�)
	 
	 
	
	 */
	static int cv;
	/*
	 1. class variable (Ŭ���� ����), �Ϲ������δ� static variable �̶�� �θ��� (��ü�� �����ڿ�)
	 2. ����: ������ ��� �� (�����Ǵ� ��� ��ü�� �����ϴ� �ڿ�)
	 	>> �����Ǵ� ��� ��ü (heap �̶�� ������ ������ ��ü���� �����ϴ� �ڿ�)
	 3. ���ٹ�� 
	 	1. class �̸�. static ������ >> Variable.cv >> why > ��ü�� �����Ǳ� ���� �޸𸮿� �ö󰡴ϱ� �� ���� ����� Ŭ������� �̸��� ������ ����
	 	2. Variable v = new Variable(); >> v.cv
	 	   Variable v2 = new Variable(); >> v2.cv
	 	   >> v.cv == v2.cv (���� �ּҸ� �ٶ󺻴� : static ������ �ּ�)
	 4. ��������
	    Hello.java > javac Hello.java > Hello.class
	    > java.exe Hello ���� �ļ� ����
	    > JVM�� OS ���� �޸𸮸� ���� > �ű⸦ ������(������ ������) > class Loader System�� �м���
	    > Ŭ������ ���� ����(Metadata: ����)�� �о >> class area(method area) �޸𸮿� �÷��� (�� Ŭ������ ���� ������� ������ ���� � �ڿ��� �������..)
	    > �� Ŭ���� �ȿ� static variable �Ǵ� static method �� �ִٸ� 
	    > �� �༮���� class area(method area) ������ �Ҵ��մϴ� 
	    > �׷��� �� �Լ��� �̸��� main() �̶�� ������ ��Ģ�� ���� �����մϴ� (Stack ����) �ڿ� �Ҵ� ..
	    
	      
	 */
	
	
	
	
	
	
	
	void method () {
		int lv=0; // lv: local variable
		
		/*
		 local variable (�Լ� �ȿ�: ���� ���� : ����ϱ� ���� �ݵ�� �ʱ�ȭ �ؾ��Ѵ�)
		 �����ֱ�: �Լ��� ȣ��Ǹ� ���� (stack �޸𸮿� ���� �Ǿ��ٰ� �Լ��� ������(�� �̻� ������ �� ���� ��), �Ǵ� ������ return �Ǹ� ���� �Ҹ��)
		 */
		for (int i = 0 ; i <= 10; i++) {
			/*
			 int i >> block ���� >> , for ���۵Ǹ� ���� .. for ������ �Ҹ�
			 */
			
			
		}
		
	} 
}

/////////////////////////////////////////////////////////////////////////


public class Ex06_Variable_Scope {

	public static void main(String[] args) {
		//� ��ü�� �������� �ʾƿ�
		Variable.cv= 100; //Variable �̶�� Ŭ���� �ȿ� cv ��� ����
		Ex06_Variable_Scope ex06 = new Ex06_Variable_Scope();
		//ex06.
		Variable v = new Variable () ;	//v2
	}
	
	public void method() {
	System.out.println("�� �Ϲ��Լ�");
	}
}
