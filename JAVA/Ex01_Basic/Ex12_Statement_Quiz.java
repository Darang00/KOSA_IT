import java.util.Scanner;
public class Ex12_Statement_Quiz {

	public static void main(String[] args) {
		//�޴��� �����ְ� ����ڿ��� ����....
		//�ٸ� ���� �����Ѵٸ� �ٽ� �����ϵ��� �����ϴ� �޴�
		//while(true)
		//do~ while()

		
	/*1. while�� ����� ��
		boolean auto = true;
		int balance = 0; // �ܾ�
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("********************************");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("********************************");
			
			System.out.println("�����ϼ���");
			
			int input = Integer.parseInt(sc.nextLine());
			
			//�Ǵ�
			switch(input) {
				case 1: System.out.println("����ó��..");
						balance += Integer.parseInt(sc.nextLine());
						break;
				case 2: System.out.println("���ó��..");
						balance += Integer.parseInt(sc.nextLine());
						break;
				case 3: System.out.println("�ܰ�");
						balance += Integer.parseInt(sc.nextLine());
						break;
				case 4: System.out.println("�����մϴ�");
						balance += Integer.parseInt(sc.nextLine());
						auto = false;
						break;
				default : System.out.println("�ùٸ� �޴��� �����ϼ���");
			}
			
			if(auto == false) {
				break; // �Ǵ� 
				
			}
			
		} */
		
		
		//2. ��������������
		boolean auto = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**************************************");
			System.out.println("1. ���� | 2. ���� | 3. �� �� �ϳ��� �Է��ϼ���");
			System.out.println("**************************************");
			
			System.out.println("����");
			int input = Integer.parseInt(sc.nextLine());
			int random = (int)(Math.random()*3)+1;
			String a ="";
			String b = "";
			if (random == 1) {
				a = "����";
			}
			
			else if (random == 2) {
				a = "����";
			}
			
			else if (random == 3 ) {
				a = "��";
			}
			
			if (input == 1) {
				b = "����";
			}
			
			else if (input == 2) {
				b = "����";
			}
			
			else if (input == 3 ) {
				b = "��";
			}
			
			
		if(input == random) {
			System.out.println(b + "vs" + a);
			System.out.println("��Ű� ��ǻ�� ��� " + a + " �� �����Ͽ� �����ϴ�");
             	}
		else if((input - random)==-2 || (input - random)==1) {
			System.out.println(b + "�� ������ ����� ��ǻ�� (" + a + ")�� �̰���ϴ�");
		}
		else if ((input - random)==2 || (input - random)==-1 ){
			System.out.println(b + "�� ������ ����� ��ǻ��(" + a + ")�� �����ϴ�");
		}
		else {
			System.out.println("�ٽ� �Է��� �ּ���");
		}
		
	
		}
	}

		
}
