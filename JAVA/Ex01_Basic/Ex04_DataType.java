/*
1. 자바가 제공하는 기본 타입(시스템 타입 : 원시타입)  >>  8가지
2. 8가지 기본 타입  [값을 저장]하는 타입

3. 숫자 > 정수 > (음의 정수 , 0 , 양의 정수) byte  (8bit) -128 ~ 127
                                       char 한문자를 표현하는 자료형 (컴퓨터가 영문자, 특수문자, 공백 ) 1byte
                                            한글 1자 > 2byte
                                            협의) char(2byte) : 한글, 영문자, 특수문자, 공백
                                                 크기에 상관없이 2byte >> unicode >> 아스키 코드표
                                            ex) char c = 'A' , char c2 = '가'
                                       short (c언어 호한서을 위해 존재. 따라서 무시)
                                       int (-21 ~ 21억 정수 : 4byte) *** 정수의 기본 타입 ***
                                       long (8byte)

       > 실수 (부동소수점)  >             float (4byte)
                                       double (8byte) >>정밀도가 높다 (표현 범위가 크다) *** 실수의 기본 타입 ***
   논리 > 참, 거짓 > true, false         boolean
   
   현재는 대충 ...
   정수는 int 타입... 실수 double 타입 사용하면 별 문제 없다.
   
   가장 많이 쓰는 데이터 : 문자열 >>> 홍길도, 김유신, 안녕하세요
   ** 문자열의 표형 ** "홍길동", "안녕하ㅔ요"
   
   String name = "홍길동바보"; >> String은 클래스 이다. (참조 타입) String str = new String();
   
   ** 별도의 언급을 하기 전까지 String을 일반 값타입처럼 사용하세요 (int, double) 처럼

   
   기본타입 8가지 + String >> 9가지를 가지고 데이터 표혐
   
   자바타입
   1. 값타입 : 8가지 기본 > int i = 100; int j = 200;...                   value type
   2. 참조타입(주소값) : 클래스, 배열 : 변수에 값이 저장되는 것이 아니라 주소값에 저장 ref type
                                       
                                          //자바에서 정수의 기본 타입은 int, 실수의 기본 타입은 double

*/
//class == 설계도 == Data Type
class Car2{ //Car2는 데이터 타입, Car2 설계도 이다 >> 구체화 >> 메모리 (new)
	String color; 
	int window;
	
}


public class Ex04_DataType {

	public static void main(String[] args) {
		String str="홍길동"; // 문자열 데이터를 담을 수 있는 타입
				int age = 100;
		
		Car2 c; // c는 main함수 위에 있는 지역변수
		//System.out.println(c); // 지역변수 초기화 하지 않으면 실행 불가능
		//C라는 변수의 초기화는 >> 주소값을 가지게 한다. >> new 연산자를 통해서 메모리에 할당 주소
		c = new Car2();
		System.out.println("c의 주소값 출력 :" + c); // c의 주소값 출력 :Car2@626b2d4a

		
		//선언과 초기화
		Car2 c2 = new Car2();
		c2.window = 100;
		c2.color = "gold";
		
		int i = 10; //선언과 할당을 동시에 (더 선호)
		
		int j;
		j = 20; //선언하고 다음 줄에 할당
		
		int k;
		k = j; //POINT (값할당 j변수가 가지는 값을 k에게 할당)
		System.out.println("k: " + k); //20
		k= 300;
		System.out.println("k: " + k) ;
		System.out.println("j값은 변화 없다: " +j) ;
		
		//int p, q, r ; //좋아하지 않아요
		//이런 경우는 Arrey : int[] arr  = new int[3];
		
		//int (-21억 ~ 21억)
		int p=100000000;
		//int p2=10000000000;
		//p2가 정수(int) .... 당근 안되겠지 예상 ...
		//The literal 10000000000 of type int is out of range 
		//개발자가 직접 입력한 값 (있는 그대로) 정수 값은 int 그릇에 담아서 처리
		//나는 4byte의 크기로 너의 값을 담을 수 있는데 니가 큰 값을 입력하면 나는 담을 수 없어..
		//1. 해결방법
		long l = 10000000000l; //literal값을 long 그릇에 담아서 할당
		long l2 = 100; //100 literal 값은 int 그릇안에
		//작은 타입값을 큰 타입에 넣는 것은 문제가 안된다.
		
		//int p2=10000000000;
		//int p2= 10000000000l;
		//Type mismatch: cannot convert from long to int
		
		int p2=(int) 10000000000l; // 캐스칭 >> 타입변환
		System.out.println(p2); //1410065408
		//정상적인 해결 방법이 아니다 ... 버려지는 값 (쓰레기 값)
		
		int p3 = (int)1000l; //캐스팅을 통해서 타입 일치
		System.out.println(p3);
		
		//char 2byte 정수값
		//한 문자를 표현하기 위해서 만든 자료형
		//영문자, 특수문자, 공백, 한글 한 문자... 표준화...
		//문자열 : 문자의 집합 : "홍길동"   String name = "홍길동" 
		//문자 (한문자) : 'A', '홍'   char ch = '홍'
		
		char single = '가';
		System.out.println(single);
		//char s ='AB' // Invalid character constant // 예외.. 컴파일도 안돼요
		
		//char 정수 타입
		//char 문자를 저장하지만 내부적으로 정수값을 가지고 있다.
		//정수값은 아스키 코드표를 기반으로 하고 있다.
		//정수 호환 가능...
		
		int intch= 'A'; //원래는 이렇게 int intch= (int)'A'; 쓰는게 맞다
		//그렇지만 내부적으로 자동 형변환이 일어나서.... 암시적 (묵시적)
		System.out.println("intch : " + intch);
		
		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int) ch2; // 내부적으로 처리 되지만 ... casting 직접 처리 (컴퓨터가 더 선호함)
		System.out.println("intch2 : " + intch2);
		
