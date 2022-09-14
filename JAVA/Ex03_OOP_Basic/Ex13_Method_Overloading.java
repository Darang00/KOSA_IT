/*
 OOP ��ü ���� ���α׷���  (�������� ����(���赵)���� ���� �����ϴ� ����)
 >> �������� ���赵�� ��Ȱ�� �ϴ� ����� �˾ƾ� ��
  
  1. ��� (���뼺)
  2. ĸ��ȭ (����ȭ) :private ... setter, getter��� �Լ��� ����ؼ� ���� �Ҵ��� ���� ���� �Ҵ��� ���ؼ� data�� ��ȣ
  3. ������ : �ϳ��� Ÿ������ �������� ��ü�� �ּҸ� ���� �� �ִ� ��
  
  
  >> method overloading (�����ε�)
  1. �ϳ��� �̸����� �������� ����� ���� �Լ�
  System.out.println() >> println() �Լ��� �̸��� �Ѱ��ε� ������� ������
  1. �����ε��� ���� ���� ������
  2. ���ϰ� �ƿ��϶�� ... �����ڰ� �����ڸ� ��� (�����ڰ� ���ϰ� �Ϸ���)
  3. �����ε��� ������� �ʾƵ� �������� �ʴ´� ... 
  
  ����) �Լ� �̸��� ���� parameter [����] �� [Ÿ��]�� �ٸ��� �ϸ�
  ����)
  1. �Լ� �̸��� ����
  2. parameter�� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�
  3. return type�� �����ε��� �Ǵ� ������ �ƴϴ�
  4. parameter�� ������ �ٸ��� ����(����)  
 
 */
class Human{
	String name;
	int age;
	
}

class OverTest{ //Ŭ���� ����
	int add(int i) {
		return 100+ i;
	}
	
	//int add(int s) {�̸� �浹}
	
	//}
	int add(int i, int j) {
		System.out.println("�����ε� : " + i + "," + j);
		return i + j;
	}
	
	String add(String s) {
		System.out.println("�����ε� : " + s);
		return "hello" + s;
	}
	
	String add(String s, int i) {
		return "�����ε�";
	}
	String add(int i, String s) { //������ �ٸ��� ���� ....
		return "�����ε� as well";
	}
	
	void add(Human human) { //�����ε� ���� //���� human���� Human Ÿ���� ��ü �ּҰ� ���;� �Ѵ�
		 human.name = "ȫ�浿";
		 human.age = 100;
		 System.out.println(human.name + "," + human.age);
	}
	
}


public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("A"); //�ڵ����� parameter String �༮ ȣ��
		System.out.println('a'); //�ڵ����� parameter char �༮ ȣ��
		
		//System �����
		//memory System sys = new System();
		
		// System.out.
		
		//System.out.println
		/*
		 System.out.println();
		 System.out.printlnString("A");
		 System.out.printlnChar('a');
		 ����� �Լ��� �ϱ��ؼ� ��� ..... �̸��� �� Ʋ���ϱ�
		 
		 
		 
		 */
		OverTest ot = new OverTest();
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(200,300);
		System.out.println(result);
	}

}
