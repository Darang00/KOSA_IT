package week1;

import java.util.Scanner;

public class Problem4 {
	//4. "안녕하세요"라고 표시하는 hello 메서드 작성. 7-5 (270p) 
	//main 함수에서 scanner와 반복문을 사용하여, hello 메소드를 10번 이상 호출하여 출력하기)!!!!
	
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