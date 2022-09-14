package kr.or.kosa;

/*
 class == 설계도 == 데이터 타입
 설계도는 종이에 지나지 않는다. 그래서 구체화 시켜야 한다. (프로그램 입장에서는 메모리에 올리는 행위다 -> 객체)
 그렇게 해서 구체화 된 것: '객체', '인스턴스'라 부름
 
 설계도: field(고유한 정보, 상태 정보, 부품) , method(기능), constructor(생성자 함수) 라는 것 필요하다
 
 public class Ex01_Basic{
 	public static void main(String{} args} {
 		여기 안에다가 코드 연습했었음
 		main 이라는 이름을 가진 함수의 지역
 		String name = "초기화"; local variable(main 함수 안에 있는 변수) > 접근자 > 함수가 호출되면 생성> 함수 종료시 같이 소멸 (메인 함수와 같은 운명)
 		int age = 0;
 		
 		}
 */

public class Person {
	public String name; // default (자동) -> null
	public int age; // default (자동) 0
	public boolean power; // default (자동) -> false
	public float height ; // default (자동)-> 0.0
	
	//member field 라고 부른다. >> instance variable 이라고 부른다. >> 객체변수 
	//1. instance variable 초기화를 하지 않아도 된다 >> why? >> default 값
	//초기화 : 변수가 처음으로 값을 할당받는 것.
	//질문: 저 name member field 초기화 하고싶은데 가능? 
	//필요하다면 당근 초기화 가능 : public int age = 100;
	//Today point: 왜 초기화를 하지 않아도 될까?, 왜 초기화가 굳이 필요 없을까...?
	//******답: 생성되는 객체(사람)마다, [다른 이름을 가질 수 있다]******
	//Person이 가진 member field는 당신이 사람을 만들 때 마다 다른 값을 가지게 할 것이기 때문에 굳이 초기화 하지 않아도 된다.
	//우리가 만든는 설계도는 자원을 사용할 수 있는 member field를 만드는데, 객체마다 정보 다르게 줄거면 굳이 초기화 하지 않아도 된다. 
	/*
	main() {
		Person 남자 = new Person(); 사람 1명 만들었다
		남자.name="김유신";
		남자.age="100";
		남자.power = "true";
		
		Person 여자 = new Person(); 사람 한 명 더 만들었다.
		여자. name = "유관순";
		여자. age = "20";
		여자. power = false;
		
		Person 인간 = new Person();
		
	}
	*/
	
	//기능
	//정보를 출력하는 기능(void: 나는 너한테 아무것도 안 돌려줄거다)
	public void personPrint() {
		System.out.printf("이름은 %s 나이는 %d, 파워는 %s", name, age, power);
		
	}
}
