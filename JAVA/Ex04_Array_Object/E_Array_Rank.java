
public class E_Array_Rank {

	public static void main(String[] args) {
		/*
		 ������ �迭(2����)
		 [��][��]
		 ��ȭ�� �¼�, ���� ��ǥ��, ����, ����
		 
		  ��ȭ�� ���� �ּ�... ���� ���α׷�
		 */
		
		int[][] score = new int[3][2];
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		//for�� ����ؾ� ��(��ø for)
		//���� ����: �迭�̸�.length >> score.length >> 3
		//���� ����: ��Ʈ; 2���� �迭�� �׸� >> score[i].length >> ���� ���� >> point
		//https://cafe.naver.com/kosait/179
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\t", i, j, score[i][j]);
			}
			System.out.println();
		}
		int [][] score3 = new int[][] {{11, 12}, {13, 14}, {15, 16}}; //�߰�ȣ ���� �߰�ȣ: ���� ����
		
		//Ŀ�� ����
		//������ for������ ����ض�
		for (int [] r: score3) {// ���� �ּҰ�
			for(int c : r) {// ���� �迭 ���� ���
				System.out.println(c);
				
			}}
		}
		
	}

