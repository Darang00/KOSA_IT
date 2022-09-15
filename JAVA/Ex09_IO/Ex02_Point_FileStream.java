import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 Byte 데이터를 rea, write >> 그 대상이 File
 FileInputStream
 FileOutStream
 
 File >> 1.txt, data.text (데이터를 파일에 기록)
 
I/O 클래스 예외 강제 ... try catch 문  

I/O 자원은 개발자가 직접적으로 자원에 해제 (여러사용자들이 접근 사용 가능)
>> close()
 
 (이미지, 엑셀파일) read, write
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
			 1. write 파일이 존재하지 않으면 >> 자동 파일 생성 (Create)
			 2. FileOutputStream("C:\\Temp\\new.txt", false);
			    false >> overwrite
			 3. FileOutputStream("C:\\Temp\\new.txt", true);
			    true >> append (기존 자료 그대로 있고 새로운 데이터 추가함)
			 */
			int data = 0;
			while((data = fs.read()) != -1){
				//System.out.println("정수: " + data + " : "+ (char)data);
				//문자값 char c = (char)data //아스키코드
				//read 한 데이터를 새로운 파일에 write
				fos.write(data); // data 값을 내부적으로 read 해서 new.txt >> write 하는 것이 이 녀석읨 목적
			}
		} catch(Exception e) {
			
		} finally { 
			//정상적으로 수행되던 비정상적으로 실행되던 실행된다. (강력함)
			//심지어 함수가 return 해도 finally  실행
			//자원 해제 기능 쓸 수 있다.
			//I/O 는 garbage collector가 관리하지 않아요
			//close() 명시적 >> 소멸자 호출
			try {
				fs.close();
				fos.close();
			} catch(Exception e) {
				
			}
			
		}
	}

}
