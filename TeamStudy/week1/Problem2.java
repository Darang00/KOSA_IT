package week1;

import java.util.Scanner;

public class Problem2 {
	//2. 2�옄由ъ쓽 �젙�닔媛�(10~99)�쓣 留욎텛�뒗 '�닽�옄 留욎텛湲� 寃뚯엫'�쓣 留뚮뱾�옄. �궃�닔�깮�꽦怨� if臾� 洹몃━怨� do 臾몄쓣 �궗�슜�븷寃�. 臾몄젣4-3 (110p)
	
	public static void main(String[] args) {
		
		int target = (int)((Math.random() * 89 ) + 10) ;
		// System.out.println(target);
		Scanner sc = new Scanner (System.in); 
		int number;  
		
		do {
		System.out.println("Enter a number between 10 to 99"); 
		number = Integer.parseInt(sc.nextLine());
		
		if (number > target ) {
			System.out.println("down");
		} else if (number < target) {
			System.out.println("up");
		} else if (number == target) {
			System.out.println(number + " is correct");
		}
		
		} while (target != number) ; 
			
		
		
		
		
		

	}

}
