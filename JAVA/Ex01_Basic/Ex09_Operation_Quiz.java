import java.util.Scanner;

public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//////////////////////////////////////////////////////////
		
		/* ����
		������ ��Ģ ����� (+ , - , * , /)
		�Է°� 3�� (�Է°��� nextLine() �޾Ƽ� �ʿ��ϴٸ� ���� ��ȯ)
		���� : Integer.parseInt() ,  **equals() Ȱ��**
		ȭ��
		>�Է°�:����
		>�Է°�(��ȣ): +
		>�Է°�:���� 
		>������ :200
		-------------

		>�Է°�:100
		>�Է°�(��ȣ): -
		>�Է°�:100
		>������ :0
		*/
		
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc1 = new Scanner (System.in);
		int number1 = Integer.parseInt(sc1.nextLine());
		//System.out.println("������ : " + number);
		
		System.out.println("��ȣ�� �Է��ϼ���");
		
		String op = sc1.nextLine();
		
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		int number2 = Integer.parseInt(sc1.nextLine());
		
		
		int number3 =0;
		
		if(op.equals("*")) {
			 number3 = number1 * number2;
		
		}
		else if(op.equals("/")) {
			number3 = number1 / number2;
			
		}
		else if(op.equals("+")) {
			number3 = number1 + number2;
			
		}
		else if(op.equals("-")) {
			number3 = number1 - number2;
			
		}
		
		System.out.println("��: " + number3);
		
		
	
		
////////////////////////////////////////////////////////
	}

}
