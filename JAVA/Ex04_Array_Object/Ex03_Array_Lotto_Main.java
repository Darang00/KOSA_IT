/*
 1. 1~45 ������ ������ �߻����Ѽ� 6���� �������� �迭�� ��������
 2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵȴ� (�ߺ��� ����)
 3. �迭�� �ִ� 6���� ���� ���� ������ ���� ���Ѷ�(����: �ڸ��ٲ� : swap)
 4. �� ����� ����ִ� �迭�� ����ϼ���
 
 main �ȿ��� ��� �ۼ��ϼŵ� �ǰ��
 
 static �Լ��� ����� ��� ������ ���� ����
 
 (int)(Math.random()*(44)+1);
 
 ������ Lotto.java Ŭ������ �������� ������...
 */

public class Ex03_Array_Lotto_Main {
	
	static int ran() { //���� ���� �޼ҵ�
		return (int)(Math.random()*(45)+1);	
	}
	
	static boolean verify(int[] copy, int num) { //�ߺ��� ���� �޼ҵ�
		for (int i = 0; i<copy.length; i++) { // (���� i�� �ʱⰪ�� 0; ���ǹ� i�� copy��� �迭�� ���� �������� ���� �� ; ���� i�� 1 ������Ų��)
			if(num == copy[i]) {
				//System.out.println("�ߺ� �߻�");
				return false;
				}
			}
		return true;
		}
	
	////////////////////////////////////////////////////////////////////
		
	
	

	public static void main(String[] args) { // main() method ����
		
		//int temp = 0;
		int num = 0; // ���ú���(main() method �� �ҼӵǾ� �����Ƿ� )
		
		int[] lotto = new int[6]; // ���� 6���� �迭 ��ü�� ����
		
		
		for (int i = 0; i<lotto.length ; i++) {
			while(true) {
				num = ran(); // static ���� �������� ran() method���� ����� ������ num ���� �Ҵ�
				
				//������ �迭�� ���ִ� ���� �������� ��(�ߺ��� ���� ������ �ȵǴϱ�)
				//(parameter�� ���� index, ��)
				if (verify(lotto, num) ) { // if���� (���ǹ�)�� true�� false ��ü�� �� �� ����. if�� (���ǹ�) �� true �� {���๮} ���� ������ �����ϰ� �ƴϸ� �� ���๮�� ���´�.
					lotto[i] = num; // ������ �迭�� ����
					break; //return: �޸� ��ȯ �� ���α׷� ����, break: ���� �������� �ҽ��ڵ�(�ݺ���)�� ����
					}
				
				/*else {
					num = ran();
				} */ //if �� ���ǹ� verify �޼ҵ尡 false�̸� �� �� �� random�� �����ϴ� �� else�� �־��ִ� ���� �� ��Ȯ�ϱ� ��
				
				}
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
			
			
			
		
		
		
		

	}

}

