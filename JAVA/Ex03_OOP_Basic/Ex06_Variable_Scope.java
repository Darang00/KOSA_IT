/*
 instance variable >> class Car {private String color;}
 >>  생성되는 객체마다 다른 색상을 가질 수 있다.
 
 local variable >> class Car { public void move() {int speed = 0; // 반드시 초기화 필요 } }
 main 함수 >> local variable
 
 block variable >> class Car { public void move() {for(int i; i< 10....)} 제어문 있을 때 변수생성 >> 제어문 끝나면 소멸}
 
 static variable >> 공유자원 (객체간) , 객체 생성 이전에 memory에 올라가는 자원 (영역: class area, method area)
 
 객체를 만드는 유일한 방법: new를 통해서 메모리에 올리는 것
 ... static은 new 없이도 메모리에 올라가요
 
 ** 원칙: 자원은 메모리에 올리지 않으면 쓸 수가 없다 **
 Ex06_Variable_Scope 는 class임 >> 구체화(메모리)(new)에 올려야 쓸 수 있음 >> Ex06_Variable_Scope >> new 한 적이 없는데 프로그램 돌아감.. 왜??
 
 */
///////////////////////////////////////////////////////////////////////////
class Variable {
	int iv; 
	/*
	 1. member field, instance variable
	 2. iv는 언제 사용가능할까요? (메모리에 언제 올라 갈까요)
	 2.1 Variable v = new Variable(); >> heap 객체 생성 >> 객체 안에 iv 생성
	     Variable v2 = new Variable(); >> heap 객체 생성 >> 객체 안에 iv 생성
	     
	 3. 목적: 데이터 (정보), 자료를 담을 목적
	 3.1 정보 : 고유 정보, 상태 정보, 부품(class)
	 - 생성되는 객체마다 다른 값을 가질 수 있다
	 - 그래서 초기화를 해서 값을 강제하지 않는다.
	 - default 값을 가지고 있다. (int > 0, double > 0.0 , char > 빈문자'\u0000' , 
	                          boolean > false, String > null, Car > null)
	                          
	 - iv 변수의 생성 시점: new 라는 연산자를 통해서 heap Variable 이름의 객체가 만들어지고 나서 바로 생성(그 안에)
	 
	 
	
	 */
	static int cv;
	/*
	 1. class variable (클래스 변수), 일반적으로는 static variable 이라고 부른다 (객체간 공유자원)
	 2. 목적: 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원)
	 	>> 생성되는 모든 객체 (heap 이라는 영역에 생성된 객체들이 공유하는 자원)
	 3. 접근방법 
	 	1. class 이름. static 변수명 >> Variable.cv >> why > 객체가 생성되기 전에 메모리에 올라가니까 그 접근 방법도 클래스라는 이름을 가지고 접근
	 	2. Variable v = new Variable(); >> v.cv
	 	   Variable v2 = new Variable(); >> v2.cv
	 	   >> v.cv == v2.cv (같은 주소를 바라본다 : static 변수의 주소)
	 4. 생성시점
	    Hello.java > javac Hello.java > Hello.class
	    > java.exe Hello 엔터 쳐서 실행
	    > JVM이 OS 에게 메모리를 빌림 > 거기를 정리함(영역을 나눈다) > class Loader System이 분석함
	    > 클래스에 대한 정보(Metadata: 설명)를 읽어냄 >> class area(method area) 메모리에 올려요 (이 클래스는 언제 만들었고 버전은 뭐고 어떤 자원을 만들었고..)
	    > 그 클래스 안에 static variable 또는 static method 가 있다면 
	    > 그 녀석들을 class area(method area) 영역에 할당합니다 
	    > 그런데 그 함수의 이름이 main() 이라면 정해진 규칙에 따라서 실행합니다 (Stack 영역) 자원 할당 ..
	    
	      
	 */
	
	
	
	
	
	
	
	void method () {
		int lv=0; // lv: local variable
		
		/*
		 local variable (함수 안에: 지역 변수 : 사용하기 전에 반드시 초기화 해야한다)
		 생명주기: 함수가 호출되면 생성 (stack 메모리에 생성 되었다가 함수가 끝나면(더 이상 실행할 게 없을 때), 또는 강제로 return 되면 같이 소멸됨)
		 */
		for (int i = 0 ; i <= 10; i++) {
			/*
			 int i >> block 변수 >> , for 시작되면 생성 .. for 끝나면 소멸
			 */
			
			
		}
		
	} 
}

/////////////////////////////////////////////////////////////////////////


public class Ex06_Variable_Scope {

	public static void main(String[] args) {
		//어떤 객체도 생성하지 않아요
		Variable.cv= 100; //Variable 이라는 클래스 안에 cv 라는 변수
		Ex06_Variable_Scope ex06 = new Ex06_Variable_Scope();
		//ex06.
		Variable v = new Variable () ;	//v2
	}
	
	public void method() {
	System.out.println("나 일반함수");
	}
}
