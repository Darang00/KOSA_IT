import java.util.Arrays;

/*
 �迭�� ��ü�� (Array)
1. new�� ���ؼ� ����
2. heap �޸𸮿� �����ȴ�. > �����Ǵ� �ڿ��̴�(garbage collector�� �����ϹǷ� ���������� ������ �ʿ� ����)
3. *** �����迭(�����迭): �迭�� �� �� �����ϸ� (ũ�Ⱑ ��������) ���� �Ұ� *** <=> collection(�����迭): �����̴�
4. *** �ڷᱸ��(�˰���) �������� �н� ***

 
 
 */
public class Ex01_Array_Basic {
	

	public static void main(String[] args) {
		// ���� Ÿ���� ���� �������� �����ؼ� �����͸� ó���ϼ���
		int s;
		int s1;
		int s2;
		int s3; // ��ȿ����
		
		int a, a1, a2, a3; //��ȿ����
		
		//�迭
		int[] score = new int[4]; //����: Ÿ��[] = new Ÿ��[��ũ��];
		//score(101��) >101ȣ, 102ȣ...
		//int Ÿ���� �� 4�� ����... heap ���ӵ� ������ >> ���̸�(index(÷��) : [0], [1], [2], [3])
		System.out.println(score[0]); // score�迭�� 0��° �� �� ����ض�
		score[0] = 101;
		score[1] = 20;
		score[2] = 300;
		score[3] = 500;
		//score[4] = 111; 
		//Error: ���� ���� ��ȣ�� ���. java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		//���� ������ �׻� index ������ 1�� ũ�� (n-1 �� ���� ������ index)
		System.out.println(score[3]);
		
		//Array �迭 ���� ���: for
		for(int i = 0; i<4 ; i++)
		{
			System.out.printf("[%d] = %d\t", i, score[i]);
		}
		
		System.out.println(); 
		
		for(int i = 0; i<score.length ; i++) { // score.length: �迭�� ����
			System.out.printf("[%d] = %d\t", i, score[i]);
		}
		
		System.out.println();
		//Tip: Arrays.toString(score) ���� ������ (�Ƿ��� ����): ...
		String resultArray = Arrays.toString(score);
		System.out.println(resultArray); // [101, 20, 300, 500]
		
		//Tip: sort ��а� ���� ������. sort �� ũ�⸦ �����ź��� ū �ŷ� �����ϴ� �޼ҵ�
		Arrays.sort(score);
		resultArray = Arrays.toString(score);
		System.out.println(resultArray); // [20, 101, 300, 500]
		
		//���� �˰��� (�ּ� ��������)
		
		//Today point
		//�迭 ���� 3���� ���(*�ϱ�*)
		int[] arr = new int[5]; // �⺻
		int[] arr2 = new int[] {100, 150, 200}; // �ʱⰪ�� ���ؼ� �迭�� ������ �����ϰ� ���� �Ҵ�
		int[] arr3 = {11, 22, 33};//�����Ϸ����� �ڵ����� new��� �κ��� ��Ź�ϴ� �� *** ���� ����
		//Tip) javascript) let cararr = [1, 2, 3, 4, 5];
		
		for (int i = 0; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
		// �迭�� ��ü��(new�� ���ؼ� ����� heap�޸𸮿� �ε� �ȴ�)
		int [] arr4;
		arr4 = new int[] {21, 22, 23, 24, 25};
		System.out.println(arr4); // �ּҰ�: I@7e0e6aa2
		
		int[] arr5 = arr4;
		System.out.println(arr4 == arr5);
		
		// �迭�� Ÿ�� : 8���� �⺻ + String + Ŭ���� (Ÿ��)
		String[] strarr = new String[] {"��", "��", "�ٶ�"};
		for (int i = 0;i< strarr.length ; i++) {
			System.out.println(strarr[i]);
		}
		
		char[] carr = new char[5];
		float[] farr = new float[4];
		
		/*
		 class Car {}
		 */
		
		//Car[] carrarr = new Car[5];
		
		
		
		
		
	
		
	}

}
