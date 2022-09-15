import java.util.ArrayList;

/*
 Today Point
 Generic jdk 1.5
 
 C#, Java (�ʼ� ���)
 
 
 Why)
 Collection Ÿ���� Ŭ���� >> ������ �⺻ ���� ���� Ÿ�� : Object
 ����: Object Ÿ�Կ��� � ���� �־ ��ȭ(String, Emp, int)
 ����: ū Ÿ�Կ� ���� ����, ���ϴ� ������ Ÿ������ ���� (down casting�� ���� �ڵ� �۾��� ��� �߻�) .. ����
 
 1. Ÿ���� ó������ ����... 
 2. Ÿ�� ������ (Ÿ�� ����)
 3. ���� ����ȯ �ʿ� ���� : (Car)Object (�ʿ� ����)
 
 ���ʸ� ������ ���ؼ��� ���赵���� ����.... 
 
 */

class MyGen<T>{ //T >> type parameter 
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person{
	int age = 100;
	
}

public class Ex05_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("���ڿ�");
	    String str =mygen.get();
	    System.out.println("���ڿ� ������ : " + str);
	    
	    ArrayList list = new ArrayList(); //Object
	    list.add(10);
	    list.add("ȫ�浿");
	    list.add(new Person());
	    
	    //list ���� ����ϼ���
	    //Person ��ü�� ���̸� ����ϰ� �������� ���� ���
	    //������ for��
	    for(Object obj: list) {
	    	System.out.println(obj); // Person@1c4af82c (�ּҰ� ���)
	    	if(obj instanceof Person) {
	    		Person p = (Person)obj; //downcasting
	    		System.out.println(p.age);
	    	} else {
	    		System.out.println(obj);
	    	}
	    }
	    
	    //Generic�� ���� Ÿ���� ����: �� ������ �������� (�� ������ �Ծ�� �Ѵ�) >> ������ ������ ���� �ȴ�
	    ArrayList<Person> plist = new ArrayList<Person>(); //���: person Ÿ�Ը� ���� �� ����
	    plist.add(new Person());
	    plist.add(new Person());
	    for(Person p: plist) { //����: �ȿ� ���� Ÿ���� �˰� �ִ�(����)
	    	System.out.println(p.age);
	    }
	    
	    ArrayList<String> slist = new ArrayList<String>();
	    slist.add("���ڿ�");
	    
	}

}