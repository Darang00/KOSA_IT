package kr.or.bit;

import java.util.Scanner;

public class SeatReservation {
	static Scanner scanner = new Scanner(System.in); 
	
	//기능 정의
	void reservation () {
		System.out.println("예약하기");
	}
	
	void checkReservation () {
		System.out.println("예매조회");
	}
	
	void cancelReservation () {
		System.out.println("예매취소");
	}
	
	int displayMenu (){
		/*System.out.println("*****************************");
		System.out.println("******* 영화 예매 시스템 *******");
		System.out.println("*****************************");
		System.out.println("******* 메뉴를 선택하세요 *******");
		System.out.println("*****************************");
		System.out.println("1. 예약하기");
		System.out.println();
		System.out.println("2. 예매조회");
		System.out.println();
		System.out.println("3. 예매취소");
		System.out.println(); */
		int input = 0; 
			
			do {
					try {
						System.out.println("*****************************");
						System.out.println("******* 영화 예매 시스템 *******");
						System.out.println("*****************************");
						System.out.println("******* 메뉴를 선택하세요 *******");
						System.out.println("*****************************");
						System.out.println("1. 예약하기");
						System.out.println();
						System.out.println("2. 예매조회");
						System.out.println();
						System.out.println("3. 예매취소");
						System.out.println(); 
						
						input = scanner.nextInt(); // 원하는 메뉴번호 입력
						if (input >=1 && input <=3) //입력한 값 input 이 1과 6사이의 값이면
							{break; //do~while문 탈출
					}
					else { //input이 1과 6사이의 값이 아니면
						throw new Exception("메뉴 선택 번호가 잘못되었습니다"); // 예외 처리 클래스 Exception
					}// else 문 끝
					} // try 문 끝
					catch (Exception e) { // try 안에서 에러가 나면(에러가 나는 상황: input 이 1~6 사이의 int이 아닌 경우) 문제발생 파일의 주소를 parameter 'e'가 가진다
						System.out.println("에러 발생 원인: " + e.getMessage()); // e.getMessage() : 
						System.out.println("1~3까지의 메뉴 번호 중 하나를 입력해 주세요");
	
					}
	
			} // do 문 끝
			while(true);
			
	// 1~3중 하나를 선택했다면
	 return input; 
	 
	}

	
	void start() {
		switch (displayMenu ()) {
			case 1: reservation ();
			break;
			case 2: checkReservation ();
			break;
			case 3: cancelReservation ();
			break;

		}
	}
	
	
//Conducting////////////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		
		SeatReservation seatReservation = new SeatReservation();
		
		seatReservation.start();
		
		

	}

}
