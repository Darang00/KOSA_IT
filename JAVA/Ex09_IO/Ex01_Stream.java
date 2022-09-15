import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 IO
 
 Stream: ���
 �������� ����: �̹���, ����(���̳ʸ� ������) <> ���� ������
 
 JAVA API
 Byte ������ �����Ͱ� �����(IO)
 
 �߻�Ŭ����
 InputStream, OutPutStream (������... ���ϴ� �߻��Լ�)
 
 ����� Byte ������ ������ �۾��� �� ��
 [�Է� InputStream] ��� �޴� Ŭ���� ����ϼ��� : ���
 
 ���
 1. Memory�� ���: ByteArrayInputStsream...
 2. File       : FileInputStream ***
 
 ����� Byte ������ ������ �۾��� �� ��
 [��� OutputStream] ��� �޴� Ŭ���� ����ϼ��� : ���
 
 ���
 1. Memory�� ���: ByteArrayOutputStream...
 2. File       : FileOutputStream ***
 
 
 */
public class Ex01_Stream {
	public static void main(String[] args) {
		//byte (-128~127) ������ ������ �� �ִ� Ÿ��
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null; //���� �޸𸮸� ������ ���� �ʴ� (null������ �ʱ�ȭ��)
		
		//������ read, write �ϴ� ��� memoroy
		//�Է� �Ϸ��� �Է�(input) ���� stream, ���(output) ���� stream ���� ����Ѵ�.
		ByteArrayInputStream input = null;   //���� (���) �Է�
		ByteArrayOutputStream output = null; //���� (���) ���
		
		input = new ByteArrayInputStream(inSrc); // inSrc ������κ��� data > read
		output = new ByteArrayOutputStream();    //write ...
		
		System.out.println("outSrc before : " + Arrays.toString(outSrc));
		
		//���İ��� ���� (�ϱ��Ͻø� ���ƿ�)
		int data = 0;
		while((data = input.read()) != -1) { //���̻� read �� �����Ͱ� ������ -1
			// System.out.println("data: " + data);
			// System.out.println("input.read() : " + input.read());
			// why: 1, 3, 5, 7, 9 ?
			// read() �Լ��� ���������� next() ����
			
			// read �� �����͸� �ٽ� write �ҰŴ�.
			output.write(data); // ��� ��� �ȿ� (����) �ȿ� �����͸� ������ �ִ� ��.
			// write ����� data�� �ƴ϶� aabuteArrayOutputStream �ڽ��� ��ο� data �������ִ�...
			
			
		}
		
		outSrc = output.toByteArray();  //Byte[] �迭�� ���� ��ȯ.....(�ּҰ� ����)
		System.out.println("outSrc After : " + Arrays.toString(outSrc));
	}
}
