import java.util.Random;
import java.util.Scanner;

class Test {

public String addCoupon() { //���� �߰�
	
	Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ������ ������ �Է��ϼ���");
		int couponNum = scan.nextInt(); // ���� ������ŭ for�� ���� �Ŵ�
		
		System.out.println("������ ������ �������� �Է��ϼ��� (�� �ڸ� ���� �Է��ϼ��� / ��: 07, 15)");
		int discountRate = scan.nextInt(); //���� �� ���ڸ� �� ���� ������(�� �ڸ� ��)�� �ȴ�.
		
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