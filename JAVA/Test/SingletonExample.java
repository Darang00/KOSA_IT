
public class SingletonExample {

	public static void main(String[] args) {
		/* Compile Error since the object Singleton is declared as a static in the class Singleton
		 Singleton obj1 - new Singleton();
		 Singleton obj2 = new Singleton();    */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1==obj2) {
			System.out.println("Same Singleton object");
		} else {
			System.out.println("Different Singleton object");
		}

	}

}
