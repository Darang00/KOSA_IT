import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex14_DataInputStream {

	public static void main(String[] args) {
		//���� �л� ���� ���
		//read�ؼ� �հ�, ���
		//DarOutputStream >> dos.writeInt
		
		//�ݵ�� DataInputStream�� ���ؼ��� read
		
		int sum = 0;
		int score = 0;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true) {
				score = dis.readInt();
				System.out.println("score int Ÿ��: " + score);
				sum += score; //���� Ÿ������ ��� ������ ����
				//read �� �ڿ��� ������ IOexception
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("sum ���: " + sum);
		}finally {
			try {
				dis.close();
				fis.close();
			} catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}
