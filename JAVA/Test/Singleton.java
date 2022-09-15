
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {} // Constructor
	
	static Singleton getInstance() { // Singleton Ÿ���� method: getInstance()��
		return singleton; // ���� Singleton ��ü�� �ּҰ��� �Ҵ���� singleton ������ �����Ѵ�.
	}

}
