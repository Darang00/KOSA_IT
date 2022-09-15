import java.util.HashMap;
import java.util.Scanner;

public class Ex14_Map_Quiz {

	public static void main(String[] args) {
		/*
		 Map ����ؼ� �����ϴ� ������ ����:
		 ������ȣ, �����ȣ, ȸ������(id, pw) ���� ����
		 
		 */
		HashMap loginmap = new HashMap();
		loginmap.put("kim", "kim1004");
		loginmap.put("scott", "tiger");
		loginmap.put("lee", "kim1004");
		
		/*
		 �츮 �ý����� ȸ�� ������ ȸ���� id, pw ������ ������ �ִ�.
		 �α��ν� id�� pw �� Ȯ���ؼ� ȸ���̶�� ����Ʈ�� ���� ����
		 
		 id(O), pwd(O) >> ȸ��                  1
		 id(O), pwd(X) >> ��й�ȣ�� �ٽ� �Է�      2
		 
		 id(X), pwd(O) >> ȸ���������� ����
		 id(X), pwd(X) >> ȸ���������� ����        3
		 
		 */
		
		Scanner sc  = new Scanner(System.in);

		while(true) {
			//id�� pwd ��������
			//id�� ������ ���� >> �ҹ��� ��ȯ (String �Լ�)
			//pwd ���� ���� 
			/*
			 id(O), pwd(O) >> ȸ���� �氡�氡 ����ϼ���                   1
		 	 id(O), pwd(X) >> id, pw Ȯ���� �ּ���(�Է� �ٽ� �ް�..)       2
		 
		 	 id(X), pwd(O) >> id ���Է� �ϼ��� ��� id, pw �Է�
		 	 id(X), pwd(X) >> id ���Է� �ϼ��� ��� id, pw �Է�     3
		 	 3���� ���� if������ ����
			 */
			System.out.println("id, pwd  �Է��� �ּ���");
			
			System.out.println("ID");
			String id = sc.nextLine().trim().toLowerCase();
			
			System.out.println("PWD");
			String pwd = sc.nextLine().trim();
			
			if(!loginmap.containsKey(id)) {
				//id(x)
				System.out.println("id ���� �ʽ��ϴ� ... ���Է� �ϼ���");
			} else {
				//id(O)
				if(loginmap.get(id).equals(pwd)) {
					System.out.println("ȸ���� �氡�氡 ^^");
					break;
				} else {
					System.out.println("��й�ȣ Ȯ���ϼ���");
				}
			}

		}
		
	}

}
