import kr.or.kosa.Book;

public class Quiz_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book ("ȫ�浿��" , 5000);
		book1.bookInfo();
		
		System.out.println(book1.getBname());
		System.out.println(book1.getPrice());
		
		Book book2 = new Book ("�̼�����" , 15000);
		book1.bookInfo();
		
		System.out.println(book2.getBname());
		System.out.println(book2.getPrice());
		
	}

}
