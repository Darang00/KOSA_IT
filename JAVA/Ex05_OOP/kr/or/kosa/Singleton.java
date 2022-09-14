package kr.or.kosa;
//디자인 패턴 (생성 패턴) >> new 

// 싱글톤 ... (객체 하나를 만들어서 공유하겠다)
// 의도 : 하나의 객체를 공유하는 보장성 코드를 제공하겠다...

// 공유 IT
// 공유 프린터
// 설계할 때 ...
public class Singleton {
	private static Singleton p; // p라는 변수가 주소를 가지게 하려면 new연산자 필요
	//기본생성자: public Singleton() {} 
	private Singleton() { // 생성자의 접근자를 private으로 만들면 생성자 함수 호출 못하니 객체 생성 불가 new...
		
	}
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton(); // 같은 클래스 내에서는 private 자원에 접근 가능(public, private 보여요)
		}
		return p;
	}
}



/*
Singleton s = new Singleton();
*/