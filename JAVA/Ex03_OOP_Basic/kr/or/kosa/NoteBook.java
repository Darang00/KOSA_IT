package kr.or.kosa;

public class NoteBook {
	
	//노트북은 마우스를 가지고 있다
	//마우스>> 휠, 버튼 2개, 좌표값 ....
	//부품정보를 가진 것들... (엔진, 타이어 등)
	//마우스도 설계도(class)
	
	
	//노트북하고 마우스는 별개의 상품인데
	//public Mouse mouse = new Mouse(); //Mouse라고 하는 타입은 class >> mouse는 참조변수 >> 주소값 가져야 함
	
	
	
	
	public String color;
	
	//객체 지향 언어 (캡슐화, 은닉화: 직접적으로 값을 변경하거나 쓰는 것을 방지)
	//year 변수에 마이너스 값 넣지마 부탁...
	//설계자 >> 다 막아 버릴거야 >> 사용불가 >> 간접적으로 사용가능 .... >> 누군가를 통해서 read, write
	//간접 >> 개발자가 논리를 통해서 제어 하겠다 ...
	//public int year;
	private int year; 
	
	//약속 캡슐화(read, write 함수) >> 표준화 >> getYear.., setYeat >> setter, getter
	public void setYear(int data) { //간접할당의 장점 (내가 원하는 대로) 강제할 수 있다
		if(data<0) {
			year = 1999;
		} else {
			year = data;
		}
	}
	
	public int getYear() { //간접적으로 year member field 값을 return
		return year;
	
	/*
	//year write 함수
	public void writeYear(int data) { //간접할당의 장점 (내가 원하는 대로) 강제할 수 있다
		if(data<0) {
			year = 1999;
		} else {
			year = data;
		}
		
	}
	//year read 함수
	public int readYear() { //간접적으로 year member field 값을 return
		return year;
	}	*/
	
	//public int number;
	
	//노트북 필요에 따라서 마우스를 가질 수 있다
	//가진다의 의미: 생성된 객체의 주소를 가진다.
	
		//
		
	
		
	}
	
	public void handle(Mouse m) {
		
		m.x = 100;
		m.y = 200;
		
	}
	
	}

