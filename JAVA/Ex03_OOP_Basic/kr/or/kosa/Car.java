package kr.or.kosa;

//��Ģ������ (�ǹ�) ....
//1. ĸ��ȭ (member field)
//2. ĸ��ȭ (���������� ó��: setter, getter �Լ�)
//3. �̷� �����͸� ���� �� �ִ� Ŭ���� (VO, DTO, DOMAIN �̶�� �θ���) >> MVC ���� 

public class Car {
	private int window;
	private int speed;
	
	//�ʿ信 ���� (setter ��) >> write
	//�ʿ信 ���� (getter ��) >> read
	//�ʿ信 ���� (setter, getter �� ��) >> write, read
	
	public int getWindow() { //getter �Լ�
		return window;
	}
	
	public void setWindow (int data) { // setWindow(int window) { this...}
		window = data; // setter �Լ�
		
	}

	//1. IDA ���
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//2. Lombok �̶�
	//Java ���̺귯���� �ݺ��Ǵ� getter, setter, toString..
	//���� �ݺ� �޼��� �ۼ� �ڵ带 �ٿ��ִ� �ڵ� ���̾�Ʈ ���̺귯�� �̴�.
	//@Getter
	//@Setter
	//�����Ϸ����� �ڵ����� setter, getter �Լ� ����� �ּ���...
	
	
	//�ʿ��ϴٸ� ������ �Լ��� ����
	//speed�� 10�� �ø��ų� �����ϴ� ����� ���弼��
	//speedUp(), speedDown()
	//�Ϲ������� �Ʒ�ó�� ������ �Լ��� ����� ���ٴ� read, write �� �Ѵٸ� 
	//setter, getter �� ���ؼ� �����ϴ� ���� �Ϲ���
	
	
	public void speedUp() {
		speed+=10; // speed = speed +10;
		
	}
	
	public void speedDown() {
		//����...
		if (speed >0) {
			speed-=10;
			
		}		
		else {
			speed = 0;
		}
		
	}
	

}
