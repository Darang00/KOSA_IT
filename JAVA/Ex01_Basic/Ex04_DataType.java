/*
1. �ڹٰ� �����ϴ� �⺻ Ÿ��(�ý��� Ÿ�� : ����Ÿ��)  >>  8����
2. 8���� �⺻ Ÿ��  [���� ����]�ϴ� Ÿ��

3. ���� > ���� > (���� ���� , 0 , ���� ����) byte  (8bit) -128 ~ 127
                                       char �ѹ��ڸ� ǥ���ϴ� �ڷ��� (��ǻ�Ͱ� ������, Ư������, ���� ) 1byte
                                            �ѱ� 1�� > 2byte
                                            ����) char(2byte) : �ѱ�, ������, Ư������, ����
                                                 ũ�⿡ ������� 2byte >> unicode >> �ƽ�Ű �ڵ�ǥ
                                            ex) char c = 'A' , char c2 = '��'
                                       short (c��� ȣ�Ѽ��� ���� ����. ���� ����)
                                       int (-21 ~ 21�� ���� : 4byte) *** ������ �⺻ Ÿ�� ***
                                       long (8byte)

       > �Ǽ� (�ε��Ҽ���)  >             float (4byte)
                                       double (8byte) >>���е��� ���� (ǥ�� ������ ũ��) *** �Ǽ��� �⺻ Ÿ�� ***
   �� > ��, ���� > true, false         boolean
   
   ����� ���� ...
   ������ int Ÿ��... �Ǽ� double Ÿ�� ����ϸ� �� ���� ����.
   
   ���� ���� ���� ������ : ���ڿ� >>> ȫ�浵, ������, �ȳ��ϼ���
   ** ���ڿ��� ǥ�� ** "ȫ�浿", "�ȳ��ϤĿ�"
   
   String name = "ȫ�浿�ٺ�"; >> String�� Ŭ���� �̴�. (���� Ÿ��) String str = new String();
   
   ** ������ ����� �ϱ� ������ String�� �Ϲ� ��Ÿ��ó�� ����ϼ��� (int, double) ó��

   
   �⺻Ÿ�� 8���� + String >> 9������ ������ ������ ǥ��
   
   �ڹ�Ÿ��
   1. ��Ÿ�� : 8���� �⺻ > int i = 100; int j = 200;...                   value type
   2. ����Ÿ��(�ּҰ�) : Ŭ����, �迭 : ������ ���� ����Ǵ� ���� �ƴ϶� �ּҰ��� ���� ref type
                                       
                                          //�ڹٿ��� ������ �⺻ Ÿ���� int, �Ǽ��� �⺻ Ÿ���� double

*/
//class == ���赵 == Data Type
class Car2{ //Car2�� ������ Ÿ��, Car2 ���赵 �̴� >> ��üȭ >> �޸� (new)
	String color; 
	int window;
	
}


public class Ex04_DataType {

