import java.util.Scanner;
public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		//메뉴를 보여주고 사용자에게 선택....
		//다른 것을 선택한다면 다시 선택하도록 강제하는 메뉴
		//while(true)
		//do~ while()

		
	/*1. while로 만드는 법
		boolean auto = true;
		int balance = 0; // 잔액
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("********************************");
			System.out.println("1. 예금 | 2. 출근 | 3. 잔고 | 4. 종료");
			System.out.println("********************************");
			
			System.out.println("선택하세요");
			
			int input = Integer.parseInt(sc.nextLine());
			
			//판단
			switch(input) {
				case 1: System.out.println("예금처리..");
						balance += Integer.parseInt(sc.nextLine());
						break;
				case 2: System.out.println("출금처리..");
						balance += Integer.parseInt(sc.nextLine());
						break;
				case 3: System.out.println("잔고");
						balance += Integer.parseInt(sc.nextLine());
						break;
				case 4: System.out.println("종료합니다");
						balance += Integer.parseInt(sc.nextLine());
						auto = false;
						break;
				default : System.out.println("올바른 메뉴를 선택하세요");
			}
			
			if(auto == false) {
				break; // 또는 
				
			}
			
		} */
		
		
		//2. 가위바위보게임
		boolean auto = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**************************************");
			System.out.println("1. 가위 | 2. 바위 | 3. 보 중 하나를 입력하세요");
			System.out.println("**************************************");
			
			System.out.println("선택");
			int input = Integer.parseInt(sc.nextLine());
			int random = (int)(Math.random()*3)+1;
			String a ="";
			String b = "";
			if (random == 1) {
				a = "가위";
			}
			
			else if (random == 2) {
				a = "바위";
			}
			
			else if (random == 3 ) {
				a = "보";
			}
			
			if (input == 1) {
				b = "가위";
			}
			
			else if (input == 2) {
				b = "바위";
			}
			
			else if (input == 3 ) {
				b = "보";
			}
			
			
		if(input == random) {
			System.out.println(b + "vs" + a);
			System.out.println("당신과 컴퓨터 모두 " + a + " 를 선택하여 비겼습니다");
             	}
		else if((input - random)==-2 || (input - random)==1) {
			System.out.println(b + "를 선택한 당신이 컴퓨터 (" + a + ")를 이겼습니다");
		}
		else if ((input - random)==2 || (input - random)==-1 ){
			System.out.println(b + "를 선택한 당신이 컴퓨터(" + a + ")에 졌습니다");
		}
		else {
			System.out.println("다시 입력해 주세요");
		}
		
	
		}
	}

		
}
