/*
 ����: ����(Unit)
 
 unit���� ������: �̵��ϴ� ��ǥ�� �ִ�. �̵��� �� �ִ�. �����. : �߻�ȭ, �Ϲ�ȭ �Ǿ� �ִ�.
 unit : �̵������ �ٸ���(�̵� ����� unit ���� ������ ������ ���ؼ� ����)

 abstract class Unit{
 	abstract void move();
 }
 
 
 */
abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	// �̵��� ����� ���� �ٸ��� ������ �������� -> �ٸ��� ����
	abstract void move(int x, int y); // ������� ������ �ʴ´� >> �߻��Լ�
}


//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank moves with sound :" + this.x + " , " + this.y);
		
	}
	// �ʿ��ϴٸ� Tank���� ��üȭ�ǰ� Ư��ȭ�� ������ ����
	void changeMode() {
		System.out.println("��ũ��� ��ȯ");
	}
	
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine moves :" + this.x + " , " + this.y);
		
	}
	
	// Ư��ȭ, ��üȭ
	void stimpack() {
		System.out.println("stim pack function");
	}
}
class DropShip extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("DropShip moves to the sky :" + this.x + " , " + this.y);
		
	}
	
	// Ư��ȭ, ��üȭ �� ����
	void load() {
		System.out.println("Unit load");
	}
	void unload() {
		System.out.println("Unit Unload");
	}
	
}	
	


public class Ex02_abstract_class {

	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(500, 200);
		tank.stop();
		tank.changeMode();
		
		Marine marine = new Marine();
		marine.move(200, 300);
		marine.stop();
		marine.stimpack();
		
		if(tank instanceof Unit) { // java, javascript, (typeof)
			System.out.println("true"); // ���
		}else {
			System.out.println("false");
		}
		
		//1. ��ũ 3�븦 ����� ���� ��ǥ(600, 800)�� �̵� ��Ű���� (���� Ÿ����.. hint: ������ǰ ���� buy(Product n), cart Product[] cart
		Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
		for(Tank t : tanklist) {
			t.move(600, 800);
		}
		
		//2. �������� (Tank 1��, Marine 1���, DropShip 1��)�� �����ϰ� ���� ��ǥ�� �̵�
		Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
		// ����: �� unit ��üȭ, Ư��ȭ �ڿ� ���� �Ұ�
		for(Unit unit: unitlist) {
			unit.move(666, 400);
		}
		
		
		

	}

}
