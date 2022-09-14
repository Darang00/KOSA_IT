//import java.lang.*; �����Ǿ� �ִ�. ���� �ʾƵ� java.lang ���� �ȿ� �ִ� �ڿ��� �׳� ��밡��

public class Ex6_Operation {
	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //��
		System.out.println(result);
		
		//�������� ���ϴ� ������ (%)
		result = 13%2 ;
		System.out.println(result);
		
		// ����, ���� (������ ������ : ++ 1�� ���� , -- 1�� ����)
		int i = 10;
		++i; //��ġ����
		System.out.println("��ġ : " + i);
		i++; // ��ġ����
		System.out.println("��ġ : " + i);
		// ȥ�ڼ��� ��ġ, ��ġ�� �ǹ̰� ����. ���� ��
		
		//Today Point ( ������ �����ڰ� �ٸ� �����ڿ� ���յǸ� ��ġ, ��ġ�� ���� �߿�)
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2;
		System.out.println("result2 : " + result2 + " , j2 : " + j2);
		//���� result2 : 10 , j2 : 5
		
		result2= i2 + j2++;
		System.out.println("result2 : " + result2 + " , j2 : " + j2);
		
		byte b = 100;
		byte c = 1;
		
		//byte d = b + c ;
		//����: Type mismatch: cannot convert from int to byte
		byte d = (byte) (b + c) ; //���� 1: ���� �� 4Byte ������ ����ؼ� ���� int + int // �ս��� �� ���ɼ� ����
		int d2 = b + c ; // ���� 2: ����� Ÿ���� �����ؼ� (�ս��� �߻����� �ʴ´�)
		System.out.println("d�� ���: " + d);
		System.out.println("d2�� ���: " + d2);
		
		//Today Point
		/*
		 1. ������ ��� ������ [int] Ÿ�� ��ȯ �� ó���ϴ� ���� ����.
		 ex) byte + short => �����Ϸ��� ���������� int + int
		     char + char => �����Ϸ��� ���������� int + int
		     ���� ó����
		     ������ ���꿡�� int���� ���� Ÿ���� int�� ��ȯ ���Ѽ� ���� (��, int ���� ū long ����)
		     byte, char, short >> ����ÿ��� int�濡 �־ ��� > �� ���: int
		     
		     char + int >> int + int
		     int + long>> long + long ���������� .....
		     
		     ���� + �Ǽ� >>Ÿ���� ũ��� ��� ���� >> �Ǽ� ����
		     
		     
		 */
		 long ln = 100000000000L;
		 float fl = 1.2f ;
		 //long lnresult = ln + fl; //����: Type mismatch: cannot convert from float to long
		 long lnresult = (long) (ln+fl); //���� 1: Add cast to 'long' �սǹ߻� ����
		 System.out.println("lnresult : " + lnresult);
		 float lnresult1 = ln + fl; // ����2: Change type of 'long' to 'float'
		 System.out.println("lnresult1 : " + lnresult1 );
		 //long�� ����, float�� �Ǽ��� long + float >> float ���� ó���Ѵ�.
		 
		 float num2 = 10.45f;
		 int num3 = 20;
		 //num2 + num3
		 //float + int �� �����ϸ� >> float + float �� ó���ȴ�.
		 float result5 = num2 + num3;
		 System.out.println(result5);
		 
		 char c2 = '!'; //33
		 char c3 = '!'; //33
		 //c2 + c3
		 int result6 = c2 + c3;
		 System.out.println("result 6 :" + result6); // ���: 66
		 
		 // ���
		 
		// �߼ұ�� ���蹮�� (������ ���) >> �ﰢ�� ����� >> ����
		 int sum = 0; //local vaiable >> ������ �ʱ�ȭ
		 
