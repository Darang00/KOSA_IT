import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 File ó�� (DISK): �Է� ����� Byte ���� (�� Byte) read, write
 
 ���� �л��� ��Ƽ� �ϳ��� ������ �¿��� �������� ���� ��� ���� ������
 >> ����: buffer *** ������ ���°� ���� ***
 1. 1�� ������ Ÿ�� ���� ���� <I/O ���� ����> (���� Ƚ�� ����)
 2. Line ���� (����)

 BufferedInputStream (���� ��Ʈ��) >> �� Ŭ������ ����
 */

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); //���� ������ ���� create
			bos = new BufferedOutputStream(fos); // FileOutputStream ���� ���
			
			for(int i = 0; i<10; i++) {
				bos.write('A'); //data.txt ���Ͽ� A�� 10�� ���ڴ�.
			}
			bos.flush();
			/*
			 JAVA Buffer ũ�� (8kbyte: 8192byte)
			 1. buffer �ȿ� ������ �� ä������ ������ ��� (������ ���۸� ���� �۾�)
			 2. ������ ��� (buffer ������ ���� ���) : flush() or close()
			 3. close() �ڿ� ���� >> ���������� flush() ȣ�� >> �ڿ�����
			 ��.. ��... 
			 
			 */
		} catch(Exception e) {
			
		}finally {
			try {
				bos.close();
				fos.close(); //���������� bos.flush() ����
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
