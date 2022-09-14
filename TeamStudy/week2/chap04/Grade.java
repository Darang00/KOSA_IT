package week2.chap04;

import java.util.Scanner;

public class Grade {
	//Field
	private int math;
	private int science;
	private int english;
	
	//Constructor
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	//Method
	int average() {	
	return (math + science + english)/3 ; 
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks of Math, Science, and English in order");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade me = new Grade(math, science, english); // Since the Constructor was declared in the upper class, the parameters matched to the types and numbers should be put
		System.out.println("The average is " + me.average());
		
		sc.close();

	}

}
