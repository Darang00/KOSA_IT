package week2.chap05;

import java.util.Scanner;

public class Won2Dollar {
	double i;

	
	

	public Won2Dollar(double i) {
		this.i = i;
		
	}
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원을 달러로 바꿉니다");
		System.out.print("원화를 입력하세요 >>");
		double money = scanner.nextDouble();
		//int money2 =  scanner.nextInt();
		//System.out.println("변환 결과: " + (double)money/i + "달러 입니다");
		System.out.println("변환 결과: " + money/i + "달러 입니다");
		//double/int = double
		
		
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); //1달러는 1200원
		toDollar.run();
		

	}

}
