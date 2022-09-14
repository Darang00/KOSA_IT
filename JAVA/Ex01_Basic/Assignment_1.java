
public class Assignment_1 {

	public static void main(String[] args) {
		
		// 1. 이등변 삼각형
		for(int i = 1 ; i <=5 ; i ++) {
			for (int k = i; (5-k) >0 ; k++  ) {
			System.out.print(" ");}
			for (int k = 0 ; (2*i)-1>k ; k++ ) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}  //
		
		//2. 다이아몬드
		 for (int i = 1; i <= 5; i++) {
			 // 상단 공백
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				// 상단 *
				for (int j = 0; j < i * 2 - 1; j++) {

					System.out.print("*");
				}
				System.out.println();
			} //for

			for (int i = 4; i >= 1; i--) {
				// 하단 공백
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
	            
				// 하단 *
				for (int j = 1; j <= i * 2 - 1; j++) {

					System.out.print("*");
				}

				System.out.println();
			} //for
		 
		
		
		
		
		
			}
		}
			
		
	
		
		
		
		
		
		
		
	
	
	



