/*
자동차 영업소 입니다.
영업사원은 고객에게 자동차를 팔려고 합니다.
고객은 자동차의 기본 사양을 살 수 도 있고 ....  여러가지 선택 옵션을 선택 할 수 있습니다.
자동차의 기본은
문의 개수 4개 , 자동차의 색상 기본은 red  4개가 기본 입니다
그런데 고객은
문의 개수만 변경 가능하고  자동차의 색상 기본은 red  으로 할 수 있고
문의 개수는 기본으로 하고 자동차의 색상 변경 가능하고
문의 개수와 자동차의 색상 모든 변경 하여 차를 구매할 수 있습니다

자동차 구매
1. 기본 사양  
2. 옵션 : 문 변경 , 자동차의 색상 기본
3. 옵션 : 자동차의 색상 변경 , 문 기본
4. 옵션 : 자동차의 색상 변경 , 휠 변경

*/




// 생성자(member field 초기화) 목적
// 여러개의 생성자 생성(overloading) 가능하다 (여러개의 옵션을 만들 수 있다)

class Car6 {
	String colour;
	int door;
	
	public Car6() { //default
		door = 4;
		colour = "red";
		
	}
	
	public Car6(int d) { //문의 개수
		door = d;
		colour = "red";
		
	}
	
	public Car6(String s) { //문의 개수
		door = 4;
		colour = s;
	}
	
	public Car6(int d, String s) { //문의 개수
		door = d;
		colour = s;
	}
	public void carInfoPrint() {
		System.out.println(door+"," + colour);
	}
}
	



/////////////////////////////////////////
public class Ex16_Constructor_Quiz {

	public static void main(String[] args) {
		
		Car6 car6 = new Car6() ;
		//car6.carInfoPrint();
		Car6 ca1 = new Car6(6);
		 Car6 ca = new Car6("blue");
		 ca.carInfoPrint();
		
		

	}

}
