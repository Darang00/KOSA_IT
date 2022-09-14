/*
 this: ��ü �ڽ��� ����Ű�� this(this.empno, this.ename)
 this: �����ڸ� ȣ���ϴ� this (this(100, "red"))
 
 
 ��Ӱ���
 �θ�, �ڽ�
 
 super(���� �ڽ��� �θ� ������ �� �ִ� �ּҰ�) : ��Ӱ��迡���� �θ� ������ �� ���� (super �θ�ü�� �ּҰ�)
 
 1. super >> ��� ���Կ��� �θ��ڿ��� ����
 2. super >> ��� ���迡�� �θ��� �����ڸ� ȣ�� (���������)
 
 Tip)
 C# : base()
 Java : super()
 
 */

class Base{
	String basename;
	Base() {
		System.out.println("Base �⺻ ������ �Լ�");
	}
	Base(String basename) {
		this.basename = basename;
		System.out.println("basename : " + this.basename);
}
	
	void method() {
		System.out.println("�θ� method");
		}
	}

class Derived extends Base{
	String dname;
	Derived() {
		// super(); default�� �θ��ϱ� ���� ����
		System.out.println("Derived �⺻������ �Լ�");
	}
	Derived(String dname) {
		
		// �θ��� ������ ȣ�� super
		super(dname); //�θ��ʿ� �����ڸ� ȣ���� �� �ִ�.
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	
	@Override
	void method() {
		System.out.println("�θ��ڿ� ������");
	}
	//����� �θ���� �׸����� ... (�ڿ��� �׸�����)
	//������ ��� ... super
	void pmethod() {
		super.method(); //�θ� �޼���
		//������ ���¿��� �θ� �ڿ��� �θ� �� �ִ� ������ ��� : super
	}
}


public class Ex06_Inherit_super {

	public static void main(String[] args) {
		Derived d = new Derived("ȫ�浿");
		d.method(); //�ڽ��� �����Ǹ� ���� ������ �θ� �ڿ�
		
		d.pmethod();
		
	}

}
