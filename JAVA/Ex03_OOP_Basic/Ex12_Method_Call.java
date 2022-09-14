/*
 �Լ� ���� parameter ���� ���� , �ּ� ����
 void m(int x) {}  >>> x������ ���� �޴´�
 int y = 200;
 ȣ�� m(y);
 
 y = 1000; ����....
 
 call by value: ȣ���� �� �� �����Ѵ�
 ------------------------------------------
 
 void m(Car c) {c.color = "red" ;}   >>> ���� c�� �ּҰ��� �޴´�
 
 Car c2 = new Car() ; 
 ȣ�� m2(c2); //���� Ÿ���� �ּҰ��� �����Ѵ� (Today Point)
 
 call by ref: �ּҰ� ����
 
 */


class Data {
	int i;
}

public class Ex12_Method_Call {
	static void scall(Data sdata) {// default static		
		System.out.println("�Լ�: " + sdata.i);
		sdata.i = 111; //0xA���� 111�� �ٲ۴�
		
	}
	
	static void vcall (int x) { //default static
		System.out.println("before x :" + x);
		x = 8888;
		System.out.println("after x : " + x);
		
	}
	

	public static void main(String[] args) {
		Data d = new Data(); // d�� �ּҰ� 0xA...
		d.i = 100;
		System.out.println("d.i : " + d.i);
		
		scall(d); //�ּҰ� ���� (0xA)
		
		System.out.println("after d.i : " + d.i); // ���: 111
		////////////////////////
		vcall(d.i); //��(100)�� ����
		System.out.println("d.i : " + d.i); /// ���: 100(���� ������� �ʾƿ�)

	}

}