	public static void main(String[] args) {
		String str="ȫ�浿"; // ���ڿ� �����͸� ���� �� �ִ� Ÿ��
				int age = 100;
		
		Car2 c; // c�� main�Լ� ���� �ִ� ��������
		//System.out.println(c); // �������� �ʱ�ȭ ���� ������ ���� �Ұ���
		//C��� ������ �ʱ�ȭ�� >> �ּҰ��� ������ �Ѵ�. >> new �����ڸ� ���ؼ� �޸𸮿� �Ҵ� �ּ�
		c = new Car2();
		System.out.println("c�� �ּҰ� ��� :" + c); // c�� �ּҰ� ��� :Car2@626b2d4a

		
		//����� �ʱ�ȭ
		Car2 c2 = new Car2();
		c2.window = 100;
		c2.color = "gold";
		
		int i = 10; //����� �Ҵ��� ���ÿ� (�� ��ȣ)
		
		int j;
		j = 20; //�����ϰ� ���� �ٿ� �Ҵ�
		
		int k;
		k = j; //POINT (���Ҵ� j������ ������ ���� k���� �Ҵ�)
		System.out.println("k: " + k); //20
		k= 300;
		System.out.println("k: " + k) ;
		System.out.println("j���� ��ȭ ����: " +j) ;
		
		//int p, q, r ; //�������� �ʾƿ�
		//�̷� ���� Arrey : int[] arr  = new int[3];
		
		//int (-21�� ~ 21��)
		int p=100000000;
		//int p2=10000000000;
		//p2�� ����(int) .... ��� �ȵǰ��� ���� ...
		//The literal 10000000000 of type int is out of range 
		//�����ڰ� ���� �Է��� �� (�ִ� �״��) ���� ���� int �׸��� ��Ƽ� ó��
		//���� 4byte�� ũ��� ���� ���� ���� �� �ִµ� �ϰ� ū ���� �Է��ϸ� ���� ���� �� ����..
		//1. �ذ���
		long l = 10000000000l; //literal���� long �׸��� ��Ƽ� �Ҵ�
		long l2 = 100; //100 literal ���� int �׸��ȿ�
		//���� Ÿ�԰��� ū Ÿ�Կ� �ִ� ���� ������ �ȵȴ�.
		
		//int p2=10000000000;
		//int p2= 10000000000l;
		//Type mismatch: cannot convert from long to int
		
		int p2=(int) 10000000000l; // ĳ��Ī >> Ÿ�Ժ�ȯ
		System.out.println(p2); //1410065408
		//�������� �ذ� ����� �ƴϴ� ... �������� �� (������ ��)
		
		int p3 = (int)1000l; //ĳ������ ���ؼ� Ÿ�� ��ġ
		System.out.println(p3);
		
		//char 2byte ������
		//�� ���ڸ� ǥ���ϱ� ���ؼ� ���� �ڷ���
		//������, Ư������, ����, �ѱ� �� ����... ǥ��ȭ...
		//���ڿ� : ������ ���� : "ȫ�浿"   String name = "ȫ�浿" 
		//���� (�ѹ���) : 'A', 'ȫ'   char ch = 'ȫ'
		
		char single = '��';
		System.out.println(single);
		//char s ='AB' // Invalid character constant // ����.. �����ϵ� �ȵſ�
		
		//char ���� Ÿ��
		//char ���ڸ� ���������� ���������� �������� ������ �ִ�.
		//�������� �ƽ�Ű �ڵ�ǥ�� ������� �ϰ� �ִ�.
		//���� ȣȯ ����...
		
		int intch= 'A'; //������ �̷��� int intch= (int)'A'; ���°� �´�
		//�׷����� ���������� �ڵ� ����ȯ�� �Ͼ��.... �Ͻ��� (������)
		System.out.println("intch : " + intch);
		
		char ch2 = 'a';
		System.out.println(ch2);
		int intch2 = (int) ch2; // ���������� ó�� ������ ... casting ���� ó�� (��ǻ�Ͱ� �� ��ȣ��)
		System.out.println("intch2 : " + intch2);
		
		int intch3 = 65;
		char ch3 = (char) intch3;
		System.out.println(ch3);
		
		//���� ���� (�Ҵ翡 �־ ���� ���� ���� �� ���� ����ִ� TYPE�� ����)
		//����� ����ȯ, �Ͻ��� ����ȯ
		//����, ����� ����ȯ�� �������� ���̴�.
		//key point: ����ȯ�� �ս� ������ ���
		//������ �ߴ� �� ó��..... 
		//ū ���� ���� ������ ���� ����ȯ (������ �ս�)
		
		
		/*
		 Today point
		 1. �ϴ翡�� ������ ������ �ִ� ���� �������� ������ Ÿ���� ����
		 2. ������ Ÿ�� ũ�⸦ Ȯ������
		 3. ū Ÿ�Կ��� ���� Ÿ���� ���� ���� �� �ִ�.
		 ** 4. ���� Ÿ�Կ� ū Ÿ���� �ְ� �ʹٸ� ������ (casting) �ؾ��Ѵ�... å���� �������� ��..
		    ** ex) char << int ������ char << (char)int �����ϴ�. ������ ������ �ս� �߻� ����
		    ** cf) int << char ���������� �����Ϸ��� ģ���ϰ� int << (int)char ó�� �մϴ�. 
		 */
		
		//String : ���ڿ��� ���� �� �ִ� Ÿ��
		//���� ���: int, double ó�� ������ [Ÿ�� ������ ��] ������ ����
		
		String name="hello world";
		System.out.println(name);
		
		String name2 = name + " �氡�氡" ;
		System.out.println(name2);
		//����Ű: syso ctrl+Space
		
		// + > ���, ���� ����
		//Tip) Oracle ������ ���̽� (���) > + ������� , || ���տ����� (ex '�ȳ�'||'�氡')
		
		//Tip) Java ������ Ư�� ���� ó��
		//�̽������� ���� : Ư�� ���� �տ� \
		//char singn = '''; ���� �߻� 
		char sing = '\'';  // \���ؼ� ' ������ ���� ǥ��
		System.out.println(sing);
		
		//Quiz : ȫ"��"�� �̶�� ���ڿ��� ǥ���ϰ� �;��
		String name3 = "ȫ\"��\"��";
		System.out.println(name3);
		
		String str3 = "1000"; //1000�� ���ڰ� �ƴ� ����!
		String str4 = "10"; // 10�� ���ڰ� �ƴ� ����!
		String result = str3 +str4 ; // 100010
		System.out.println(result);
		
		System.out.println("100" + 100); 
		System.out.println(100 + "100");
		System.out.println(100 + 100 + "100");
		System.out.println(100 + (100 + "100"));
		System.out.println(100 + "100" + 100);
		
		//Quiz [C:\Temp] ���ڿ��� String ������ ��Ƽ� ȭ�鿡 ����ϼ���
		String path = "C:\\Temp";  // \t >> tab   \n >> new line
		System.out.println(path);
		
		//�ü��� (�ε��Ҽ���)
		//float 4byte
		//double 8byte // �Ǽ� literal�� �⺻ Ÿ�� double
		
		//float f = 3.14; //Type mismatch: cannot convert from double to float
		//float f = (float)3.14; ������ �ս� ������ �� �ִ�
		//float f = 3.14f; // �ǵڿ� ���̻� 'f' ���� // ������ �ս� ������ �� �ִ�
		double f = 3.14; //������ ���� (���� �׸��� ũ��)
		
		float f2 = 1.123456789f; //float Ÿ�Կ� ��� �ʹٸ� ������ ���̻� F�� f ���δ�.
		//�뷫������ 7�ڸ� �Ҽ� ǥ��
		//�ݿø� default
		
		System.out.println("f2 : " +f2);
		//f2 : 1.1234568 (�ݿø� �� �� ��µ�)
		
		double d = 1.123456789123456789;
		//�뷫 16�ڸ� �Ҽ� ǥ��
		//�ݿø� default
		System.out.println("d : " +d);
		//d : 1.1234567891234568 (�ݿø� �� �� ��µ�)
		
		System.out.println((byte)128); //128 byte ǥ���� �ȵǿ�
		//byte Ÿ�� : -128 ~127  //overflow ��ĥ ��� ��ȯ
		
		byte q = (byte)129;
		System.out.println(q);
		
		
	// ������ �Ǽ��� ���� �ִ� ���
		double d2 = 100; // �Ͻ��� �����Ϸ��� ����ȯ
		System.out.println(d2);
		
		//Quiz
		double d3 =100;
		int i5 = 100;
		
		//int result2 = d3 + i5;
		// ����1: int result2 = (int) (d3 + i5); ������ �ս��� ������ ���� �ִ�
		// ����2: double result2 = d3 + i5; �������� �ս��� �������� �ʴ´�
		
		//Today point
		//1. ūŸ�� + ���� Ÿ�� >> ūŸ��
		//2. Ÿ�԰� ��ȯ >> ������ ������ ���� ���� ���� ������ Ÿ���� ���� �Ǵ��ϴ�
		//3. ����� ����ȯ�� �սǵ����� ���
		
		int i6 =100;
		byte b2 = (byte)i6; //������ ����ȯ
		
		byte b3 = 20;
		int i7 = b3; // �����Ϸ��� ���������� �ڵ� ����ȯ�� �Ѵ�. ����� int i7 = b3; �̷��� ���°� �´� �Ŵ�.
		
		
		
		
		
		
		
		
		
	}

}
