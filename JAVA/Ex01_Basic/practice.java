
public class practice {
	public static void main(String[] args) {
	
	//Problem1. ���ĺ�(A~Z) ���� ����ϴ� ���α׷��� �ۼ��ϼ��� (for�� ���)
	for(char i=65; i<91 ;i++) {
		System.out.print(i);
	}
	
	System.out.println();
	
	//Problem2. 1~100���� 10�� 10���� ����ϴ� ���α׷��� �ۼ��ϼ���
	int a=1;
			
	for(int i=0; i<10; i++) {
		
		for (int j=0; j<10; j++) {
			System.out.print(a++ + " ");
		}
		System.out.println();
	}
	
	//�ٸ� Ǯ��
	for(int i=1; i<=100; i++) {
		System.out.print(i+" ");
		if(i%10 == 0) {
			System.out.println();
		}
	}
	
	//�ٸ�Ǯ��
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			System.out.print((10*(i)+ (j+1)) + " ");
		}
		System.out.println();
	}
		
	
	//Problem3. �� ���� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ��� 
	System.out.println("���� ���� 6�� �Ǵ� �ֻ����� ������: ");
	for (int p=1 ; p<7; p++) {
		for (int q=1 ; q<7; q++) {
			if (p+q==6) {
				System.out.print( "("+p+" ,"+q+")");
				
			}
				
			}
			
	
	}

}
}
