
public class Ex10_Statement {

	public static void main(String[] args) {
		// 제어문
		// 조건문 : if (3가지) , switch(조건) {case 값... break}
		// 반복문 : for (반복횟수가 면확), while(진위) {} , do{} ~ while()
		// 분기문 : break(블럭 탈출), continue (아래구문 skip)
		
//		int count = 0; 
//		if(count <1 ) System.out.println("true");
//		if(count<1 ) {
//			System.out.println("true");
//		}
//		
//		char data='A';
//		switch(data) {
//		 case 'A': System.out.println("문자 비교 같아요");
//		 	break;
//		 case 'B':
//			 break;
//		default : System.out.println("나머지 처리...");
//		
		//for문
		//1~100 누적합
		//int sum =0;
		//for(int i = 1 ; i <= 100 ; i++ ) {
		//System.out.println("i : " + i);
		//sum = sum + i;
			//sum+=i;
		//}
		//System.out.printf("1~100누적합 : %d \n", sum);
		
		//1~5까지의 합
		//for문과 while 쓰지 말고
		//개수 * (시작 + 끝) /2
		//sum= 5* (1+5)/2; // 하지 마세요.. 우리 for문
		//System.out.println("sum: " + sum);
		
		//for 문을 사용해서 1~10까지의 홀수의 합을 구하세요
		//단 for문만 사용 (for문 안에 if문 사용하지 마세요)
		//for(초기값 ; 조건식 ; 증가감)>> 증가감 변경
		//1, 3, 5, 7, 9...
		//sum2 = sum2 + i (1, 3, 5)
		
		int sum2=0;
		for(int i=1; i<4 ; i+=2) { // i = i+2 //식을 표현
			sum2+=i;
			//sum2 = 0+1
			//sum2 = 1+3
			//...
	
		}
		System.out.println("sum2 : "+sum2);
		
		//for안에 if문을 사용해서 1~1000까지의 합을 구하세요(짝수)
		
		int sum3 =0;
		for (int i = 1 ; i <= 100 ; i++) {
			//sum 3+=i;
			if(i % 2 == 0) {
				System.out.println(i);
				sum3 +=i;
			}
		
		
		
		}
		System.out.println("sum3 :" + sum3);
		
		//입사시험 (구구단)
		//중첩 for ....
		//한 개의 값을 고정 ... 반복 (2단: 1~9, 3단: 1~9)
		
		for(int i = 2; i <=9; i++) { //i라는 변수는 유효범위
			for(int j = 1; j <= 0 ; j++) { // j라는 블럭변수...
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i*j);
				
			}
			System.out.println(); //엔터 
		}
		
		
		// for + (분기문) continue, break
		//Today point:continue (아래 구문 skip) , break(for , while 블럭 탈출)
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9; j++) {
				if(i == j) {
					break;
				}
				System.out.printf("%s", "*" );
			}
			System.out.println(); //엔터
		}
		
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9; j++) {
				if(i == j) {
					continue; // 아래 구문 skip
				}
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i*j);
			}
			System.out.println(); //엔터
		}
		
		for (int i = 2; i<=9 ; i++) {
			for (int j = 1 ; j < i; j++ ) { // j<=9 코드를 변경 >> j <i ;
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//100부터 0까지 출력 // 증가감 -- i
		for(int i = 100 ; i>=0 ; i--) {
			System.out.println(i);
			
		}
		
		//피보나치 수열
		
		
		
		
		
		
		
		///////////////////////////////////////////////////////////
		

	
	}
	
}
	


