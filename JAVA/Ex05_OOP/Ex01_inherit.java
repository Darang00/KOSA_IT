/*
OOP(객체지향 언어) 특징
 : 여러개의 나누어진 조각(클래스)들을 만들고 그 조각들을 조립해서 하나의 큰 제품을 만드는 프로그래밍. *** 재사용성 ***
 1. 상속
 2. 캡슐화 (은닉화)>> private
 3. 다형성 (상속관계에서 부모 타입이 자식 타입의 주소를 가질 수 있다) >> 상속에 의해

상속
 java: child extends Base
 c#  : child : Base 
 
특징
 1. 현실 세계와 달리 다중 상속(예: 할아버지도 나한테 물려주고 아빠도 나한테 물려주는 상속)이 불가능하다 (단일상속은 가능 -> 계층적 상속 가능)
 2. 단일 상속 (계층적 상속) 가능 (여러개의 클래스 상속)
 3. 다중 상속 지원 (interface)
 
상속
1. 진정한 의미: *** 재사용성 ***
2. 단점: 초기에 설계 비용이 많이 든다 (초기에 설계할 때 시간과 돈이 많이 든다)
3. 재사용성 >> 설계 >> 시간 (여러개의 설계도 분할 ... 부모. 자식 관계)

상속관계에서는
부모부터 메모리에 올라간다 .... 자식 순으로

GrandFather >> Father >> Child <heap 메모리 3개의 객체 다 만들어짐>
 
 */

// 사용자가 (개발자)가 만드는 모든 클래스는 default > Object 클래스 상속
// class Car extends Object 라고 해석
// Object  는 모든 클래스의 rooot(최상위) : 모든 클래스의 부모

class Car { // extends Object (써도 되고 안써도 된다)
	
}

class GrandFather extends Object {
	public int gmoney = 5000;
	private int pmoney = 10000; // 앞에 접근자가 private 이면 상속관계여도 접근할 수 없다 .. 
	                            // 클래스 내부에선  public 이나 private 모두 접근 가능 > public 함수 이용해서 간접적으로 접근 
	public GrandFather() {
		System.out.println("GrandFather");
	}
}

class Father extends GrandFather { // 할아버지 돈을 아버지가 쓸 수 있다.
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