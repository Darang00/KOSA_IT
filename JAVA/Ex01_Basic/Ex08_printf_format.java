import java.util.Scanner;

public class Ex08_printf_format {
	public static void main(String[] args) {
		//System.out.println();
		//C#: Console.WriteLIne();
		
		System.out.println();//출력하고 줄바꿈 (enter)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("C");
		System.out.println();
		
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 " + num + " 입니다");
		
		//형식 format
		System.out.printf("num 값은 %d 입니다", num);
		System.out.println();
		System.out.printf("num 값은 [%d] 입니다. 또 [%d] 도 있어요 \n", num, 12345);
		//format 형식 문자
		/*
		 %d (10진수 형식의 정수)
		 %f (실수)
		 %s (문자열)
		 %c (문자)
		 \t tab , \n 줄바꿈
		 
		 
		 
		 
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f변수값 %f 입니다 \n", f);
		
		//입력받기 (cmd) 사용자가 입력한 값을...
		Scanner sc = new Scanner (System.in);
		//String value = sc.nextLine() ;
		//입력하고 엔터를 칠 때 까지 대기 (프로그램이 종료되지 않고 계속 기다린다)
		//입력한 값을 문자열로 전달해 줌 ^^
		//System.out.println(value); 
		
		//int number = sc.nextInt();
		//System.out.println("number : " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("number :" +number);
		
		//권장사항 : nextInt , nextFloat 보다는 nextLine() read 타입을 바꾸자
		//Today point (8.24)
		
		//[문자를] => 숫자 (정수, 실수)
		//Integar.parseInt("11111") ->> 정수 ->> 11111
		//Float.parseFloat("3.14") ->> 실수 ->> 3.14
		
		System.out.println("숫자를 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("정수값 : " + number);
		
		
		
		
		
		
	}

}