		 for (int j = 1; j <=100 ; j++) {
			 //sum = sum + j;
			 //sum+=j; // sum = sum + j �� �Ȱ���.
			 if(j % 2 == 0) { //¦�����
				 sum +=j; //¦���� ��(1~100)
			 }
		 
		 System.out.println("sum: " + sum);
		 
		 // == ������ (���� ���ϴ� ������_����)
		 if( 10 == 10.0f) { //Ÿ���� ���ϴ� ���� �ƴϰ� �ִ� ���� ��
			 System.out.println("true");
		 } else {
			 System.out.println("false");
	}
		 
		 // ! ���� ������
		 if( 'A' != 65) { //���� �ʴ�
			 System.out.println("�� ���� �ʾ� : true");
		 }else {
			 System.out.println("�ƴ� ���� ���̾� : false");
		 }
		 //�ϱ����� (Today point)
		 //������ �߿��� ��������� �ϴ� �༮
		 //���׿�����
		 int p = 10;
		 int k = -10;
		 int result8 = (p == k) ? p : k;
		 
		 //�� �ڵ带 if���� ����ؼ� ó���ϸ�?
		 int result9 = 0;
		 if(p == k) {
			 result9 = p;
		 } else {
			result9 = k;
		 }
		 
		 //����ǥ
		 //������
		 //0 : false
		 //1 : true
		 
		 /*       OR ����,  AND ����
		  0 0        0       0
		  0 1        1       0
		  1 0        1       0
		  1 1        1       1
		  
		  <DB (Oracle) SQL�� �ڿ��� (�ΰ��� �ؼ��ϱ� ���� ���� )>
		  select *
		  from emp
		  where job = 'IT' and sal > 2000 (�׸��� �� �� ���� ��쿡�� ����)
		  
		   select *
		  from emp
		  where job = 'IT' or sal > 2000 (�̰ų� �Ǵ� �� �߿� �ϳ��� ���̾ ����)
		  
		  <Java>
		  ������ (��Ʈ)
		  |  or ����
		  & and ����
		  
		  || ������ (OR)
		  && ������ (AND)
		  
		  */
		 int x = 3;
		 int y = 5;
		 
		 System.out.println("x|y : " + (x|y));
		 /*
		  ������ -> 2���� (0,1)
		  8bit
		  256 128 64 32 16 8 4 2 1
		                   0 0 1 1  > 10���� 3�� -> 2����
		                   0 1 0 1  > 10���� 5�� -> 2����
		  OR               0 1 1 1  > 2���� -> 10���� > 4+2+1 > 7
		  ANd              0 0 0 1  > 2���� -> 10���� > 1  
		  */
		 System.out.println("x&y : " + (x&y));
		 
		 //Today Point ( && (and) , || (or))
		 //if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {A}else{B} *****(�߿�)*****
		 //������ ������ ���� �ڿ��Ŵ� ������ �ʰ� ����� ���� ó�� �˴ϴ�.
		 //if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) {A}else{B}
		 //�� �ϳ��� ������ ����� ��
		 
		 //switch��: ���ϴ� ���� ��Ȯ�� ��
		 /*int data = 50;
		 switch(data) {
		 case 100 : System.out.println("100�Դϴ�");
		 	break;
		 case 90: System.out.println("90�Դϴ�");
		 	break;
		 case 80: System.out.println("80�Դϴ�");
		 	break;
		 default : System.out.println("��ġ�ϴ� ���� �����");
		 */
		 
		 /*
		 int data = 90;
		 switch(data) {
		 case 100 : System.out.println("100�Դϴ�");
		 	
		 case 90: System.out.println("90�Դϴ�");
		 	
		 case 80: System.out.println("80�Դϴ�");
		 	
		 default : System.out.println("��ġ�ϴ� ���� �����");
		 */
		 
		 int month = 2;
		 String res = ""; //���ڿ� �ʱ�ȭ
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					res = "31";
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					res = "30";
					break;
				case 2:
					res = "29";
					break;
				default:
					res ="��ġ�ϴ� ���� ����";
			}
			System.out.println(month + "���� " + res + " �ϱ��� �Դϴ�.");
			
