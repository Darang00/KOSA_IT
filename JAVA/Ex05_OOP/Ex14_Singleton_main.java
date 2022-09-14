import kr.or.kosa.Singleton;

public class Ex14_Singleton_main {

	public static void main(String[] args) {
		// Singleton singleton = new Singleton();
		Singleton s = Singleton.getInstance();
		System.out.println(s); // kr.or.kosa.Singleton@1c4af82c
		Singleton s2 = Singleton.getInstance();
		System.out.println(s); // kr.or.kosa.Singleton@1c4af82c
		Singleton s3 = Singleton.getInstance();
		System.out.println(s); // kr.or.kosa.Singleton@1c4af82c
		

	}

}
