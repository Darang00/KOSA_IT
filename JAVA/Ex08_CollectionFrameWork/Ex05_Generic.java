import java.util.ArrayList;

/*
 Today Point
 Generic jdk 1.5
 
 C#, Java (필수 기능)
 
 
 Why)
 Collection 타입의 클래스 >> 데이터 기본 저장 공간 타입 : Object
 장점: Object 타입에는 어떤 값을 넣어도 소화(String, Emp, int)
 단점: 큰 타입에 대한 문제, 원하는 데이터 타입으로 변경 (down casting을 통한 코드 작업이 계속 발생) .. 불편
 
 1. 타입을 처음부터 강제... 
 2. 타입 안정성 (타입 강제)
 3. 강제 형번환 필요 없다 : (Car)Object (필요 없다)
 
 제너릭 적용을 우해서는 설계도부터 적용.... 
 
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
		mygen.add("문자열");
	    String str =mygen.get();
	    System.out.println("문자열 데이터 : " + str);
	    
	    ArrayList list = new ArrayList(); //Object
	    list.add(10);
	    list.add("홍길동");
	    list.add(new Person());
	    
	    //list 값을 출력하세요
	    //Person 객체는 나이를 출력하고 나머지는 값을 출력
	    //개선된 for문
	    for(Object obj: list) {
	    	System.out.println(obj); // Person@1c4af82c (주소값 출력)
	    	if(obj instanceof Person) {
	    		Person p = (Person)obj; //downcasting
	    		System.out.println(p.age);
	    	} else {
	    		System.out.println(obj);
	    	}
	    }
	    
	    //Generic을 만들어서 타입을 강제: 다 먹지는 못하지만 (한 종류만 먹어야 한다) >> 먹은걸 뱉어낼때는 뭔지 안다
	    ArrayList<Person> plist = new ArrayList<Person>(); //편식: person 타입만 먹을 수 있음
	    plist.add(new Person());
	    plist.add(new Person());
	    for(Person p: plist) { //장점: 안에 들어가는 타입을 알고 있다(강제)
	    	System.out.println(p.age);
	    }
	    
	    ArrayList<String> slist = new ArrayList<String>();
	    slist.add("문자열");
	    
	}

}