import kr.or.kosa.Mouse;
import kr.or.kosa.NoteBook;
public class Ex04_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook notebook = new NoteBook();
		notebook.setYear(-1011);
		//notebook.year = -100; NoteBook Ŭ������ private�ƴϰ� public������� �̰ɷ� �� ��� ��
		int year = notebook.getYear();
		System.out.println("year :" + year);
		
		//notebook.mouse.x = 5;
		//notebook.mouse.y = 4;
		
		Mouse mouse = new Mouse (); //���콺�� heap �޸𸮿� �ִ�.
		

		notebook.handle(mouse); 
		System.out.println(mouse.x + ": " + mouse.y);
		
		notebook.handle(mouse);
		System.out.println(mouse.x + ": " + mouse.y);
		
		

		

	}

}
