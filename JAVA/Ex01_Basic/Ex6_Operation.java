//import java.lang.*; 생략되어 있다. 쓰지 않아도 java.lang 폴더 안에 있는 자원은 그냥 사용가능

public class Ex6_Operation {
	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //몫
		System.out.println(result);
		
		//나머지를 구하는 연산자 (%)
		result = 13%2 ;
		System.out.println(result);
		
		// 증가, 감소 (증가감 연산자 : ++ 1씩 증가 , -- 1씩 감소)
		int i = 10;
		++i; //전치증가
		System.out.println("전치 : " + i);
		i++; // 후치증가
		System.out.println("후치 : " + i);
		// 혼자서는 전치, 후치의 의미가 없다. 같은 것
		
		//Today Point ( 증가감 연산자가 다른 연산자와 결합되면 전치, 후치가 구분 중요)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + " , j2 : " + j2);
		//현재 result2 : 10 , j2 : 5
		
		result2= i2 + j2++;
		System.out.println("result2 : " + result2 + " , j2 : " + j2);
		
		byte b = 100;
		byte c = 1;
		
		//byte d = b + c ;
		//에러: Type mismatch: cannot convert from int to byte
		byte d = (byte) (b + c) ; //제안 1: 연산 시 4Byte 공간을 사용해서 연산 int + int // 손실이 날 가능성 있음
		int d2 = b + c ; // 제안 2: 결과의 타입을 조정해서 (손실은 발생하지 않는다)
		System.out.println("d값 출력: " + d);
		System.out.println("d2값 출력: " + d2);
		
		//Today Point
		/*
		 1. 정수의 모든 연산은 [int] 타입 변환 후 처리하는 것이 좋다.
		 ex) byte + short => 컴파일러가 내부적으로 int + int
		     char + char => 컴파일러가 내부적으로 int + int
		     연산 처리시
		     정수의 연산에서 int보다 작은 타입은 int로 변환 시켜서 연산 (단, int 보다 큰 long 제외)
		     byte, char, short >> 연산시에는 int방에 넣어서 계산 > 그 결과: int
		     
		     char + int >> int + int
		     int + long>> long + long 예외적으로 .....
		     
		     정수 + 실수 >>타입의 크기와 상관 없이 >> 실수 승자
		     
		     
		 */
		 long ln = 100000000000L;
		 float fl = 1.2f ;
		 //long lnresult = ln + fl; //에러: Type mismatch: cannot convert from float to long
		 long lnresult = (long) (ln+fl); //제안 1: Add cast to 'long' 손실발생 가능
		 System.out.println("lnresult : " + lnresult);
		 float lnresult1 = ln + fl; // 제안2: Change type of 'long' to 'float'
		 System.out.println("lnresult1 : " + lnresult1 );
		 //long은 정수, float은 실수라서 long + float >> float 으로 처리한다.
		 
		 float num2 = 10.45f;
		 int num3 = 20;
		 //num2 + num3
		 //float + int 를 연산하면 >> float + float 로 처리된다.
		 float result5 = num2 + num3;
		 System.out.println(result5);
		 
		 char c2 = '!'; //33
		 char c3 = '!'; //33
		 //c2 + c3
		 int result6 = c2 + c3;
		 System.out.println("result 6 :" + result6); // 결과: 66
		 
		 // 제어문
		 
		// 중소기업 시험문제 (구구단 출력) >> 삼각형 별찍기 >> 연습
		 int sum = 0; //local vaiable >> 무조건 초기화
		 
		 for (int j = 1; j <=100 ; j++) {
			 //sum = sum + j;
			 //sum+=j; // sum = sum + j 랑 똑같다.
			 if(j % 2 == 0) { //짝수라면
				 sum +=j; //짝수의 합(1~100)
			 }
		 
		 System.out.println("sum: " + sum);
		 
		 // == 연산자 (값을 비교하는 연산자_값비교)
		 if( 10 == 10.0f) { //타입을 비교하는 것이 아니고 있는 값을 비교
			 System.out.println("true");
		 } else {
			 System.out.println("false");
	}
		 
		 // ! 부정 연산자
		 if( 'A' != 65) { //같지 않니
			 System.out.println("어 같지 않아 : true");
		 }else {
			 System.out.println("아니 같은 값이야 : false");
		 }
		 //암기하자 (Today point)
		 //연산자 중에서 제어문역할을 하는 녀석
		 //삼항연산자
		 int p = 10;
		 int k = -10;
		 int result8 = (p == k) ? p : k;
		 
		 //위 코드를 if문을 사용해서 처리하면?
		 int result9 = 0;
		 if(p == k) {
			 result9 = p;
		 } else {
			result9 = k;
		 }
		 
		 //진리표
		 //논리연산
		 //0 : false
		 //1 : true
		 
		 /*       OR 연산,  AND 연산
		  0 0        0       0
		  0 1        1       0
		  1 0        1       0
		  1 1        1       1
		  
		  <DB (Oracle) SQL인 자연어 (인간이 해석하기 가장 쉬운 )>
		  select *
		  from emp
		  where job = 'IT' and sal > 2000 (그리고 둘 다 참인 경우에만 만족)
		  
		   select *
		  from emp
		  where job = 'IT' or sal > 2000 (이거나 또는 둘 중에 하나만 참이어도 만족)
		  
		  <Java>
		  연산자 (비트)
		  |  or 연산
		  & and 연산
		  
		  || 논리연산 (OR)
		  && 논리연산 (AND)
		  
		  */
		 int x = 3;
		 int y = 5;
		 
		 System.out.println("x|y : " + (x|y));
		 /*
		  십진수 -> 2진수 (0,1)
		  8bit
		  256 128 64 32 16 8 4 2 1
		                   0 0 1 1  > 10진수 3을 -> 2진수
		                   0 1 0 1  > 10진수 5를 -> 2진수
		  OR               0 1 1 1  > 2진수 -> 10진수 > 4+2+1 > 7
		  ANd              0 0 0 1  > 2진수 -> 10진수 > 1  
		  */
		 System.out.println("x&y : " + (x&y));
		 
		 //Today Point ( && (and) , || (or))
		 //if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {A}else{B} *****(중요)*****
		 //거짓이 나오는 순간 뒤에거는 보지도 않고 결과는 거짓 처리 됩니다.
		 //if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {A}else{B}
		 //참 하나만 나오면 결과는 참
		 
		 //switch문: 비교하는 값이 명확할 때
		 /*int data = 50;
		 switch(data) {
		 case 100 : System.out.println("100입니다");
		 	break;
		 case 90: System.out.println("90입니다");
		 	break;
		 case 80: System.out.println("80입니다");
		 	break;
		 default : System.out.println("일치하는 값이 없어요");
		 */
		 
		 /*
		 int data = 90;
		 switch(data) {
		 case 100 : System.out.println("100입니다");
		 	
		 case 90: System.out.println("90입니다");
		 	
		 case 80: System.out.println("80입니다");
		 	
		 default : System.out.println("일치하는 값이 없어요");
		 */
		 
		 int month = 2;
		 String res = ""; //빈문자열 초기화
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					res = "31";
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					res = "30";
					break;
				case 2:
					res = "29";
					break;
				default:
					res ="일치하는 달이 없다";
			}
			System.out.println(month + "월은 " + res + " 일까지 입니다.");
			
