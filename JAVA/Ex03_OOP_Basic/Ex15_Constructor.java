/*
 생성자 함수(constructor)
 1. 함수(특수한 목적)
 2. 목적: (member field 초기화) >> static {}, {초기자 블럭}
 
 3. 일반함수와 다른점
 3.1 함수의 이름이 고정(class 이름과 동일)
 3.2 return type 없어요 (객체 생성과 동시에 호출) (return을 받을 대상이 없다)
 3.3 실행시점 >> new를 통해서 객체가 생성 >> heap이라는 메모리에 공간 생성 >> member field 자리를 잡음 >> 자동으로 생성자 함수 호출
 3.4 return type(x) void >> public void(생략) 클래스 이름 >> public 클래스 이름 () {}
 
 4. Why: [생성되는 객체]마다 [강제적]으로 member field 값을 초기화 할 수 있다. 
 
 class Car {String color;}
 >> 설계도를 만들었어 ... 자동차의 색상은 만들 때 알아서 해
 
 A) 저 무조건 파란색 차를 생성.... 처음부터 파랑색으로 설계해 주세요
 
 class Car {String color="blue"}
 
 B) 저는 차 색상은 제가 알아서 설정할게요
 class Car {String color;} 
 Car car = new Car(); -> (괄호) : 생성자 호출하는 신호. 괄호 안 비어있으면 default
 car.color = "gold";
 
 문제) 이 사람이 깜빡하고 자동차의 색상을 설정하지 않고 출고했다.
  -> null이란 색상(없는 색상)
  
  >> 차량을 만들 때 무조건 색상을 입력하게 할 수 있는 방법?
  >> 함수 ...., {초기자블럭} -> 강제성이 없거나 또는 입력값을 강제하지 못해요
  
 5. 생성자 함수(.... overloading 기법 사용 가능)
 
 6. 생성자 오버로딩을 통해서 다양한 강제사항 구현 ... **********
 
 7. 생성자(함수)를 쓰는 가장 중요한 목적은 [강제적] 초기화(member field)*********
  
 
 */

class Car {
	String carname="포니";
	// 당신이 만약 Car 설계도를 만들 때...
	// 컴파일러가 알아서 함수를 생성합니다...
	// 생성자 함수
	// public Car() {} 컴파일러가 자동으로 생산....
	
	// 개발자가 직접 구현
	public Car() {// 자동호출
		System.out.println("기본생성자 호츨^^");
		carname = "내마음";
		
		
	}
	
}

class Car4{
	String carname;
	//생략되어 있다
	//눈에보이지 않지만 public이면서 클래스 이름과 똑같은 생성자 함수가 생략되어 있다 (public )
}

class Car2{
	String carname; //null문자
	public Car2() { //default constructor 초기화
		carname="포니";
	}
}

class Car3{ //설계자의 의도: 너 기본자동차 이름 생산,,, 너가 원하면 자동차 이름 넣어서 생산해도 돼
	String carname;
	public Car3() {
		carname="기본이름";
	}
	//overloading 통해서
	public Car3(String name) { //오전 Point
		carname = name;
	}
}

// 자동차의 이름은 무조건 자동차가 만들어질때 사용하게 해..... 설계도를 만들어라
class Car5{ //설계자의 의도: 너 기본자동차 이름 생산,,, 너가 원하면 자동차 이름 넣어서 생산해도 돼
	String carname;
	
	//overloading 통해서
	public Car5(String name) { //오전 Point
		carname = name;
	}
}
// 위 코드는 public Car5() {} 구현하지 않았어요... 구현하지 않아도 컴파일러가 자동생성 한다면 서요...
// 예외적으로 ... 개발자가 overloading된 생성자를 한개라도 만든다면 
// 컴파일러는 자동으로 default 생성자를 만들지 않는다.

/////////////////
public class Ex15_Constructor {

	public static void main(String[] args) {
		Car car = new Car(); // new Car() 의 괄호가 함수의 괄호  // default constuctor
		System.out.println(car.carname);
		
		Car3  car3 = new Car3();
		System.out.println(car3.carname);
		
		Car3 car4 = new Car3("mycar");
		System.out.println(car4.carname);
		
		
		

	}

}
