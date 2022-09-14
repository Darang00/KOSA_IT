
//�������̽� ����
//~�� �� �� �ִ�(������ �� �ִ�)
interface Irepairable{}

class Unit2{
	int hitpoint; // �⺻ ������
	final int MAX_HP; // �ִ뿡����
	// Unit2(){}
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

// ��������, ��������, �ǹ�

// ��������
class GroundUnit extends Unit2{
	public GroundUnit(int hp) {
		super(hp);
	}
} 

// ��������
class AirUnit extends Unit2 {

	public AirUnit(int hp) {
		super(hp);
	}	
}

// �ǹ�
class CommandCenter implements Irepairable{}

// Tank
class Tank2 extends GroundUnit implements Irepairable{

	public Tank2() {
		super(50); // super �� 50 �༭ Tank2 �� �����ڿ� �Ű����� �� �Ҵ� ���ص� �ȴ�
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank2";
	}
	
	// SCV ��üȭ, Ư��ȭ�� ������ ���
	// �����ϴ�(reapir)
	// Tank2, SCV
	
	// ������ǰ ���忡�� ��ǰ�� 1000�� ������ > buy��� �Լ��� 1000�� ����(X)
	// ������ �θ�Ÿ�� buy(Product p) 
	
	// ������) �θ�� ã�Ҵµ� : GroundUnit (Tank2, Marine2, SCV)
	// Marine2�� repair�� ����� �ƴϿ���
	// void repair (Unit2 unit) >> Tank2, Marine2(X.. repair ����� �ƴ�), SCV
	// void repair(GroundUnit unit) >> Tank2, Marine2(X), SCV
	
	//���??
	//** CommandCenter repair ����̾�
	// Tank2, Marine2, SCV, CommandCenter �����(������)
	
	// interface Irepairable{} ������ ���� �θ�..... 
	//class SCV extends GroundUnit implements Irepairable
	//class Tank2 extends GroundUnit implements Irepairable
	//class CommandCenter implements Irepairable{}
	
	//�� �θ��ڿ��� ���� ����
	//�� �����ǵ� �ڿ� ����
	
	//1. void repair(Irepairable repairunit) >> Tank2, CommandCenter, SCV �� �� �ִ�.
	// �� ������ Irepairable�� �ڽ�Ÿ���̱⶧����..
	// repair�ϴ� ����� Tank2, SCV >>�� hitpoint�� �ǵ�����Ѵ� >> scv.hitpoint +=5;
	// repair CommandCenter �ٸ� ���
	void repair(Irepairable repairunit) {
		// repairunit ���ؼ� Unit2 �� ������ �� �ִ� ���
		
		// ��) Tank2, SCV�� ���� > Unit2
//		Unit2 unit = (Unit2)repairunit; //Down
//		unit.hitpoint+=5;
//		
		// CommandCenter > Unit2�� �������� ����
		// Unit2 unit = (Unit2)repairunit; (����)
		
		// repair(Irepairable repairunit) �״�� ���
		// �� (Ÿ��) >> instanceof >> type ����
		
		if (repairunit instanceof Unit2) { //repairunit�̶�� ���������� Unit2��� Ŭ������ Ÿ���̳�?
			// Tank2, SCV
			Unit2 unit = (Unit2)repairunit;
			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; // ����
			}
		} else{
			//�ٸ� ��ü
			System.out.println("�ٸ� ��������� ���ؼ� repair  ����");
		}
	}
	
	
	/*
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) { //���� ���� �ʴٴ� ���� ������ ���ߴٴ� �ǹ�
			tank.hitpoint+=5;
		}
	}
	void reapir(SCV scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint +=5;
		}
	} */
	
}

class Marine2 extends GroundUnit{

	public Marine2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Marine2";
	}
	
}


// SCV ����ĳ��, ġ��
class SCV extends GroundUnit implements Irepairable{
	public SCV() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "SCV";
	}

	void repair(Irepairable repairunit) {
		//repairunit  ���ؼ� Unit2 ���� 
		
		//��) Tank2 , Scv �� ���� > Unit2
		//Unit2 unit = (Unit2)repairunit; //Down
		//unit.hitpoint+=5;
		
		//CommandCenter  > Unit2 �������� ����
		//Unit2 unit = (Unit2)repairunit; (����) 
		
		//repair(Irepairable repairunit) ���
		//�� (Ÿ��) >> instanceof >> Ÿ�� ����
		
		if(repairunit instanceof Unit2) {
			//Tank2 , Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; //����
			}
		}else {
			//�ٸ� ��ü
			System.out.println("�ٸ� ��������� ���ؼ� repair ���� ");
		}
	}



public class Ex15_Interface_Poly {
	public void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		//����
		tank.hitpoint-=20;
		System.out.println("��ũ : " + tank.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(tank);
		
		System.out.println("��ũ ���� �Ϸ� : " + tank.hitpoint);
		
		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("Scv ���� ��û");
		scv.repair(scv);
		System.out.println("scv ���� �Ϸ� : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);

	}

}
}