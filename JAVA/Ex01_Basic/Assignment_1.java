
public class Assignment_1 {

	public static void main(String[] args) {
		
		// 1. �̵ �ﰢ��
		for(int i = 1 ; i <=5 ; i ++) {
			for (int k = i; (5-k) >0 ; k++  ) {
			System.out.print(" ");}
			for (int k = 0 ; (2*i)-1>k ; k++ ) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}  //
		
		//2. ���̾Ƹ��
		 for (int i = 1; i <= 5; i++) {
			 // ��� ����
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				// ��� *
				for (int j = 0; j < i * 2 - 1; j++) {

					System.out.print("*");
				}
				System.out.println();
			} //for

			for (int i = 4; i >= 1; i--) {
				// �ϴ� ����
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
	            
				// �ϴ� *
				for (int j = 1; j <= i * 2 - 1; j++) {

					System.out.print("*");
				}

				System.out.println();
			} //for
		 
		
		
		
		
		
			}
		}
			
		
	
		
		
		
		
		
		
		
	
	
	



