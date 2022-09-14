/*
 ��Ģ: ��ü�� ���� �� �����ڴ� 1���� ȣ�� ����(new Car() or new Car(10)...)
 
 this(��ü) : �������� �����ڸ� ȣ�� ����
 
 �ڵ差�� ����
 */

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar() { //default
		this("red", "auto", 2); // �����ڸ� ȣ���ϴ� this �̿����ϸ� �ݺ��Ǵ� �ڵ带 ���� �� �ִ�.
		this.color = "red";
		this.geartype = "auto";
		this.door = 2;
		System.out.println("default...");
		
	}
	
	Zcar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading ...");
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
		
	}
}
/////////////////////////////////////////////
/*
 ���� �ڵ��� ������ �� 3���� �ɼ� ������
 1. �⺻�ɼ�: �� ���� "red", �� ���� 1��, ���Ÿ�� "auto"
 2. �ɼ�) �� ���� "���ð���", �� ���� ���氡��, ���Ÿ�� "auto"
 3. �ɼ�) �� ���� "���ð���", �� ���� ���ð���, ���Ÿ�� "���ð���"
 */
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){
		this("red", 1);// �⺻�ɼ� (red, 1, auto)
		System.out.println("default...");
	}
	
	Zcar2(String color, int door){
		this(color, door, "auto"); // �ɼ�) color, door ���� (geartype: default "auto")
		System.out.println("overloading parameter 2��..");
	}
	
	Zcar2(String color, int door, String geartype) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		// �ɼ�) color, door, geartype �� ���ð���
		System.out.println("overloading parameter 3��");
	}
	
	void print() {
		System.out.println(this.color + "," + this.geartype + "," + this.door);
	
}

}






public  class Ex20_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zcar zcar = new Zcar();
		// Zcar zcar2 = new Zcar (null. null. 0);
		Zcar zcar = new Zcar();
		zcar.print();
		
		Zcar zcar2 = new Zcar("blue", "auto", 0);
		
	}

}

