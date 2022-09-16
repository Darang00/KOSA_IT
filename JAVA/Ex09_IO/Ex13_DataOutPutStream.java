import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 보조 스트림
 DataOutPutStream
 DataInputStream
 
 java 8가지 기본 타입(타입 별로 write, read)
 단 조건 (DataOutPutStream, DataInputStream) 2놈이 같이
 
 만약)
 성적.txt
 100, 20, 60, 88 >> 문자열 > split > 배열 > 연산할려면 숫자 > ...
 
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
				dos.writeInt(score[i]); //정수값 그대로 write
				//조건: read할 경우 반드시 DataInputStream
				//dos.writeUTF(null); //채팅 입력 출력
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
