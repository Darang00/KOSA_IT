/*
user(사용자) <> provider(제공자)
class A{}
class B{}
관계: A는 B를 사용합니다

1. 상속 : A extends B
2. 포함 : A라는 클래스가 Member field로 B를 사용 // class A{B b;}
   2.1 부분적 포함
   2.2 전체
   
public class B{}
public class A{
	public int i; // instance variable, member field  
	public B b;   // A는 B를 사용합니다 (포함)
	public A() {
		b = new B(); // 생성자를 통해서 초기화(주소값)
	}
}   
 >> main 함수
 A a = new A();
 a.b.자원;
 
 >> 포함관계 사용시
 >> B는 독자적인 생성 불가능 >> A라는 객체가 만들어져야 B도 같이 생성된다.
 >> A a = new A(); 해야만 B객체도 생성된다.
 >> A, B 같은 운명 공동체 (전체 집합 관계) ***
 >> 자동차(A)와 엔진(B), 노트북(A)과 CPU(B)
 --------------------------------------------------------------------------------------
 public class B{}
 public class A{
 	public int i;
 	public B b;  // A는 B를 사용한다
 	public A() {}
 	
 	// method
 	 void m(B b){
 	 this.b = b;
 	 }
 }
 >> main함수 영역
 >> A a = new A();
 >> B b = new B();
 >> a.m(b);
 >> 같은 운명이 아니다. ***
 >> 학교(A)&학생(B), 노트북(A)&마우스(B) >> (부분집합)
 
class A{}
class B{}
관계: A는 B를 사용합니다
     A는 B를 참조합니다  (포함) >> B를 member field로 사용하는 것
 
 
 */


interface Icall{
	void m();
}

class D implements Icall{

	@Override
	public void m() {
		System.out.println("D Icall 인터페이스의 m() 재정의");
	}	
}

class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall 인터페이스의 m() 재정의");	
	}	
}

// 현대적인 프로그래밍 방식 (interface 대세) >> 유연성필요 >> 대충 만들어도 대충 맞으면 됨
// >>> 느슨하게... >>> interface를 부모로 두고 구현하도록

class C{
	void method(Icall ic) { // Icall을 구현하는 모든 객체의 주소는 올 수 있다.
		ic.m();
		
	}
	/*
	 * 확장성, 변화를 무시...
	 void method(D d){}
	 void m(F f) {}
	 */
}

public class Ex06_User_Provider {

	public static void main(String[] args) {
		
		C c = new C();
		D d = new D(); // D implements Icall
		F f = new F(); // F implements Icall
		c.method(d); // c주소로 가서 method의 parameter ic에 D타입의 d를 넣는다. >> ic주소가서 m()에 d를 넣는데 구현부 없으니까 D클래스로 가서 D의 메소드의 구현부를 실행
		c.method(f);
		
		
		

	}

}
