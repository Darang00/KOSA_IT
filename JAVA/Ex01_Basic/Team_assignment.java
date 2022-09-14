import java.util.Scanner;

public class Team_assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int unit = 10000; // 화폐단위
		int num = 0; // 화폐매수
		boolean SW = false; // 스위칭 변수, 화폐의 다음 단위를 위해
		
		
		
		System.out.println("금액을 입력하세요");
		
		int money = Integer.parseInt(sc.nextLine()); // 입력받는 금액
		
		
		while (true) {
			num = money/unit;
		
			System.out.println("화폐단위 " + unit + " 원의 매수는 " + num + " 장");
			
			if (unit>1) {
				money = money - unit*num;
				
			} else {
				break;
			}
			
			if (SW == false) {
				unit = unit/2;
				SW = true;
			} else {
				unit = unit/5;
				SW = false;
			}
		
		}
		
		
///////////////////////////////////////////////////////////

	}


}