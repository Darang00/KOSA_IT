
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		// ������ �л����� �⸻��� �������� �Դϴ�
		int [] score = new int[] {79, 88, 97, 54, 56, 95};
		int max = score[0];//max �������� 0��° ���� ���� ���� 79�� �� �ִ�
		int min = score[0];//min �������� 0��° ���� ���� ���� 79�� �� �ִ�
		
		
		
		/*
		 ����� ���ؼ� max ��� ������ �������� �� �ִ밪�� ���
		 min ������ �������� �� �ּҰ��� ��������
		 ��°��: max == 97, min == 54
		 ��) for���� �� ���� ���
		 */
		//��� 1:if�� ���
		for (int i = 0; i<score.length ; i++) { // int i = 0 �ƴϰ� 1�� �ȴ�
			// System.out.println(score[i]);
			if(score[i] > max) {max = score[i];	}
			if(score[i] < min) {min = score[i]; }
		}
		System.out.println("Using if method, the max is: "+ max);
		System.out.println("Using if method, the min is: "+min);
		
		//��� 2: 3�� ������
		for (int i = 0; i<score.length ; i++) {
			// System.out.println(score[i]);
			max = (score[i]>max) ? score[i] : max;
			min = (score[i]<min) ? score[i] : min;
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		//////////////////////////////////////////////////////////
		
		/*
		 ����: 
		 int[] number = new int[10];
		 �� �� 10���� ���� ���� 1~10������ �ʱ�ȭ �ض�
		 for���� ���ؼ�... [0] = 1, [9] = 10
		 */
		int[] numbers = new int[10];
		for (int i = 0; i<numbers.length ; i++) {
			numbers[i] = i+1;
			// 0 == 1
			// 1 == 2	
		}
		for (int i = 0; i<numbers.length ; i++) {
			System.out.println(numbers[i]); }
			
		////////////////////////////////////////////////
		/*
		 ����: ��� �л��� �⸻��� ����(5����)
		 int[] jumsu = {100, 55, 90, 60, 78};
		 int sum = 0;
		 float avg = 0f;
		 
		 1. �� ������ ��
		 2. ������ ��
		 3. ������ ���
		 ��, 2, 3������ �ϳ��� for������ �ذ�
		 */
		int[] jumsu = {100, 55, 90, 60, 78};
		 int sum = 0;
		 float avg = 0f;
		 
		 //1.
		 System.out.println(jumsu.length);
		 
		 //2, 3.
		 
		 for (int i = 0; i<jumsu.length ; i++ ) {
			 sum +=jumsu[i];
			 if(i == (jumsu.length -1)) { // ������ ���̶��
				 avg = sum/(float)jumsu.length;				 
			 }
			 
		 }
		 System.out.printf("total modules: [%d], total score: [%d], mean: [%f]", jumsu.length, sum, avg);
		 
		
		

	}

}
