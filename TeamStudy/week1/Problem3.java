package week1;

import java.util.Scanner;

public class Problem3 {
	//3. ������������ �о �� �ڸ����� ����ϴ� ���α׷� �ۼ�.���� 4-9 (123p)
	
	public static void main(String[] args) {
		System.out.println("Enter a positive integer number");
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt(); // a variable num is initialized by a putted integer number		
		//int share = 10; // deviding number 10 is putted in the variable share
		//int portion ; // resulted integer portion by 10
		int count = 0;
		 while(num!=0) {
			 count++ ;
			num = num/10;
			 
		 } 
		 
		 System.out.println("The digit of the number you entered is " +  count);
		 
		
		
	
		
		
/////////////////////////
	}

}