import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 Byte �����͸� rea, write >> �� ����� File
 FileInputStream
 FileOutStream
 
 File >> 1.txt, data.text (�����͸� ���Ͽ� ���)
 
I/O Ŭ���� ���� ���� ... try catch ��  

I/O �ڿ��� �����ڰ� ���������� �ڿ��� ���� (��������ڵ��� ���� ��� ����)
>> close()
 
 (�̹���, ��������) read, write
 */
public class Ex02_Point_FileStream {

	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt");
			/*
			 FileOutputStream
			 1. write ������ �������� ������ >> �ڵ� ���� ���� (Create)
			 2. FileOutputStream("C:\\Temp\\new.txt", false);
			    false >> overwrite
			 3. FileOutputStream("C:\\Temp\\new.txt", true);
			    true >> append (���� �ڷ� �״�� �ְ� ���ο� ������ �߰���)
			 */
			int data = 0;
			while((data = fs.read()) != -1){
				//System.out.println("����: " + data + " : "+ (char)data);
				//���ڰ� char c = (char)data //�ƽ�Ű�ڵ�
				//read �� �����͸� ���ο� ���Ͽ� write
				fos.write(data); // data ���� ���������� read �ؼ� new.txt >> write �ϴ� ���� �� �༮�� ����
			}
		} catch(Exception e) {
			
		} finally { 
			//���������� ����Ǵ� ������������ ����Ǵ� ����ȴ�. (������)
			//������ �Լ��� return �ص� finally  ����
			//�ڿ� ���� ��� �� �� �ִ�.
			//I/O �� garbage collector�� �������� �ʾƿ�
			//close() ����� >> �Ҹ��� ȣ��
			try {
				fs.close();
				fos.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
