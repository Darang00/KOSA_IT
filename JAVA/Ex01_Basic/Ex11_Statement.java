import java.util.Scanner;
public class Ex11_Statement {

	public static void main(String[] args) {
		// �ݺ��� (while, do ~while)
		//int i = 10;
		//while (i>=10) {
			//�ݵ�� 
			//�������� ���
			//i--; //�������� ��ġ�� ������� ^^
			//System.out.println("i : " + i);
		//	i--;
		//}
		
		//while�� 1~100������ ��
//		int sum = 0;
//		//int j = 1;
//		while (j<=100) { // for (int j = j; j <= 100 ; j++)
//			sum+=j;
//			j++;
//		}
//		System.out.println("sum : " + sum);
//		
		
		//while �������� ����ϼ���
		//for(int i = 2; i <= 9 ; i++);
		// for(int j = 1 ; j <= 9 ; j++)
		
		//while 2��
		
		int i = 2;
		int j = 1;
		while (i<=9) {
			j = 1;
			while (j<=9) {
				System.out.printf("[%d]*[%d] = [%d]\t", i, j, i*j);
				j++;
				
			}
			System.out.println();
			i++;

		}
		System.out.printf("i:%d, j: %d \n", i, j );
		
		//
		//for(;;) {}
		//while(true) { if(����)break; }
		//do ~while : �ϴ� �� ���� ���������� �����ϰ�, �׸��� ������ ���� �Ǵ��ض�
		//do {���๮ ... ���� �޾ƿ�} while(���� �Ǵ�)
		//�޴� ����
		//���� �޴� �����ϼ���
		//1. ¥��
		//2. «��
		//��� 3 �Է� -> �Է¸޴��� �ٽ� ���ͼ� �ٽ� �Է¹ް�..
		
		//���α׷� ����
		//����� ���ϴ� �޴� ��ȣ�� �����ϼ��� >> Do�� ����.. ���ð� �޾Ƽ�
		//while(input > 2) �ٽ� �Է��ϼ���. >> while false ������ ����
		
		Scanner sc = new Scanner(System.in);
		int inputdata = 0;
		do {
			System.out.println("���� �Է��� (0~9)");
			inputdata = Integer.parseInt(sc.nextLine());
		} while(inputdata >= 10); //true�� �Ǹ� do�� ����
		
		System.out.println("����� �Է��� ���ڴ� :" + inputdata);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////////////////////////
		
	}

}
