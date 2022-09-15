import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex06_FileReader_FileWriter_Buffer {

	public static void main(String[] args) throws IOException {
		/*
		FileWriter fw = new FileWriter("Lotto.txt", true); //true >> append
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Lotto");
		bw.newLine(); //엔터처리
		bw.write("1, 3, 5, 7, 9, 10");
		bw.newLine();
		bw.flush(); 
		*/
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);
			//line 단위의 단위 처리 가능
			String line = "";
			for(int i = 0; (line = br.readLine()) != null; i++) {
				// System.out.println(line);
				if(line.indexOf(";") !=-1) {
					System.out.println(line);
					// 한 줄을 read 했는데 ; 있으면 그 줄을 출력하겠다
				}
			}
		} catch (Exception e) {
			
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
