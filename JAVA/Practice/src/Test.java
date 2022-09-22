import java.util.Random;
import java.util.Scanner;

class Test {

public String addCoupon() { //쿠폰 추가
	
	Scanner scan = new Scanner(System.in);
		
		System.out.println("발행할 쿠폰의 개수를 입력하세요");
		int couponNum = scan.nextInt(); // 쿠폰 개수만큼 for문 돌릴 거다
		
		System.out.println("발행할 쿠폰의 할인율을 입력하세요 (두 자리 수로 입력하세요 / 예: 07, 15)");
		int discountRate = scan.nextInt(); //쿠폰 맨 뒷자리 두 개는 할인율(두 자리 수)이 된다.
		
		int [] codeDigit = {1, 2, 3, 4, 4, 6, 7, 8, 9, 0};
		
		Random rdn = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int j = 0; j<=6; j++) {
			
			int tmp = codeDigit[rdn.nextInt(codeDigit.length)];
			sb.append(tmp);
		}
		return sb.toString() + String.valueOf(discountRate) ;	
}


public static void main(String[] args) {
	
	Test test = new Test();
	System.out.println(test.addCoupon());
}


}