/*
 OOP 객체 지향 프로그래밍  (여러개의 조각(설계도)들을 만들어서 조합하는 행위)
 >> 여러개이 설계도를 재활용 하는 방법을 알아야 함
  
  1. 상속 (재사용성)
  2. 캡슐화 (은닉화) :private ... setter, getter라는 함수를 사용해서 직접 할당을 막고 간접 할당을 통해서 data를 보호
  3. 다형성 : 하나의 타입으로 여러개의 객체의 주소를 가질 수 있는 것
  
  
  >> method overloading (오버로딩)
  1. 하나의 이름으로 여러가지 기능을 가진 함수
  System.out.println() >> println() 함수가 이름은 한개인데 사용방법은 여러개
  1. 오버로딩은 성능 향상과 무관함
  2. 편하게 아용하라고 ... 설계자가 개발자를 배려 (개발자가 편하게 하려고)
  3. 오버로딩을 사용하지 않아도 문제되지 않는다 ... 
  
  문법) 함수 이름은 같고 parameter [개수] 와 [타입]을 다르게 하면
  조건)
  1. 함수 이름은 동일
  2. parameter의 개수 또는 타입은 달라야 한다
  3. return type은 오버로딩의 판단 기준이 아니다
  4. parameter의 순서가 다름을 인정(주의)  
 
 */
class Human{
	String name;
	int age;
	
}

class OverTest{ //클래스 설계
	int add(int i) {
		return 100+ i;
	}
	
	//int add(int s) {이름 충돌}
	
	//}
	int add(int i, int j) {
		System.out.println("오버로딩 : " + i + "," + j);
		return i + j;
	}
	
	String add(String s) {
		System.out.println("오버로딩 : " + s);
		return "hello" + s;
	}
	
	String add(String s, int i) {
		return "오버로딩";
	}
	String add(int i, String s) { //순서가 다름을 인정 ....
		return "오버로딩 as well";
	}
	
	void add(Human human) { //오버로딩 인정 //변수 human에는 Human 타입의 객체 주소가 들어와야 한다
		 human.name = "홍길동";
		 human.age = 100;
		 System.out.println(human.name + "," + human.age);
	}
	
}


public class Ex13_Method_Overloading {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("A"); //자동으로 parameter String 녀석 호출
		System.out.println('a'); //자동으로 parameter char 녀석 호출
		
		//System 설계또
		//memory System sys = new System();
		
		// System.out.
		
		//System.out.println
		/*
		 System.out.println();
		 System.out.printlnString("A");
		 System.out.printlnChar('a');
		 당신은 함수를 암기해서 사용 ..... 이름이 다 틀리니까
		 
		 
		 
		 */
		OverTest ot = new OverTest();
		int result = ot.add(100);
		System.out.println(result);
		result = ot.add(200,300);
		System.out.println(result);
	}

}
