/*
 �߻�Ŭ������ �������̽�
 
 �߻�Ŭ������ �������̽��� ������
 1. ������ ��ü ������ �Ұ���(new �����ڸ� ��� �Ұ�)
 1.1 �� ���� ������: �߻� Ŭ����(�ϼ� + �̿ϼ�), �������̽� (��� ���� �̿ϼ�)
 
 2. ���
 �߻�Ŭ���� extends ����
 �������̽� implements(����) ���

 class Car extends Abclass{}
 class Car implements Ia{}
 �� �� �߻��ڿ��� ������ �ִ�. >> extends, implements >> ������ ���� ����(������)
 
 �߻�Ŭ������ �������̽��� �ٸ���
 3. �߻�Ŭ������ �ϼ��� �ڵ��� �Ϻθ� ������ �ִ�. �׷��� �������̽��� ��ü�� �̿ϼ�
 3.1 ��Ģ������ Ŭ������ ���߻�� �Ұ�(������ ���). �׷��� �������̽��� >> [���� ����]�� ���� >> ���� ������ 
 >> �������� ���� >> ��� ��Ƽ� ū ��� >> �ʹ� ū ����� ����� ��뼺, ������ ��������
 
 Ia, Ib, Ic
 class Test extends Object implements Ia, Ib, Ic
 Tip) �������̽��� �������̽� ������ ����� ���� (extends) >> ����� ũ�� ���� �� �ִ�.
 
 4. �������̽� (����� ������ �������� �̿ϼ� �߻�(�Լ�) >> JDK (Default��, static ��)
 
 
 �������̽� : ���, ǥ���� ����� ��(��Ģ, �Ծ�)
 ����Ʈ���� ������ �ֻ��� �ܰ�
 �ʱް����ڰ� �������̽��� ������ ���� ����..
 �ʱް����ڴ� ������� �������̽��� ����ϴ� ����� ó��
 �����θ� ������ �ʴ´� ... ��ӿ� ���� ���Ǹ� �ִ�.
 
 �ʱް������� �ü�����
 1. �������̽��� [[[[������]]]] �������� ��������(��� �ڿ��� �θ� �ǹǷ� �������̽��� �θ�Ÿ��)
 2. �������̽��� ���� �������� ���� Ŭ������ �ϳ��� �����ִ� ����� �Ѵ� (���� �θ� ������ �����ν�)
 3. Java API �� ���� (�̸� �������) �������̽��� ����(�������� �ʾƵ�) ��� ����
 4. �������̽� (~able) : �� �� �ִ�, ������ �� �ִ�, 
 5. ��ü�� ����� (��ü�� ������ ����) >> [[[������]]]
 
 **����ǥ�� >> ���� >> ������
 
 interface
 1. ���� �����θ� ������ ���� �ʴ�: ���� ���� ���� : ��Ģ(���)
 �ý��ۿ��� �̵��ϴ� ���� move��� �̸��� ����ϰ� �̵��ÿ��� ��ǥ���� �޾ƾ� �Ѵ�
 >> ���� >> void move(int x,  int y); >> (������ �˾Ƽ�) Ŭ������ �˾Ƽ� ... >> �����Ǹ� ���ؼ� >> ����
 >> Java API �������̽� �����ϰ� �����ϴ� Ŭ���� �� ����
 >> Collection (�����迭) >> Vector, [[ArrayList]], HashSet, [[HashMap]] etc.
 Collection Ŭ������ �� ���� �������̽��� �����ϰ� �ִ� Ŭ����
 
 2. �������
 2.1 ���(final) : [public static final] int VERSION = 1 ; >> int VERSION =1;
                  �����ص� �����Ϸ��� �˾Ƽ� [public static final] ó���Ѵ�
 2.2 �߻��Լ�(method) : [public abstract] void run();   >> void run();
                       �����ϸ� �����Ϸ��� �˾Ƽ� [public abstract] ó���Ѵ�.
                       
 interface Aa{
 	int VERSION = 1;
 	void run();
 	String move(int x, int y);
 }
 
 ����
 interface Aable{}   // �ƹ� �ڿ��� ������ �ʾƵ� �ſ�
 interface Aable{int NUM = 10;}
 interface Aable{void run();}
 
  
  class Test extends Object implements Ia, Ib, Ic {}
  class Test implements Ia, Ib, Ic
 */

interface Ia{
	int AGE =100; // �����̸� �빮�� -> ���  
	//����: [public static final] int AGE  //[public static final]�� default�� ����
	String GENDER = "��";
	//����: public static final String GENDER   //[public static final]�� default�� ����
	String print(); // �߻��ڿ�
	//����: [public abstract] String print();  //[public abstract]�� default�� ����
	void message(String str); // �߻��Լ�
	//����: public abstract void message(String str);   //[public static final]�� default�� ����
}

interface Ib{
	int AGE = 10;
	void info();
	String val(String s);
}

class Test2 extends Object implements Ia{

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}
	
}

class Test3 extends Object implements Ia, Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	} // ���� ����
	
}

public class Ex03_Interface {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		/////////////////////////////////////////////////////////
		Ia ia = t2;  // ** �θ�� �ڽİ�ü�� �ּҸ� ���� �� �ִ�(������) **
		/////////////////////////////////////////////////////////
		ia.message("������"); //�����ǵ� �ڿ�(�ڽ� �Լ�) ȣ��
		System.out.println(ia.GENDER);
		
		////////////////////////////////////////////////////////////////
		Test3 t3 = new Test3();
		Ia ia2 = t3;
		Ib ib2 = t3;
		System.out.println(ia2.GENDER);
		System.out.println(ib2.AGE);
	}

}
