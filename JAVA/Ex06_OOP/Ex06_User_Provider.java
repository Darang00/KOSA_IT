/*
user(�����) <> provider(������)
class A{}
class B{}
����: A�� B�� ����մϴ�

1. ��� : A extends B
2. ���� : A��� Ŭ������ Member field�� B�� ��� // class A{B b;}
   2.1 �κ��� ����
   2.2 ��ü
   
public class B{}
public class A{
	public int i; // instance variable, member field  
	public B b;   // A�� B�� ����մϴ� (����)
	public A() {
		b = new B(); // �����ڸ� ���ؼ� �ʱ�ȭ(�ּҰ�)
	}
}   
 >> main �Լ�
 A a = new A();
 a.b.�ڿ�;
 
 >> ���԰��� ����
 >> B�� �������� ���� �Ұ��� >> A��� ��ü�� ��������� B�� ���� �����ȴ�.
 >> A a = new A(); �ؾ߸� B��ü�� �����ȴ�.
 >> A, B ���� ��� ����ü (��ü ���� ����) ***
 >> �ڵ���(A)�� ����(B), ��Ʈ��(A)�� CPU(B)
 --------------------------------------------------------------------------------------
 public class B{}
 public class A{
 	public int i;
 	public B b;  // A�� B�� ����Ѵ�
 	public A() {}
 	
 	// method
 	 void m(B b){
 	 this.b = b;
 	 }
 }
 >> main�Լ� ����
 >> A a = new A();
 >> B b = new B();
 >> a.m(b);
 >> ���� ����� �ƴϴ�. ***
 >> �б�(A)&�л�(B), ��Ʈ��(A)&���콺(B) >> (�κ�����)
 
class A{}
class B{}
����: A�� B�� ����մϴ�
     A�� B�� �����մϴ�  (����) >> B�� member field�� ����ϴ� ��
 
 
 */


interface Icall{
	void m();
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m() ������");
	}	
}

class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall �������̽��� m() ������");	
	}	
}

// �������� ���α׷��� ��� (interface �뼼) >> �������ʿ� >> ���� ���� ���� ������ ��
// >>> �����ϰ�... >>> interface�� �θ�� �ΰ� �����ϵ���

class C{
	void method(Icall ic) { // Icall�� �����ϴ� ��� ��ü�� �ּҴ� �� �� �ִ�.
		ic.m();
		
	}
	/*
	 * Ȯ�强, ��ȭ�� ����...
	 void method(D d){}
	 void m(F f) {}
	 */
}

public class Ex06_User_Provider {

	public static void main(String[] args) {
		
		C c = new C();
		D d = new D(); // D implements Icall
		F f = new F(); // F implements Icall
		c.method(d); // c�ּҷ� ���� method�� parameter ic�� DŸ���� d�� �ִ´�. >> ic�ּҰ��� m()�� d�� �ִµ� ������ �����ϱ� DŬ������ ���� D�� �޼ҵ��� �����θ� ����
		c.method(f);
		
		
		

	}

}
