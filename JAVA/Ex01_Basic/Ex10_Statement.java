
public class Ex10_Statement {

	public static void main(String[] args) {
		// ���
		// ���ǹ� : if (3����) , switch(����) {case ��... break}
		// �ݺ��� : for (�ݺ�Ƚ���� ��Ȯ), while(����) {} , do{} ~ while()
		// �б⹮ : break(�� Ż��), continue (�Ʒ����� skip)
		
//		int count = 0; 
//		if(count <1 ) System.out.println("true");
//		if(count<1 ) {
//			System.out.println("true");
//		}
//		
//		char data='A';
//		switch(data) {
//		 case 'A': System.out.println("���� �� ���ƿ�");
//		 	break;
//		 case 'B':
//			 break;
//		default : System.out.println("������ ó��...");
//		
		//for��
		//1~100 ������
		//int sum =0;
		//for(int i = 1 ; i <= 100 ; i++ ) {
		//System.out.println("i : " + i);
		//sum = sum + i;
			//sum+=i;
		//}
		//System.out.printf("1~100������ : %d \n", sum);
		
		//1~5������ ��
		//for���� while ���� ����
		//���� * (���� + ��) /2
		//sum= 5* (1+5)/2; // ���� ������.. �츮 for��
		//System.out.println("sum: " + sum);
		
		//for ���� ����ؼ� 1~10������ Ȧ���� ���� ���ϼ���
		//�� for���� ��� (for�� �ȿ� if�� ������� ������)
		//for(�ʱⰪ ; ���ǽ� ; ������)>> ������ ����
		//1, 3, 5, 7, 9...
		//sum2 = sum2 + i (1, 3, 5)
		
		int sum2=0;
		for(int i=1; i<4 ; i+=2) { // i = i+2 //���� ǥ��
			sum2+=i;
			//sum2 = 0+1
			//sum2 = 1+3
			//...
	
		}
		System.out.println("sum2 : "+sum2);
		
		//for�ȿ� if���� ����ؼ� 1~1000������ ���� ���ϼ���(¦��)
		
		int sum3 =0;
		for (int i = 1 ; i <= 100 ; i++) {
			//sum 3+=i;
			if(i % 2 == 0) {
				System.out.println(i);
				sum3 +=i;
			}
		
		
		
		}
		System.out.println("sum3 :" + sum3);
		
		//�Ի���� (������)
		//��ø for ....
		//�� ���� ���� ���� ... �ݺ� (2��: 1~9, 3��: 1~9)
		
		for(int i = 2; i <=9; i++) { //i��� ������ ��ȿ����
			for(int j = 1; j <= 0 ; j++) { // j��� ������...
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i*j);
				
			}
			System.out.println(); //���� 
		}
		
		
		// for + (�б⹮) continue, break
		//Today point:continue (�Ʒ� ���� skip) , break(for , while �� Ż��)
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9; j++) {
				if(i == j) {
					break;
				}
				System.out.printf("%s", "*" );
			}
			System.out.println(); //����
		}
		
		for(int i = 2; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9; j++) {
				if(i == j) {
					continue; // �Ʒ� ���� skip
				}
				System.out.printf("[%d] * [%d] = [%d]\t", i, j, i*j);
			}
			System.out.println(); //����
		}
		
		for (int i = 2; i<=9 ; i++) {
			for (int j = 1 ; j < i; j++ ) { // j<=9 �ڵ带 ���� >> j <i ;
				System.out.printf("*");
			}
			System.out.println();
		}
		
		//100���� 0���� ��� // ������ -- i
		for(int i = 100 ; i>=0 ; i--) {
			System.out.println(i);
			
		}
		
		//�Ǻ���ġ ����
		
		
		
		
		
		
		
		///////////////////////////////////////////////////////////
		

	
	}
	
}
	


