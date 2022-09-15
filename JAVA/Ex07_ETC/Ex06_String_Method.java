import java.util.StringTokenizer;

public class Ex06_String_Method {

	public static void main(String[] args) {
		
		String str = "hello";
		String concatstr = str.concat(" world");
				System.out.println(concatstr);
				
				boolean bo = str.contains("ello"); //e��� �ϴ� ���ڸ������� �ִ�? (boolean Ÿ���� �� yes or no)
				
				System.out.println(bo);
				
				String str2 = "a b c d"; // [a] [ ] [b] [ ] [c] [ ] [d]
				System.out.println(str2.length());
				
				// String�� ���������� �迭�̴�.
				
			String filename = "hello java world";
			System.out.println(filename.indexOf("h")); // �ش� ���ڰ� �� ��° index ���� �˷���
			System.out.println(filename.indexOf("java")); // java ��� �ܾ��� ���۰�
			System.out.println(filename.indexOf("������"));
			// �ش��ϴ� ���ڳ� ���ڿ��� ���� ��� -1�� return... �迭���� ���� ���ٴ� �ǹ� (-1)
			// �Ź� �缳���� ���ϴ� �ܾ� ����.... ���� ���ϴ� ���ڿ��� �� �缳 ���� ���ԵǾ����� �ľ�
			
			if(filename.indexOf("wo") != 1) {
				System.out.println("wo �ܾ �ϳ��� �ִ�");
			}
			System.out.println(filename.lastIndexOf("a")); // ó�����ͼ�� ������ a�� �ִ� index �� (9��° ��)
			
			// length() , indexOf() , substring() . replace() , split() 
			
			String result= "superman";
			System.out.println(result.substring(0)) ; // ���� index~
			System.out.println(result.substring(1)) ;
			System.out.println(result.substring(1, 3));
			//beginIndex - the beginning index, inclusive
			//endIndex - the ending index, exclusive. // endindex -1
			System.out.println(result.substring(0, 0)); //0~-1���� �����ϱ� �ƹ��͵� �ȳ��´�
			System.out.println(result.substring(0, 1)); // s
			
			// Quiz
			String filename2 = "home.jpeg"; // or h.png or aaaaa.hwp
			// ���⼭ ���ϸ�� Ȯ���ڸ� �и��ؼ� ����ض�
			// ���ϸ� : home
			// Ȯ���� : jpeg
			// �� ������ ��� �Լ��� ����ؼ� ����ض�
			
			int position = filename2.indexOf(".");
			System.out.println(filename2.indexOf(".")); // "."�� ��ġ
			String file = filename2.substring(0, position);
			
			String extention2 = filename2.substring(position, filename2.length());
			String extention = filename2.substring(++position);
			
			System.out.println(position);
			System.out.println(file);
			System.out.println(extention);
			System.out.println(extention2);
			
			//replace
			String str3 = "ABCDADDDDDA";
			String result3 = str3.replace("DDDDD", "������ �ݿ���");// DDDDD ã�Ƽ� ������ �ݿ��� �� ��ü
			System.out.println(result3);
			
			result3 = str3.replace("A", "a"); // A ã�Ƽ� a �� �ٲ��
			System.out.println(result3);
			
			// ETC
			System.out.println(str3.charAt(0)); // 0��° character�� �̰ڴ�
			System.out.println(str3.charAt(3));
			System.out.println(str3.endsWith("DDDA")); // �ڿ� DDDA�� �����ϴ� �� �մ�?
			System.out.println(str3.endsWith("BDDA")); // �ڿ� BDDA�� �����ϴ� �� �մ�?
			System.out.println(str3.equalsIgnoreCase("aBCDADDDDDa")); // ��ҹ��� ���о��� ���ض�
			
			//Today Point > split()
			String str4 = "���۸�, ��Ƽ, �����, ������, ������" ;
			String[] namearray = str4.split(",");
			System.out.println(namearray); // > �ּҰ�����
			
			for(String s : namearray) {
				System.out.println(s);
			}
			
			//
			String str5 = "���۸�. ��Ƽ. �����. ������. ������" ;
			String[] namearray2 = str5.split("\\.");
			
			
			for(String s : namearray2) {
				System.out.println(s);
			} //
			
			//https://codechacha.com/ko/java-regex/
			// "." �����Ͱ� �ƴϰ� ����ǥ�������� �ν���
			
			// ����ǥ���� (���ڵ��� �����ؼ� ��Ģ�� ����� : �� ��ġ���ϰ� ������ ���ؼ� �Ǵ�)
			// �����ȣ : {\d3} - {\d3}  >>  12-123 (false), 123*123(false), 111-111(true: ���� �Է��� ���ϰ� ���ƾ߸� true)
			
			// regular expression(java, javascript, Oracle, c#) ǥ��
			// �ڵ�����ȣ, ������ȣ, ������ �ּ�, �̸��� �ּ� >> regular expression���� ���� >> �Է��� ������ ��ȿ�� ����
			
			String filename3 = "kosa.hwp";
			//���ϸ�� Ȯ���� �и�
			String[] filearray = filename3.split("\\.");
			for(String s: filearray) {
				System.out.println(s);
			}
			
			String str6 = "a/b.c-d.f" ;
			StringTokenizer sto = new StringTokenizer(str6, "/. -."); //String�� �����ִ� ���� Ŭ����
			while(sto.hasMoreElements()) {
				System.out.println(sto.nextToken());
			}
			
			// �ͼ���
			String str7 = "ȫ     ��     ��";
			// ���� >> ������ ���� >> "ȫ�浿" �̶�� ������ ����ҰŴ�
			System.out.println(str7.replace(" ", "")); // "ȫ�浿"
			
			String str8 = "     ȫ�浿     "; // ���� �����͸� ©������� �Լ�
			System.out.println(">" + str8 + "<"); 
			System.out.println(">" + str8.trim() + "<");
			
			
			String str9 = "     ȫ     ��     ��     ";
			//"ȫ�浿"���� ����ϰ� ������?
			String result5 = str9.trim();
			String result6 = result5.replace(" ", "");
			System.out.println(result6);
			// �ڿ��� �ʹ� ���� ��..
			
			// ***** �������� �Լ��� ����� ��� (method chain ���)
			str9.trim().replace(" ", "").substring(2); // ü��ó�� ��������
			System.out.println(str9.trim().replace(" ", "").substring(2));
			
			//Hint
			int sum = 0;
			String [] numarr = {"1", "2", "3", "4"};
			for (String s: numarr) {
				sum += Integer.parseInt(s);
			}
			System.out.println("sum:" + sum);
			
			
			//Quiz
			String jumin = "123456-1235467";
			//�� �ֹι�ȣ�� ���� ���ϼ���
			String array = jumin.replace("-", "");
			// int a= Integer.parseInt(array);
			int sum2=0;
			for (int i=0; i<array.length(); i++) {
				sum2 += Integer.parseInt(array.substring(i,i+1)); // i��° ����� �� ���� i+1�� ° �� �� ������ ��

			}
			System.out.println("�ֹι�ȣ�� ��: " + sum2);
			
			

		
			
//////////////////////////////////////////////////////////////////////////////////////			
	}

}
