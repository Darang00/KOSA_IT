import java.io.IOException; // ctrl+shift+O

/*
 try{
 
 } catch(Exception e) {
 
 } finally {
 	���������� ����Ǵ� ��
 }
 
 ���� ���ܰ� �߻��ϴ�, ���ܰ� �߻����� �ʴ� [���������� ����Ǿ�� �ϴ� ����]�� ������ �ִ�.
 
 >> ����CD ��ġ PC
 >> 1. ��ġ���� >> C:\Temp >> ����
 >> 2. ������ ���� >> ���α׷� ��ġ
 >> 3. ���� ��ġ >> C:\Temp ������ ���� ����
 >> 4. ������ ��ġ >> ���� ���� >> ������ ���� ����
 
 */





public class Ex03_finally {

	static void copyFiles() {
		System.out.println("copy files");}
		
		static void startInstall() {
			System.out.println("Install"); }
			
			static void fileDelete() {
				System.out.println("file delete"); }
			
			// ������ ���ܴ� �ƴ����� 
			//�����ڰ� �ʿ信 ���� � ��Ȳ�� �������� ��Ȳ�̶� �����ϰ� ���ܸ� �ߘ���
			//����� ���� ���� ó��
			//throw new 0Exception
	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall();
			throw new IOException("install �� ������ �߻� ..."); //throw�� ����ڰ� ���������� ���ܸ� �߻���ų �� �ִ� �ڿ��̴�.
			} catch (Exception e) {
				System.out.println("���� �޽��� ��� : " + e.getMessage());
				}
		finally { // ���� ���� �� ���� �߻� ���� �ǰ�, ������̾ ���� �ȴ�
			      // �Լ��� ���� ������ return ������ finally ���� ���� (����) 
			
			fileDelete();
		}
			}
		

	}


