package week1;
// **�߰�ȣ �迭 ����: ctrl+shift+F > �ڵ� �� ���� ó��

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
		double average = (this.math+this.science+ this.english)/3.0; // type���� ������ �� 3��double  type����
		return average;
	} 
	
	
}

public class Problem8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average()); // average(); �� ����� ����Ͽ� ����
		
		scanner.close();
	}

}
