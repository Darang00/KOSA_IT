import java.util.Scanner;

public class Ex08_printf_format {
	public static void main(String[] args) {
		//System.out.println();
		//C#: Console.WriteLIne();
		
		System.out.println();//����ϰ� �ٹٲ� (enter)
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();
		System.out.print("C");
		System.out.println();
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� " + num + " �Դϴ�");
		
		//���� format
		System.out.printf("num ���� %d �Դϴ�", num);
		System.out.println();
		System.out.printf("num ���� [%d] �Դϴ�. �� [%d] �� �־�� \n", num, 12345);
		//format ���� ����
		/*
		 %d (10���� ������ ����)
		 %f (�Ǽ�)
		 %s (���ڿ�)
		 %c (����)
		 \t tab , \n �ٹٲ�
		 
		 
		 
		 
		 */
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f������ %f �Դϴ� \n", f);
		
		//�Է¹ޱ� (cmd) ����ڰ� �Է��� ����...
		Scanner sc = new Scanner (System.in);
		//String value = sc.nextLine() ;
		//�Է��ϰ� ���͸� ĥ �� ���� ��� (���α׷��� ������� �ʰ� ��� ��ٸ���)
		//�Է��� ���� ���ڿ��� ������ �� ^^
		//System.out.println(value); 
		
		//int number = sc.nextInt();
		//System.out.println("number : " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("number :" +number);
		
		//������� : nextInt , nextFloat ���ٴ� nextLine() read Ÿ���� �ٲ���
		//Today point (8.24)
		
		//[���ڸ�] => ���� (����, �Ǽ�)
		//Integar.parseInt("11111") ->> ���� ->> 11111
		//Float.parseFloat("3.14") ->> �Ǽ� ->> 3.14
		
		System.out.println("���ڸ� �Է��ϼ���");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("������ : " + number);
		
		
		
		
		
		
	}

}
