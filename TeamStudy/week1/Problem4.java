package week1;

import java.util.Scanner;

public class Problem4 {
	//4. "�ȳ��ϼ���"��� ǥ���ϴ� hello �޼��� �ۼ�. 7-5 (270p) 
	//main �Լ����� scanner�� �ݺ����� ����Ͽ�, hello �޼ҵ带 10�� �̻� ȣ���Ͽ� ����ϱ�)!!!!
	
	static void hello() { // hello method
		System.out.println("Hello :)");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter a number that you want to say hello"); // Entering how many times you want to say hello
		Scanner scan = new Scanner(System.in); // Waiting for get input
		
		int num = scan.nextInt(); // The integer variable num is initialized by your number
		
		
		for (int i = 0 ; i <= num; i++ ) { // Reapeating calling hello method
			hello();
			
			
		}
		
		

	}

}