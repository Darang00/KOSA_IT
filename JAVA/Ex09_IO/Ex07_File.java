import java.io.File;

/*
 [����] [����] �� �ٷ�� Ŭ���� �н�
 
 Java: ����(����, ����..), ����(����, ����) �ϳ��� Ŭ���� >> File
 >> a.txt ����, ����, ����, ���� read
 >> Temp ����, ����, ����, ���� read
 
 C#: ����(File), ����(Directory)
 
 ���
 ������:
 �����:
 
 ���
 ������: C:\\ D:\\ >> C:\\Temp\\a.txt
 �����: ���� ������ �߽����� > ../ >> /
*/
public class Ex07_File {
	public static void main(String[] args) {
	   String path ="C:\\Temp\\file.txt";
		//String path ="data.txt";
	   File f = new File(path);
	   
	   //File ���� : �پ��� ������ ��� .....
	   System.out.println("���� ���� ����(����,����):"+f.exists());
	   System.out.println("�� ������ : " + f.isDirectory()); //f
	   System.out.println("�� �����̴� : " + f.isFile()); //t
	   
	   
	   System.out.println("���ϸ� : " + f.getName());//file.txt
	   System.out.println("������ : " + f.getAbsolutePath()); //������
	   //C:\KOSA_IT\JAVA\Labs\Ex09_IO\data.txt
	   
	   System.out.println("����ũ�� :" + f.length() + "byte");
	   System.out.println("�θ��� : " + f.getParent()); //C:\Temp
	}

}



