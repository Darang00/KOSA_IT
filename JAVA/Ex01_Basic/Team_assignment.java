import java.util.Scanner;

public class Team_assignment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int unit = 10000; // ȭ�����
		int num = 0; // ȭ��ż�
		boolean SW = false; // ����Ī ����, ȭ���� ���� ������ ����
		
		
		
		System.out.println("�ݾ��� �Է��ϼ���");
		
		int money = Integer.parseInt(sc.nextLine()); // �Է¹޴� �ݾ�
		
		
		while (true) {
			num = money/unit;
		
			System.out.println("ȭ����� " + unit + " ���� �ż��� " + num + " ��");
			
			if (unit>1) {
				money = money - unit*num;
				
			} else {
				break;
			}
			
			if (SW == false) {
				unit = unit/2;
				SW = true;
			} else {
				unit = unit/5;
				SW = false;
			}
		
		}
		
		
///////////////////////////////////////////////////////////

	}


}