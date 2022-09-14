package week1;
// **중괄호 배열 주의: ctrl+shift+F > 자동 줄 정리 처리

import java.util.Scanner;

class Grade{
	//field
	int math;
	int science;
	int english;
	
	//constructor
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	//method
	public double average() {
		double average = (this.math+this.science+ this.english)/3.0; // type주의 나누는 수 3도double  type으로
		return average;
	} 
	
	
}

public class Problem8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average()); // average(); 는 평균을 계산하여 리턴
		
		scanner.close();
	}

}
