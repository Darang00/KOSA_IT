import kr.or.kosa.Mouse;
import kr.or.kosa.NoteBook;
public class Ex04_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook notebook = new NoteBook();
		notebook.setYear(-1011);
		//notebook.year = -100; NoteBook 클래스에 private아니고 public써놓으면 이걸로 값 출력 됨
		int year = notebook.getYear();
		System.out.println("year :" + year);
		
		//notebook.mouse.x = 5;
		//notebook.mouse.y = 4;
		
		Mouse mouse = new Mouse (); //마우스가 heap 메모리에 있다.
		

		notebook.handle(mouse); 
		System.out.println(mouse.x + ": " + mouse.y);
		
		notebook.handle(mouse);
		System.out.println(mouse.x + ": " + mouse.y);
		
		

		

	}

}
