//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ... �ϴ� ����
//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ�     ��:7�ڸ�
//�Է°� : 123456-1234567 

//static �Լ��� ��� �����
//1. �ڸ��� üũ (���)�Լ� (14 ok)  return true , false 
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�  return true, false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�  void  ���
import java.util.Scanner;

 class test{
	static String idNum;
	private static int[] totalIDnum; 
	
	static boolean checkDigit(  ) {   // method of checking digits of the input
		return false; 
		
	} 
	
	static boolean allowValue(  ) {   // method of checking if the first value is allowed
		return false;
	} 
	
	static void print(String numArray) {
		
		totalIDnum = new int[13];
		for (int i=0; i < numArray.length(); i++ ) {
			totalIDnum[i] = Integer.parseInt(numArray.substring(i, i+1));
			System.out.println("i : "+ i  + "total : "+totalIDnum[i]);
		}
		
		if (totalIDnum[6] ==1 || totalIDnum[6] ==3) {
		System.out.println("����"); }
		
		else if (totalIDnum[6] ==2 || totalIDnum[6] ==4) {
			System.out.println(totalIDnum[6]);
			System.out.println("����");
			}
		} 

}

public class Ex07_String_Total_Quiz {
		
	
	
	
	
	public static void main(String[] args) {
		
		test test1 = new test();
		
		System.out.println("Enter your ID code");
		Scanner sc = new Scanner(System.in);

		test1.idNum = sc.nextLine(); // Input is String type
		//System.out.println(idNum); //checking if the input is String or Int
		
		String numArray = test1.idNum.replace("-", "") ; 
		
		test1.print(numArray);
		
		 
		

		
		
		
		
		
	
		// System.out.println(numArray);
		
		
		
		

	}

}
