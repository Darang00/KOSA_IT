import kr.or.kosa.Emp;

class Test2{
	int x = 100;
	void print() {
		System.out.println("�θ��Լ� Test2");
	}
	void print(String string) {
		// TODO Auto-generated method stub
		
	}
}

class Test3 extends Test2{
	int x = 300; //�θ� �����ϱ� (c#) // ��� ���� ������
	
	// ������ (����0)
	@Override
	void print(String string) {
		System.out.println("�ڽ��� �θ��� �Լ��� ������");
		
	}
	
	void println(String str) { //overloading
		System.out.println("���� �����ε� �Լ��� : " + str);}
}

public class Ex05_Inherit_Override {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.x);
		
		t3.print();
		t3.print("�����ε�");
		
		
		Emp emp = new Emp(1000, "ȫ�浿");
		System.out.println(emp);
		System.out.println(emp.toString());
		
		//emp ����ϸ� ����� ... emp.toString() ������ ȿ��
		//toString()�� Object �� �ڿ� ... �ּҰ� return
		
		//toString() ������ �ߴٸ� ����� �����ǵ� ���� ���
		//Emp [empno = 1000, ename = ȫ�浿]
		//Emp [empno = 1000, ename = ȫ�浿]
		
		//JAVA API�����ϴ� ������ Ŭ������ ObjectŬ������ toString() �������ϰ� �ִ�.
		
		
		
		

	}

}
