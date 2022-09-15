import java.io.FileReader;
import java.io.FileWriter;

/*
 ���� ����� ������ ó��(char[])
 String Ŭ����: String str = "ABC" : ���������� char[] >> [A] [B] [C]
 
 �ѱ� 1��, ���� 1�� >> 2Byte >> Reader, Writer (�߻�Ŭ����)
 
 ��� ����
 FileReader
 FileWriter
 
 */
public class Ex05_Reader_Writer {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			  fr = new FileReader("Ex01_Stream.java"); //read
			  fw = new FileWriter("copy_Ex01.txt");//���ϻ��� >> ���Ͽ� ���� ���� write
			  
			  int data=0;
			  while((data = fr.read()) != -1) {
				  //System.out.println(data);
				 if(data != '\n' && data != '\r'  && data != '\t' && data != ' ') {
					 fw.write(data);
					 //����, �� , ���ڴ� ���� ���� �ʰڴ�
					 //�������� ����
					 //https://jquery.com/download/ �ǻ�� (jquery �ٿ�ε�)
				 } 
			  }	  
		} catch (Exception e) {
			
		}finally {
			try {
				 fw.close();
				 fr.close();
			}catch (Exception e) {
				
			}
		}
	}
}