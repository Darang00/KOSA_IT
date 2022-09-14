
//아파트 설계도
class Apt{   //설계도 == 데이터 타입 (작은 타입을 모아 놓은 큰 타입)
	int window;
}

// 데이터 타입 변수명 ex) int number;  >> number 라는 변수는 타입에 맞는 값을 가진다.
//Apt apt;


public class Ex03_Object_Variable {

	public static void main(String[] args) {
		
		
		int number=100;
		
		Apt apt; // 선언 Apt는 타입, apt는 변수
		         // apt변수는 Apt타입의 값을 가져야 하는데 주소값
		         // 실제로 아파트를 메모리에 올려야 아파트가 생성되고 그 주소가 만들어진다.
		         // 유일한 방법 : new (연산자)
		apt = new Apt(); // heap 메모리에 아파트가 한 채 만들어지고, 그리고 주소가 생성되고
		                 // 생성딘 주소값을 apt라는 변수가 가진다. 
		System.out.println("apt 변수가 가지는 값은 : " + apt);
		//apt 변수가 가지는 값은 : Apt@626b2d4a  : 조작된 값
		//Apt + @ + 626b2d4a >> 설계도의 이름 + @ + 주소값 (16byte: 0~9, A~F)
		
		Apt apt2 = new Apt();
		
		//System.out.println(apt == apt2); // 두 변수 apt와 apt2의 주소가 같니?? (결과: false)
		// . 의 의미: 주소를 찾아가는 연산자
		
		//Apt apt3 = apt2; // 주소값을 할당
		//System.out.println(apt3 == apt2); // 두 변수 apt3 과 apt2의 주소가 같다 (같은 집에 동거를 시작)
		//apt2.window =20;
		
		//System.out.println("apt3 : 창문의 수 : " + apt3.window);
		
		//값타입과 주소타입 증명하기
		/*
		 >>>>>
		 Ex03_Object_Variable 소스파일
		 javac Ex03_Object_Variable.java >> Ex03_Object_Variable.class 실행파일
		 java Ex03_Object_Variable 엔터
		 
		 JVM 동작 >> OS >> JAVA 메모리 구성 (구획정리) >> 자원할당 (메모리) >> 프로그램 종료
         >> 사용했던 메모리 OS 반환 ... end
         >>>>>
         이클립스 통합 개발 툴에서 ctrl + F11 키 동시에 누르면 윗 과정 실행		  
		  
		  1. main 함수 안에 지역변수는 반드시 초기화 하고 사용 
		  2. 약속 >> main 함수 >> 시작점 >> 프로그램 동작 시 이 영역이 제일 먼저 실행됨
		 
		 */
		
		
	}

}
