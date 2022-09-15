import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 File 처리 (DISK): 입력 출력은 Byte 단위 (한 Byte) read, write
 
 여러 학생을 모아서 하나의 버스에 태워서 목적지에 가서 놀면 좋지 않을까
 >> 버스: buffer *** 무조건 쓰는게 좋다 ***
 1. 1명씩 내리고 타는 성능 개선 <I/O 성능 개선> (접근 횟수 감수)
 2. Line 단위 (엔터)

 BufferedInputStream (보조 스트림) >> 주 클래스에 의존
 */

public class Ex04_Stream_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); //파일 없으면 파일 create
			bos = new BufferedOutputStream(fos); // FileOutputStream 버퍼 사용
			
			for(int i = 0; i<10; i++) {
				bos.write('A'); //data.txt 파일에 A를 10번 쓰겠다.
			}
			bos.flush();
			/*
			 JAVA Buffer 크기 (8kbyte: 8192byte)
			 1. buffer 안에 내용이 다 채워지면 스스로 출발 (스스로 버퍼를 비우는 작업)
			 2. 강제로 출발 (buffer 강제로 비우기 기능) : flush() or close()
			 3. close() 자원 해제 >> 내부적으로 flush() 호출 >> 자원해제
			 잠.. 와... 
			 
			 */
		} catch(Exception e) {
			
		}finally {
			try {
				bos.close();
				fos.close(); //내부적으로 bos.flush() 포함
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
