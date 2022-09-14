/*
 추상 클래스
 >> 미완성 클래스(설계도)
 1. 완성된 코드 + 미완성 코드
 2. 완성(함수) 실행블럭이 있는 함수 + 미완성(함수) 실행 블럭이 없는 함수 >> public void run(); 실행블럭이 없다!
 원래 함수) public void run(){실행블럭};
 3. 완성된 클래스 (new 가능) - 미완성 클래스 (스스로 객체 생성 불가)
 
 설계자 입장에서
 >> 의도 >> 반드시 재정의 해라 >> 강제적 구현을 목적으로 (믿지 못하니까)

 */
class Car{
	void run() {} //{실행블럭 안에 구문이 없어도: 실행블럭만 있으면 완성된 코드}
}

class Hcar extends Car{
	//믿음
	@Override
	void run() {System.out.println("재정의");}
}
// Car 만든 사람의 의도: run() 함수를 재정의해서 내용을 바꿔라
// 그러나 강제가 없어요 Hcar 만드는 사람의 의무사항은 아니다...
// 위 코드는 강제성이 없다

abstract class Abclass{ //클래스 안에 최소 1개 이상의 추상 함수(메소드)를 가지고 있는 클래스
	// 완성된 코드
	int pos; 
	void run() {
		pos++;
	}
	
	//미완성 코드 추가 (미완성 함수: 추상 함수)
	abstract void stop(); // 실행블럭이 없어요 >> 재정의를 강제(override)
}

class Child extends Abclass{

	@Override
	void stop() { // 실행블럭을 만들면 구현(강제적 구현)
		this.pos = 0;
		System.out.println("stop : " + this.pos);
		
	}
	
}

class Child2 extends Abclass{

	@Override
	void stop() { // 실행블럭을 만들면 구현(강제적 구현)
		this.pos = -1;
		System.out.println("stop : " + this.pos);
		
	}
	
}

public class Ex01_abstract_class {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		
		Child2 ch2 = new Child2();
		ch2.stop();
		////////////////////////////////////////
		Abclass ab = ch;  // 다형성 (ch라고 하는 참조변수가 가지고 있는 건 )
		// 상속관계에서 부모 타입의 참조변수가 자식 타입 객체들의 주소를 받을 수 있다.
		// 단, 부모는 자신의 것만 볼 수 있다.
		// 단, 재정의를 통해 자식의 자원을 볼 수 있다.
		ab.run();
		ab.stop(); // 자식 함수를 호출(구현)
		
		
		
		
	}

}
