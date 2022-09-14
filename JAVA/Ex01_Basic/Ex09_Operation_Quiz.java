import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//////////////////////////////////////////////////////////
		
		/* 문제
		간단한 사칙 연산기 (+ , - , * , /)
		입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
		목적 : Integer.parseInt() ,  **equals() 활용**
		화면
		>입력값:숫자
		>입력값(기호): +
		>입력값:숫자 
		>연산결과 :200
		-------------

		>입력값:100
		>입력값(기호): -
		>입력값:100
		>연산결과 :0
		*/
		
		System.out.println("숫자를 입력하세요");
		Scanner sc1 = new Scanner (System.in);
		int number1 = Integer.parseInt(sc1.nextLine());
		//System.out.println("정수값 : " + number);
		
		System.out.println("기호를 입력하세요");
		
		String op = sc1.nextLine();
		
		
		System.out.println("숫자를 입력하세요");
		
		int number2 = Integer.parseInt(sc1.nextLine());
		
		
		int number3 =0;
		
		if(op.equals("*")) {
			 number3 = number1 * number2;
		
		}
		else if(op.equals("/")) {
			number3 = number1 / number2;
			
		}
		else if(op.equals("+")) {
			number3 = number1 + number2;
			
		}
		else if(op.equals("-")) {
			number3 = number1 - number2;
			
		}
		
		System.out.println("답: " + number3);
		
		
	
		
////////////////////////////////////////////////////////
	}

}
