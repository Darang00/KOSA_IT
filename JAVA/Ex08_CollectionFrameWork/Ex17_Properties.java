import java.util.Properties;

/*
 Map �������̽��� ������ Ŭ����
 Ư���� ����: <String><String> (key, value) Ÿ���� �����Ǿ� �ִ� Ŭ����
 
 ��� ����:
 1. App ��ü�� ���Ǵ� �ڿ� ����
 2. ȯ�溯��
 3. ���α׷� ����
 4. ���� ���
 5. ���� ����
 
 
 */
public class Ex17_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "kosa@or.kr");
		prop.setProperty("version", "2.x.x.x.");
		prop.setProperty("downpath", "C:\\Temp\\images");
		
		// ������ ���� ���������� 
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("version"));
		System.out.println(prop.getProperty("downpath"));
		

	}

}
