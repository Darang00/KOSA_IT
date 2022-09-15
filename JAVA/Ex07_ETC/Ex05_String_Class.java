/*
 String is a Class (문자열)
 String  수 많은 함수를 가지고 있다 > 문자열을 조작 (자르고 합치고 ..)
 String > static 함수 + 일반 함수 (15~20개 사용)
 */
public class Ex05_String_Class {

	public static void main(String[] args) {
		String str = " ";
		String[] strarr = {"aaa", "bbb", "cccc"};
		for(String s : strarr) {
			System.out.println(s);

		}
		// 사용방법: int, double 과 같이 값타입처럼 사용
		
		String st = "홍길동";
		System.out.println(st.length());
		System.out.println(st); //st.toString()
		System.out.println(st.toString()); //주소로 가서 데이터를  return 설계(재정의)
		// String 클래슨는 Object라고 하는 부모 클래스  toString() 상속관계 재정의....
		
		//정식적인 방법
		String sdata = new String("김유신");
		System.out.println(sdata);
		
		String name = "가나다라마"; 
		// String 클래스가 내부적으로 char[] member field >> [가] [나] [다] [라] [마]
		// class String extends Object { private char[] str ... @Override toString()}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		//문자열의 비교
		System.out.println(str1);
		System.out.println(str2.toString()); //toString() 재정의 주소값이 아니고 값이 나온다
		System.out.println(str1 == str2);	
		// == 연산자 값을ㄹ 비교 str1(주소값) . str2(주소값)
		// 같은 주소 판명
		// ** 메모리에 실제로 같은 문자열이 있으면 [재사용]한다.
		// POINT
		System.out.println(str1.equals(str2)); // equals는 주소를 찾아가서 그 안에 있는 값을 비교
		
		// why : equals 문자열의 비교..
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		
		System.out.println(str3 == str4); // false <- new를 쓰면 무조건 새로운 객체 만드므로 주소값도 다르다.
		//문자열을 값이 중요해요(POINT)         // 따라서 == 쓰면 안되고 equals 써라 ***
		System.out.println(str3.equals(str4)); // 주소를 찾아가서 그 안에 값을 비교
		
		//Quiz
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s); // result: ABC (누적돼서)
		
		s = "A"; 
		
		

	}

}
