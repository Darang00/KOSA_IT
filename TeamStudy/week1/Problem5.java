package week1;

import java.util.Scanner;

public class Problem5 {
	//5. 1���� n������ ������ ���� ���ؼ� ��ȯ�ϴ� �޼��� �ۼ�. 7-4 (268p) //�޼��� �ۼ��� ��Ű���� ���� �������.
	static int num ;
	static int subsum;
	static void sum() {
		for (int i = 1; i <= num ; i++) {
			subsum += i ;
			
		} return; // Question: what this "return" returns?? Does it return "subsum"..?
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer number that you want to sum");
		
		num = scan.nextInt();
		
		sum();
		
		System.out.println("The total sum of your number is " + subsum);
		
		
		

	}

}

// It's going okay but still being confused..