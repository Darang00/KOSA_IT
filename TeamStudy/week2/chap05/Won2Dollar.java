package week2.chap05;

import java.util.Scanner;

public class Won2Dollar {
	double i;

	
	

	public Won2Dollar(double i) {
		this.i = i;
		
	}
	
	void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �޷��� �ٲߴϴ�");
		System.out.print("��ȭ�� �Է��ϼ��� >>");
		double money = scanner.nextDouble();
		//int money2 =  scanner.nextInt();
		//System.out.println("��ȯ ���: " + (double)money/i + "�޷� �Դϴ�");
		System.out.println("��ȯ ���: " + money/i + "�޷� �Դϴ�");
		//double/int = double
		
		
	}

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); //1�޷��� 1200��
		toDollar.run();
		

	}

}