		int intch3 = 65;
		char ch3 = (char) intch3;
		System.out.println(ch3);
		
		//속지 말자 (할당에 있어서 값을 보지 말고 그 값을 담고있는 TYPE을 보자)
		//명시적 형변환, 암시적 형변환
		//강제, 명시적 형변환은 개발자의 몫이다.
		//key point: 형변환시 손실 데이터 고민
		//위에서 했던 것 처럼..... 
		//큰 것을 작은 것으로 강제 형변환 (데이터 손실)
		
		
		/*
		 Today point
		 1. 하당에서 변수가 가지고 있는 값을 보지말고 변수의 타입을 보자
		 2. 변수의 타입 크기를 확인하자
		 3. 큰 타입에는 작은 타입의 값을 넣을 수 있다.
		 ** 4. 작은 타입에 큰 타입을 넣고 싶다면 강제로 (casting) 해야한다... 책임은 개발자의 몫..
		    ** ex) char << int 강제로 char << (char)int 가능하다. 하지만 데이터 손실 발생 가능
		    ** cf) int << char 내부적으로 컴파일러가 친절하게 int << (int)char 처리 합니다. 
		 */
		
		//String : 문자열을 담을 수 있는 타입
		//쓰는 방법: int, double 처럼 쓰세요 [타입 변수명 값] 순서로 쓰기
		
		String name="hello world";
		System.out.println(name);
		
		String name2 = name + " 방가방가" ;
		System.out.println(name2);
		//단축키: syso ctrl+Space
		
		// + > 산술, 결합 연산
		//Tip) Oracle 데이터 베이스 (언어) > + 산술연산 , || 결합연산자 (ex '안녕'||'방가')
		
		//Tip) Java 에서의 특수 문자 처리
		//이스케이프 문자 : 특정 문자 앞에 \
		//char singn = '''; 문제 발생 
		char sing = '\'';  // \통해서 ' 데이터 임을 표현
		System.out.println(sing);
		
		//Quiz : 홍"길"동 이라는 문자열을 표현하고 싶어요
		String name3 = "홍\"길\"동";
		System.out.println(name3);
		
		String str3 = "1000"; //1000이 숫자가 아닌 문자!
		String str4 = "10"; // 10이 숫자가 아닌 문자!
		String result = str3 +str4 ; // 100010
		System.out.println(result);
		
		System.out.println("100" + 100); 
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + (100 + "100"));
		System.out.println(100 + "100" + 100);
		
		//Quiz [C:\Temp] 문자열을 String 변수에 담아서 화면에 출력하세요
		String path = "C:\\Temp";  // \t >> tab   \n >> new line
		System.out.println(path);
		
		//시수형 (부동소수점)
		//float 4byte
		//double 8byte // 실수 literal은 기본 타입 double
		
		//float f = 3.14; //Type mismatch: cannot convert from double to float
		//float f = (float)3.14; 데이터 손실 가져올 수 있다
		//float f = 3.14f; // 맨뒤에 접미사 'f' 붙임 // 데이터 손실 가져올 수 있다
		double f = 3.14; //현명한 선택 (담을 그릇을 크게)
		
		float f2 = 1.123456789f; //float 타입에 담고 싶다면 무조건 접미사 F나 f 붙인다.
		//대략적으로 7자리 소수 표현
		//반올림 default
		
		System.out.println("f2 : " +f2);
		//f2 : 1.1234568 (반올림 된 값 출력됨)
		
		double d = 1.123456789123456789;
		//대략 16자리 소수 표현
		//반올림 default
		System.out.println("d : " +d);
		//d : 1.1234567891234568 (반올림 된 값 출력됨)
		
		System.out.println((byte)128); //128 byte 표현이 안되요
		//byte 타입 : -128 ~127  //overflow 넘칠 경우 순환
		
		byte q = (byte)129;
		System.out.println(q);
		
		
	// 정수와 실수가 같이 있는 경우
		double d2 = 100; // 암시적 컴파일러가 형변환
		System.out.println(d2);
		
		//Quiz
		double d3 =100;
		int i5 = 100;
		
		//int result2 = d3 + i5;
		// 제안1: int result2 = (int) (d3 + i5); 데이터 손실을 가져올 수도 있다
		// 제안2: double result2 = d3 + i5; 데이터의 손실은 가져오지 않는다
		
		//Today point
		//1. 큰타입 + 작은 타입 >> 큰타입
		//2. 타입간 변환 >> 변수가 가지는 값을 보지 말고 변수의 타입을 보고 판단하다
		//3. 명시적 형변환시 손실데이터 고민
		
		int i6 =100;
		byte b2 = (byte)i6; //강제적 형변환
		
		byte b3 = 20;
		int i7 = b3; // 컴파일러가 내부적으로 자동 형변환을 한다. 사실은 int i7 = b3; 이렇게 쓰는게 맞는 거다.
		
		
		
		
		
		
		
		
		
	}

}
