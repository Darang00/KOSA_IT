import java.util.Scanner;
public class Ex11_Statement {

	public static void main(String[] args) {
		// 반복문 (while, do ~while)
		//int i = 10;
		//while (i>=10) {
			//반드시 
			//증가감을 명시
			//i--; //증가감의 위치도 고민하자 ^^
			//System.out.println("i : " + i);
		//	i--;
		//}
		
		//while로 1~100까지의 합
//		int sum = 0;
//		//int j = 1;
//		while (j<=100) { // for (int j = j; j <= 100 ; j++)
//			sum+=j;
//			j++;
//		}
//		System.out.println("sum : " + sum);
//		
		
		//while 구구단을 출력하세요
		//for(int i = 2; i <= 9 ; i++);
		// for(int j = 1 ; j <= 9 ; j++)
		
		//while 2개
		
		int i = 2;
		int j = 1;
		while (i<=9) {
			j = 1;
			while (j<=9) {
				System.out.printf("[%d]*[%d] = [%d]\t", i, j, i*j);
				j++;
				
			}
			System.out.println();
			i++;

		}
		System.out.printf("i:%d, j: %d \n", i, j );
		
		//
		//for(;;) {}
		//while(true) { if(조건)break; }
		//do ~while : 일단 한 번은 강제적으로 수행하고, 그리고 조건을 보고 판단해라
		//do {실행문 ... 값을 받아요} while(조건 판단)
		//메뉴 구성
		//점심 메뉴 선택하세요
		//1. 짜장
		//2. 짬뽕
		//계속 3 입력 -> 입력메뉴가 다시 나와서 다시 입력받게..
		
		//프로그램 동작
		//당신이 원하는 메뉴 번호를 선택하세요 >> Do문 에서.. 선택값 받아서
		//while(input > 2) 다시 입력하세요. >> while false 구문을 종료
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("숫자 입력해 (0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		} while(inputdata >= 10); //true가 되면 do문 실행
		
		System.out.println("당신이 입력한 숫자는 :" + inputdata);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////////////////////////
		
	}

}
