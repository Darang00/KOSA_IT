class Human2{
	String name;
	int age;
	
}

class Test2{
	Human2 add(Human2 h) {
		//코드는 여러분 마음
		h.name = "아무개";
		h.age = 200;
		return h;  // 변수 man 이 가진 Human2의 주소를 return 함
		//return null; //Human2는 주소를 가지고 있지 않아요
	}
	Human2 add(Human2 h, Human2 h2) {
		
		h2.name = h.name;
		h2.age = h2.age;
		
		
		return h2;
	}
}
public class Ex14_Method_Overloading {

	public static void main(String[] args) {
		Test2 t = new Test2();
		
		Human2 man = new Human2(); // man 은 Human2클래스의 주소를 가진다
		
		Human2 man2 = t.add(man);
		
		System.out.println(man == man2);

	}

}
