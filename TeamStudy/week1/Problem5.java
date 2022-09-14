package week1;

import java.util.Scanner;

public class Problem5 {
	//5. 1부터 n까지의 정수의 합을 구해서 반환하는 메서드 작성. 7-4 (268p) //메서드 작성시 패키지는 각자 마음대로.
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