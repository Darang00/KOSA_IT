
public class practice {
	public static void main(String[] args) {
	
	//Problem1. 알파벳(A~Z) 까지 출력하는 프로그램을 작성하세요 (for문 사용)
	for(char i=65; i<91 ;i++) {
		System.out.print(i);
	}
	
	System.out.println();
	
	//Problem2. 1~100까지 10행 10열로 출력하는 프로그램을 작성하세요
	int a=1;
			
	for(int i=0; i<10; i++) {
		
		for (int j=0; j<10; j++) {
			System.out.print(a++ + " ");
		}
		System.out.println();
	}
	
	//다른 풀이
	for(int i=1; i<=100; i++) {
		System.out.print(i+" ");
		if(i%10 == 0) {
			System.out.println();
		}
	}
	
	//다른풀이
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			System.out.print((10*(i)+ (j+1)) + " ");
		}
		System.out.println();
	}
		
	
	//Problem3. 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요 
	System.out.println("눈의 합이 6이 되는 주사위의 조합은: ");
	for (int p=1 ; p<7; p++) {
		for (int q=1 ; q<7; q++) {
			if (p+q==6) {
				System.out.print( "("+p+" ,"+q+")");
				
			}
				
			}
			
	
	}

}
}
