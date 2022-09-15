
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {} // Constructor
	
	static Singleton getInstance() { // Singleton 타입의 method: getInstance()는
		return singleton; // 변수 Singleton 객체의 주소값을 할당받은 singleton 변수를 리턴한다.
	}

}
