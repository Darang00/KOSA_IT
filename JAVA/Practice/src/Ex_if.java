/*
 If문은 true 아니면 false, 즉 boolean형의 결과를 가지는 조건식이 있어야 하며 그 조건식의 결과로 수행하는 문장을 결정하게 되는 제어문이다.
  > 종류: [단순 if문], [단일 if~else문], [다중 if문]
  
  1. 단순 if문: 한 번의 조건으로 참일 때만 처리문장이 있는 경우
     If(조건식) {
     조건에 만족할 때 수행할 문장
     }
  2. if ~else문: 한 번의 조거능로 참이 대와 거짓일 때 처리문장이 각각 구분되는 경우
   1) 조건을 만족할 때와 만족하지 않을 때, 각각 서로 다른 수행문장이 실행
   2) 수행할 문장이 두 문장 이상일 경우 brace{}로 감싸야 한다.
    if(조건식)
    {조건 만족시 수행할 문장;}
    else
    {조건 불만족시 수행할 문장;}
  3. 다중 if문: 여러 개의 조건으로 참일 때는 처리문장이 있고, 거짓일 때는 다시 조건 비교하여 중첩적으로 비교 처리되는 경우
     조건 비교가 한 가지로 충분치 않을 경우에 사용하는 문법.
 */
public class Ex_if {

	public static void main(String[] args) {
		
		/*문제1. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 (1) 1 2 
		 (2) 10 2
		 (3) 5 5
		 */
		
		/*
		//문제 1번
		int A1 = 1;
		int B1 = 2; 
		
		//문제 2번
		int A2 = 10;
		int B2 = 2;
		
		//문제 3번
		int A3 = 5;
		int B3 = 5;
		
		
		if (A2 > B2) {
			System.out.println("A > B");
		}
		
		if (A1 < B1) {
			System.out.println("A < B");
		}
		
		if (A3 == B3) {
			System.out.println("A = B");
			
		}
       */
		
	/* 문제 2. 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	          시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	 */
		
		 //풀이 1
		 
		 int SCR = 91 ;
		
		String GRD = "";
				
		if (SCR>=90) {
			GRD = "A";
			 }
			
		else  {
			if (SCR>=80) {
			GRD = "B";
			}
			else {
				if (SCR >=70) {
					GRD = "C";
					}
		
			else  {
				if(SCR >=60) {
					GRD = "D"; }}
		
		if (SCR <60) {
			GRD = "F";
		
		}
		
			
		}
		}
	System.out.println("당신의 등급은 " + GRD);
	

	}
}
	
 

	
	


