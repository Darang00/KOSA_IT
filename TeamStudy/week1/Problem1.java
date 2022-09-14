package week1;

import java.util.Scanner;

//package study.team2.week1;

public class Problem1 {
	//1. 입력한 점수에 따라 수/우/미/양/가 판정하는 프로그램 작성(점수 기준 판정은 각자 알아서 정하기.
	// 문제 3-11 (74p)

	public static void main(String[] args) {
		
		System.out.println("당신의 점수를 입력하세요");
		Scanner sc = new Scanner (System.in);
		int score = Integer.parseInt(sc.nextLine());
		
		 if (score >= 90) {
			 System.out.println(score + "점 은 '수'에 해당합니다");
		 } else if (score >= 80) {
			 System.out.println(score + "점 은 '우'에 해당합니다");
		 } else if (score >= 70) {
			 System.out.println(score + "점 은 '미'에 해당합니다");
		 } else if (score >= 60) {
			 System.out.println(score + "점 은 '양'에 해당합니다");
		 } else {
			 System.out.println(score + "점 은 '가'에 해당합니다");
		 } 
		
		
		
///////////////////////
	}

}
