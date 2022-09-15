import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;
import java.util.Calendar;

class Lotto{
	  Set<Integer> lotto = new TreeSet<Integer>(); 
	  
	  //Constructor
	  public Lotto () {
		  FileInputStream fs = null;
		  FileOutputStream fos = null;
		  for(int i = 0 ; lotto.size() < 6 ; i++) {
		         lotto.add((int)(Math.random()*45 + 1));
		      }		      
	  }
	  
	  void Write() throws IOException {
		  Calendar cal = Calendar.getInstance();
		  FileWriter fw = new FileWriter("Lotto.txt", true); // append
		  BufferedWriter bw = new BufferedWriter(fw);
		  bw.write("Lottery number: ");
		  bw.write(lotto.toString());
		  SimpleDateFormat date = new SimpleDateFormat(" [yyyy년MM월dd일 HH:mm]");
		  String time = date.format(cal.getTime());
		  bw.write(time);
		  bw.newLine(); // 엔터처리
		  bw.flush();
	  }
	  
	  void Read() {
		  FileReader fr = null;
		  BufferedReader br = null;
		  
		  try {
			  fr = new FileReader("Lotto.txt");
			  br = new BufferedReader(fr);
			  String line = "";
			  for (int i = 0; (line = br.readLine()) != null; i++) {
				  System.out.println(line);
			  } 		  
	      } catch(Exception e) {
	    	  
	      }
	  }	  
}

public class WorkExercise_0828_File_Lotto {

	public static void main(String[] args) throws IOException{
		Lotto lotto = new Lotto();
		lotto.Write();
		lotto.Read();
		
		

	}

}