			//난수 (랜덤값 : 임의의 추출값)
			//java( 사용하고자 하는 다양한 자원을 미리 생성해 두었어요 >> 찾아서 >> 사용 JAVA APT)
			//도움말 (찾아서 ... 써라) api문서
			//https://docs.oracle.com/javase/8/docs/api/index.html
			//원하는 자원을 찾아서 사용방법을 파악하고 처리
			//java.lang Math 클래스 찾았어요
			//public static double random()
			//equal to 0.0 and less than 1.0. 범위의 난수를 얻을 수 있다.
			//결과: double 실수 return 0.0 <= random < 1.0
			
			//원칙적인 방법
			//쓰고자 하는 자원이 있는 폴더를 open
			//import java.lang.*  >> java 폴더 안에 lang 폴더 안에 있는 모든 자원은 사용가능
			
			System.out.println("Math.random () :" + Math.random());
			
			//0~9
			System.out.println("Math.random () *10 :" + (Math.random() *10));
			
			//1~10
			System.out.println("((int)Math.random () *10 ) +1 :" + ((int)(Math.random() *10)+1));
			
			/*
			  우리는 백화점 경품 시스템을 만들려고 한다
			  경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
			  경품 추첨시 1000 점수가 나오면
			  경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
			  경품 추첨시 900 점수가 나오면
			  경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
			  경품 추첨시 800 점수가 나오면
			  경품으로  냉장고 , 한우세트 , 휴지
			  경품 추첨시 700 점수가 나오면
			  경품으로  한우세트 , 휴지
			  경품 추첨시 600 점수가 나오면
			  경품으로  휴지
			  그외 점수는 100 ~ 500 까지는 칫솔 
			  경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
			  사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
			  
			  문제: 프로그램을 한 번 실행하면 그 때 랜덤값이 나오고 그 나온 랜덤값에 의해서 경품을 출력해라
			 */
			
			
			int selectednum = ((int)((Math.random())*10))*100 + 100;
			System.out.println("뽑은 번호는 " + selectednum + "입니다.");
			
			String gift = "" ;
			switch (selectednum) {
			case 1000:
				gift += "TV ";
			case 900:
				gift += ", NoteBook";
			case 800:
				gift += ", 냉장고";
			case 700:
				gift += ", 한우세트"; 
			case 600:
				gift += ", 휴지";
				break;
			default:
				gift += "칫솔";	//g = g +		
			}
			System.out.println("축하합니다 받으실 상품은 " + gift + "입니다.");
			
			
			
			/* int jumsu = ((int)(Math.random()* 10) + 1)*100;
			  System.out.println("추첨번호 : " + jumsu);
			  String msg="";//초기화
			  msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
			  switch(jumsu) {
			  	case 1000:msg+="Tv";
			  	case 900:msg+="NoteBook ";
			  	case 800:msg+="냉장고 ";
			  	case 700:msg+="한우 ";
			  	case 600:msg+="휴지 ";
			  	     break;
			  	default:msg+="칫솔";     
			  }
			  System.out.println(msg);
			  */
			
			System.out.println(gift);
			
			//switch(조건) 정수만 ... 아니죠
			//조건식은 "문자열"도 가능, "문자" 가능
			
			String m = "F";
			String f = "";
			switch(m) {
			case "A":
			case "B":
			case "C":
			case "D":
			case "F":
			case "G": f="OK";
				break;
			case "H":
			case "k": f= "no";
				break;
			default : f ="no data";
			}
			System.out.println("결과 : " +f);
			
			
		}
	}
}
