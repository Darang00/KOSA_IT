/*
�ڵ��� ������ �Դϴ�.
��������� ������ �ڵ����� �ȷ��� �մϴ�.
���� �ڵ����� �⺻ ����� �� �� �� �ְ� ....  �������� ���� �ɼ��� ���� �� �� �ֽ��ϴ�.
�ڵ����� �⺻��
���� ���� 4�� , �ڵ����� ���� �⺻�� red  4���� �⺻ �Դϴ�
�׷��� ����
���� ������ ���� �����ϰ�  �ڵ����� ���� �⺻�� red  ���� �� �� �ְ�
���� ������ �⺻���� �ϰ� �ڵ����� ���� ���� �����ϰ�
���� ������ �ڵ����� ���� ��� ���� �Ͽ� ���� ������ �� �ֽ��ϴ�

�ڵ��� ����
1. �⺻ ���  
2. �ɼ� : �� ���� , �ڵ����� ���� �⺻
3. �ɼ� : �ڵ����� ���� ���� , �� �⺻
4. �ɼ� : �ڵ����� ���� ���� , �� ����

*/




// ������(member field �ʱ�ȭ) ����
// �������� ������ ����(overloading) �����ϴ� (�������� �ɼ��� ���� �� �ִ�)

class Car6 {
	String colour;
	int door;
	
	public Car6() { //default
		door = 4;
		colour = "red";
		
	}
	
	public Car6(int d) { //���� ����
		door = d;
		colour = "red";
		
	}
	
	public Car6(String s) { //���� ����
		door = 4;
		colour = s;
	}
	
	public Car6(int d, String s) { //���� ����
		door = d;
		colour = s;
	}
	public void carInfoPrint() {
		System.out.println(door+"," + colour);
	}
}
	



/////////////////////////////////////////
public class Ex16_Constructor_Quiz {

	public static void main(String[] args) {
		
		Car6 car6 = new Car6() ;
		//car6.carInfoPrint();
		Car6 ca1 = new Car6(6);
		 Car6 ca = new Car6("blue");
		 ca.carInfoPrint();
		
		

	}

}
