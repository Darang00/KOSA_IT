import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 ���� ��Ʈ��
 DataOutPutStream
 DataInputStream
 
 java 8���� �⺻ Ÿ��(Ÿ�� ���� write, read)
 �� ���� (DataOutPutStream, DataInputStream) 2���� ����
 
 ����)
 ����.txt
 100, 20, 60, 88 >> ���ڿ� > split > �迭 > �����ҷ��� ���� > ...
 
 */
public class Ex13_DataOutPutStream {

	public static void main(String[] args) {
		int[] score = {100, 60, 55, 95, 50};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos= new FileOutputStream("score.txt");
			dos = new DataOutputStream(fos);
			for(int i = 0; i<score.length; i++) {
				dos.writeInt(score[i]); //������ �״�� write
				//����: read�� ��� �ݵ�� DataInputStream
				//dos.writeUTF(null); //ä�� �Է� ���
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
