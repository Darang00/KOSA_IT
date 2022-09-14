/*
 게임: 유닛(Unit)
 
 unit들의 공통점: 이동하는 좌표가 있다. 이동할 수 있다. 멈춘다. : 추상화, 일반화 되어 있다.
 unit : 이동방법이 다르다(이동 방법은 unit 마다 별도의 구현을 통해서 강제)

 abstract class Unit{
 	abstract void move();
 }
 
 
 */
abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("Unit stop");
	}
	
	// 이동의 방식이 서로 다르기 때문에 강제구현 -> 다름을 구현
	abstract void move(int x, int y); // 실행블럭을 만들지 않는다 >> 추상함수
}


//Tank
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Tank moves with sound :" + this.x + " , " + this.y);
		
	}
	// 필요하다면 Tank만의 구체화되고 특수화된 내용을 구현
	void changeMode() {
		System.out.println("탱크모드 변환");
	}
	
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Marine moves :" + this.x + " , " + this.y);
		
	}
	
	// 특수화, 구체화
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
	
	// 특수화, 구체화 된 내용
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
			System.out.println("true"); // 결과
		}else {
			System.out.println("false");
		}
		
		//1. 탱크 3대를 만들고 같은 좌표(600, 800)로 이동 시키세요 (같은 타입의.. hint: 전자제품 매장 buy(Product n), cart Product[] cart
		Tank[] tanklist = {new Tank(), new Tank(), new Tank()};
		for(Tank t : tanklist) {
			t.move(600, 800);
		}
		
		//2. 여러개의 (Tank 1대, Marine 1사람, DropShip 1대)를 생성하고 같은 좌표로 이동
		Unit[] unitlist = {new Tank(), new Marine(), new DropShip()};
		// 단점: 각 unit 구체화, 특수화 자원 접근 불가
		for(Unit unit: unitlist) {
			unit.move(666, 400);
		}
		
		
		

	}

}
