package kr.or.kosa;

//원칙적으로 (실무) ....
//1. 캡슐화 (member field)
//2. 캡슐화 (간접적으로 처리: setter, getter 함수)
//3. 이런 데이터를 담을 수 있는 클래스 (VO, DTO, DOMAIN 이라고 부른다) >> MVC 패턴 

public class Car {
	private int window;
	private int speed;
	
	//필요에 따라서 (setter 만) >> write
	//필요에 따라서 (getter 만) >> read
	//필요에 따라서 (setter, getter 둘 다) >> write, read
	
	public int getWindow() { //getter 함수
		return window;
	}
	
	public void setWindow (int data) { // setWindow(int window) { this...}
		window = data; // setter 함수
		
	}

	//1. IDA 사용
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//2. Lombok 이란
	//Java 라이브러리로 반복되는 getter, setter, toString..
	//등의 반복 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리 이다.
	//@Getter
	//@Setter
	//컴파일러에게 자동으로 setter, getter 함수 만들어 주세요...
	
	
	//필요하다면 별도의 함수를 생성
	//speed를 10씩 올리거나 감소하는 기능을 만드세요
	//speedUp(), speedDown()
	//일반적으로 아래처럼 별도의 함수를 만들기 보다는 read, write 만 한다면 
	//setter, getter 를 통해서 제어하는 것이 일반적
	
	
	public void speedUp() {
		speed+=10; // speed = speed +10;
		
	}
	
	public void speedDown() {
		//조건...
		if (speed >0) {
			speed-=10;
			
		}		
		else {
			speed = 0;
		}
		
	}
	

}
