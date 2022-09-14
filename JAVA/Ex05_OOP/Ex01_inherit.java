/*
OOP(��ü���� ���) Ư¡
 : �������� �������� ����(Ŭ����)���� ����� �� �������� �����ؼ� �ϳ��� ū ��ǰ�� ����� ���α׷���. *** ���뼺 ***
 1. ���
 2. ĸ��ȭ (����ȭ)>> private
 3. ������ (��Ӱ��迡�� �θ� Ÿ���� �ڽ� Ÿ���� �ּҸ� ���� �� �ִ�) >> ��ӿ� ����

���
 java: child extends Base
 c#  : child : Base 
 
Ư¡
 1. ���� ����� �޸� ���� ���(��: �Ҿƹ����� ������ �����ְ� �ƺ��� ������ �����ִ� ���)�� �Ұ����ϴ� (���ϻ���� ���� -> ������ ��� ����)
 2. ���� ��� (������ ���) ���� (�������� Ŭ���� ���)
 3. ���� ��� ���� (interface)
 
���
1. ������ �ǹ�: *** ���뼺 ***
2. ����: �ʱ⿡ ���� ����� ���� ��� (�ʱ⿡ ������ �� �ð��� ���� ���� ���)
3. ���뼺 >> ���� >> �ð� (�������� ���赵 ���� ... �θ�. �ڽ� ����)

��Ӱ��迡����
�θ���� �޸𸮿� �ö󰣴� .... �ڽ� ������

GrandFather >> Father >> Child <heap �޸� 3���� ��ü �� �������>
 
 */

// ����ڰ� (������)�� ����� ��� Ŭ������ default > Object Ŭ���� ���
// class Car extends Object ��� �ؼ�
// Object  �� ��� Ŭ������ rooot(�ֻ���) : ��� Ŭ������ �θ�

class Car { // extends Object (�ᵵ �ǰ� �Ƚᵵ �ȴ�)
	
}

class GrandFather extends Object {
	public int gmoney = 5000;
	private int pmoney = 10000; // �տ� �����ڰ� private �̸� ��Ӱ��迩�� ������ �� ���� .. 
	                            // Ŭ���� ���ο���  public �̳� private ��� ���� ���� > public �Լ� �̿��ؼ� ���������� ���� 
	public GrandFather() {
		System.out.println("GrandFather");
	}
}

class Father extends GrandFather { // �Ҿƹ��� ���� �ƹ����� �� �� �ִ�.
	public int fmoney = 3000;
	public Father() {
		System.out.println("Father");
	}
}

class Child extends Father { // 
	public int cmoney = 1000;
	public Child() {
		System.out.println("Chile");
	}
}

public class Ex01_inherit {

	public static void main(String[] args) {
		
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);

		Car car = new Car();
	}
}