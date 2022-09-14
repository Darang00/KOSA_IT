
//인터페이스 설계
//~을 할 수 있는(수리할 수 있는)
interface Irepairable{}

class Unit2{
	int hitpoint; // 기본 에너지
	final int MAX_HP; // 최대에너지
	// Unit2(){}
	Unit2(int hp){
		this.MAX_HP = hp;
	}
}

// 지상유닛, 공중유닛, 건물

// 지상유닛
class GroundUnit extends Unit2{
	public GroundUnit(int hp) {
		super(hp);
	}
} 

// 공중유닛
class AirUnit extends Unit2 {

	public AirUnit(int hp) {
		super(hp);
	}	
}

// 건물
class CommandCenter implements Irepairable{}

// Tank
class Tank2 extends GroundUnit implements Irepairable{

	public Tank2() {
		super(50); // super 에 50 줘서 Tank2 의 생성자에 매개변수 값 할당 안해도 된다
		this.hitpoint = this.MAX_HP;
	}
	
	@Override
	public String toString() {
		return "Tank2";
	}
	
	// SCV 구체화, 특수화된 고유한 기능
	// 수리하다(reapir)
	// Tank2, SCV
	
	// 전자제품 매장에서 제품이 1000개 있으면 > buy라는 함수를 1000개 생성(X)
	// 다형성 부모타입 buy(Product p) 
	
	// 문제점) 부모는 찾았는데 : GroundUnit (Tank2, Marine2, SCV)
	// Marine2는 repair의 대상이 아니에요
	// void repair (Unit2 unit) >> Tank2, Marine2(X.. repair 대상이 아님), SCV
	// void repair(GroundUnit unit) >> Tank2, Marine2(X), SCV
	
	//고민??
	//** CommandCenter repair 대상이야
	// Tank2, Marine2, SCV, CommandCenter 연결고리(연관성)
	
	// interface Irepairable{} 연관성 같은 부모..... 
	//class SCV extends GroundUnit implements Irepairable
	//class Tank2 extends GroundUnit implements Irepairable
	//class CommandCenter implements Irepairable{}
	
	//단 부모자원만 접근 가능
	//단 재정의된 자원 접근
	
	//1. void repair(Irepairable repairunit) >> Tank2, CommandCenter, SCV 올 수 있다.
	// 저 세개는 Irepairable의 자식타입이기때문에..
	// repair하는 방법이 Tank2, SCV >>는 hitpoint를 건드려야한다 >> scv.hitpoint +=5;
	// repair CommandCenter 다른 방법
	void repair(Irepairable repairunit) {
		// repairunit 통해서 Unit2 에 접근할 수 있는 방법
		
		// 답) Tank2, SCV만 오면 > Unit2
//		Unit2 unit = (Unit2)repairunit; //Down
//		unit.hitpoint+=5;
//		
		// CommandCenter > Unit2와 연관성이 없다
		// Unit2 unit = (Unit2)repairunit; (예외)
		
		// repair(Irepairable repairunit) 그대로 사용
		// 비교 (타입) >> instanceof >> type 질문
		
		if (repairunit instanceof Unit2) { //repairunit이라는 참조변수가 Unit2라는 클래스의 타입이냐?
			// Tank2, SCV
			Unit2 unit = (Unit2)repairunit;
			if (unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; // 완충
			}
		} else{
			//다른 객체
			System.out.println("다른 충전방식을 통해서 repair  제공");
		}
	}
	
	
	/*
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) { //둘이 같지 않다는 것은 공격을 당했다는 의미
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


// SCV 광물캐고, 치료
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
		//repairunit  통해서 Unit2 접근 
		
		//답) Tank2 , Scv 만 오면 > Unit2
		//Unit2 unit = (Unit2)repairunit; //Down
		//unit.hitpoint+=5;
		
		//CommandCenter  > Unit2 연관성이 없다
		//Unit2 unit = (Unit2)repairunit; (예외) 
		
		//repair(Irepairable repairunit) 사용
		//비교 (타입) >> instanceof >> 타입 질문
		
		if(repairunit instanceof Unit2) {
			//Tank2 , Scv
			Unit2 unit = (Unit2)repairunit;
			if(unit.hitpoint != unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP; //완충
			}
		}else {
			//다른 객체
			System.out.println("다른 충전방식을 통해서 repair 제공 ");
		}
	}



public class Ex15_Interface_Poly {
	public void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		//전투
		tank.hitpoint-=20;
		System.out.println("탱크 : " + tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		
		System.out.println("탱크 수리 완료 : " + tank.hitpoint);
		
		scv.hitpoint-=30;
		System.out.println("scv : " + scv.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(scv);
		System.out.println("scv 수리 완료 : " + scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);

	}

}
}