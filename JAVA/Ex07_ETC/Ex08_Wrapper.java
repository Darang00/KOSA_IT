import java.util.ArrayList;
import java.util.List;


// https://cafe.naver.com/kosait/329

/*
 자바는 8가지 기본 타입(값 타입): JAVA API 제공
 
 8가지 기본 타입에 대해서 객체 형태로 사용 가능 하도록 만든 클래스(wrapper class) 
 
[사용]
1. 매개변수 객체 요구될 때
2. 기본형 값이 아닌 객체 형태로 저장이 필요할 때
3. 객체 간 값을 비교할 때
4. 타입 변환 시 처리

>> generic 설계 (객체 형태) >> ex: int의 wrapper class type: Integer
  
 
 */
public class Ex08_Wrapper {

	public static void main(String[] args) {
		int i = 100; //i는 값타입 변수
		
		/*
		Integer n = new Integer(500); //int 라고 하는 원시 타입을 객체로 만든 것
		System.out.println("n : "+ n); //toString을 재정의 해서 Integer의 주소가 나오는 것이 아니라 값을 리턴 //n : 500
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE); //-2147483648
		*/
		//POINT
		//parameter 활용 : 함수의 매개변수 값
		//제너릭(generic) : 객체 생성 시 타입을 강제하는 방식 >> refer class
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
		// li.add("A"); // li의 타입 Integer로 강제 했는데 "A"라는 문자(열)가 들어와서
		for(int value : li) {
			System.out.println(value);
			
		}
		
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //false
		System.out.println(i2.equals(i3)); //true // 주소를 찾아가서 그 값을 비교
		
		//String >> 문자열값 비교 >> equals (재정의)
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 ==i5);
	}
	
	static void iMethod(Integer i) {
		
	}

}