			//���� (������ : ������ ���Ⱚ)
			//java( ����ϰ��� �ϴ� �پ��� �ڿ��� �̸� ������ �ξ���� >> ã�Ƽ� >> ��� JAVA APT)
			//���� (ã�Ƽ� ... ���) api����
			//https://docs.oracle.com/javase/8/docs/api/index.html
			//���ϴ� �ڿ��� ã�Ƽ� ������� �ľ��ϰ� ó��
			//java.lang Math Ŭ���� ã�Ҿ��
			//public static double random()
			//equal to 0.0 and less than 1.0. ������ ������ ���� �� �ִ�.
			//���: double �Ǽ� return 0.0 <= random < 1.0
			
			//��Ģ���� ���
			//������ �ϴ� �ڿ��� �ִ� ������ open
			//import java.lang.*  >> java ���� �ȿ� lang ���� �ȿ� �ִ� ��� �ڿ��� ��밡��
			
			System.out.println("Math.random () :" + Math.random());
			
			//0~9
			System.out.println("Math.random () *10 :" + (Math.random() *10));
			
			//1~10
			System.out.println("((int)Math.random () *10 ) +1 :" + ((int)(Math.random() *10)+1));
			
			/*
			  �츮�� ��ȭ�� ��ǰ �ý����� ������� �Ѵ�
			  ��ǰ �ý����� ������ ������ ���� ��ǰ�� �����ϴ� �ý����̴�
			  ��ǰ ��÷�� 1000 ������ ������
			  ��ǰ���� TV , NoteBook , ����� , �ѿ켼Ʈ , ����
			  ��ǰ ��÷�� 900 ������ ������
			  ��ǰ����  NoteBook , ����� , �ѿ켼Ʈ , ����
			  ��ǰ ��÷�� 800 ������ ������
			  ��ǰ����  ����� , �ѿ켼Ʈ , ����
			  ��ǰ ��÷�� 700 ������ ������
			  ��ǰ����  �ѿ켼Ʈ , ����
			  ��ǰ ��÷�� 600 ������ ������
			  ��ǰ����  ����
			  �׿� ������ 100 ~ 500 ������ ĩ�� 
			  ��ǰ�ý����� ���� ������ 100 ~ 1000 ������ �����Ǿ� �ִ�
			  ����ڰ� ��ǰ �ý����� ���� �����ϰ� 100 ~ 1000������ ���� ������ �Ǿ� �ֽ��ϴ�.
			  
			  ����: ���α׷��� �� �� �����ϸ� �� �� �������� ������ �� ���� �������� ���ؼ� ��ǰ�� ����ض�
			 */
			
			
			int selectednum = ((int)((Math.random())*10))*100 + 100;
			System.out.println("���� ��ȣ�� " + selectednum + "�Դϴ�.");
			
			String gift = "" ;
			switch (selectednum) {
			case 1000:
				gift += "TV ";
			case 900:
				gift += ", NoteBook";
			case 800:
				gift += ", �����";
			case 700:
				gift += ", �ѿ켼Ʈ"; 
			case 600:
				gift += ", ����";
				break;
			default:
				gift += "ĩ��";	//g = g +		
			}
			System.out.println("�����մϴ� ������ ��ǰ�� " + gift + "�Դϴ�.");
			
			
			
			/* int jumsu = ((int)(Math.random()* 10) + 1)*100;
			  System.out.println("��÷��ȣ : " + jumsu);
			  String msg="";//�ʱ�ȭ
			  msg+= "������ ������ :" + jumsu + " �̰� ��ǰ�� : ";
			  switch(jumsu) {
			  	case 1000:msg+="Tv";
			  	case 900:msg+="NoteBook ";
			  	case 800:msg+="����� ";
			  	case 700:msg+="�ѿ� ";
			  	case 600:msg+="���� ";
			  	     break;
			  	default:msg+="ĩ��";     
			  }
			  System.out.println(msg);
			  */
			
			System.out.println(gift);
			
			//switch(����) ������ ... �ƴ���
			//���ǽ��� "���ڿ�"�� ����, "����" ����
			
			String m = "F";
			String f = "";
			switch(m) {
			case "A":
			case "B":
			case "C":
			case "D":
			case "F":
			case "G": f="OK";
				break;
			case "H":
			case "k": f= "no";
				break;
			default : f ="no data";
			}
			System.out.println("��� : " +f);
			
			
		}
	}
}
