/*
 If���� true �ƴϸ� false, �� boolean���� ����� ������ ���ǽ��� �־�� �ϸ� �� ���ǽ��� ����� �����ϴ� ������ �����ϰ� �Ǵ� ����̴�.
  > ����: [�ܼ� if��], [���� if~else��], [���� if��]
  
  1. �ܼ� if��: �� ���� �������� ���� ���� ó�������� �ִ� ���
     If(���ǽ�) {
     ���ǿ� ������ �� ������ ����
     }
  2. if ~else��: �� ���� ���Ŵɷ� ���� ��� ������ �� ó�������� ���� ���еǴ� ���
   1) ������ ������ ���� �������� ���� ��, ���� ���� �ٸ� ���๮���� ����
   2) ������ ������ �� ���� �̻��� ��� brace{}�� ���ξ� �Ѵ�.
    if(���ǽ�)
    {���� ������ ������ ����;}
    else
    {���� �Ҹ����� ������ ����;}
  3. ���� if��: ���� ���� �������� ���� ���� ó�������� �ְ�, ������ ���� �ٽ� ���� ���Ͽ� ��ø������ �� ó���Ǵ� ���
     ���� �񱳰� �� ������ ���ġ ���� ��쿡 ����ϴ� ����.
 */
public class Ex_if {

	public static void main(String[] args) {
		
		/*����1. �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 (1) 1 2 
		 (2) 10 2
		 (3) 5 5
		 */
		
		/*
		//���� 1��
		int A1 = 1;
		int B1 = 2; 
		
		//���� 2��
		int A2 = 10;
		int B2 = 2;
		
		//���� 3��
		int A3 = 5;
		int B3 = 5;
		
		
		if (A2 > B2) {
			System.out.println("A > B");
		}
		
		if (A1 < B1) {
			System.out.println("A < B");
		}
		
		if (A3 == B3) {
			System.out.println("A = B");
			
		}
       */
		
	/* ���� 2. ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	          ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	 */
		
		 //Ǯ�� 1
		 
		 int SCR = 91 ;
		
		String GRD = "";
				
		if (SCR>=90) {
			GRD = "A";
			 }
			
		else  {
			if (SCR>=80) {
			GRD = "B";
			}
			else {
				if (SCR >=70) {
					GRD = "C";
					}
		
			else  {
				if(SCR >=60) {
					GRD = "D"; }}
		
		if (SCR <60) {
			GRD = "F";
		
		}
		
			
		}
		}
	System.out.println("����� ����� " + GRD);
	

	}
}
	
 

	
	

