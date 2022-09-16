package kr.or.bit;

import java.util.HashMap;
import java.util.Scanner;

/*
도서관리 프로그램 ... HashMap  사용해서 도서정보를 저장하는 클래스

Book  클래스 (도서번호 , 도서제목 , 도서가격)
BookManager (도서 추가 , 도서 삭제 , 도서 검색 , 도서목록)
HashMap 활용해서 
1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료

1
추가할 도서 ISBN:1234
도서 제목:Java
가격:2000
ISBN:1234 이름:Java 가격:2000 생성하였습니다.

​1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
1
추가할 도서 ISBN:4321
도서 제목:C언어
가격:5000
ISBN:4321 이름:C언어 가격:5000 생성하였습니다.

​1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
1
추가할 도서 ISBN:3421
도서 제목:자료구조
가격:2000

ISBN:3421 이름:자료구조 가격:2000 생성하였습니다.

1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
4
도서 목록
도서 수:3
ISBN:1234 이름:Java 가격:2000
ISBN:4321 이름:C언어 가격:5000
ISBN:3421 이름:자료구조 가격:2000

​1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
5
ISBN 목록
도서 수:3
1234
​4321
3421

1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
3
검색할 도서 ISBN:1234
검색 결과>>ISBN:1234 이름:Java 가격:2000

1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
2
삭제할 도서 ISBN:4321
삭제하였습니다.

1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
4
도서 목록
​도서 수:2
ISBN:1234 이름:Java 가격:2000
ISBN:3421 이름:자료구조 가격:2000

1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
5
ISBN 목록
도서 수:2
1234
3421

​1:추가 2:삭제 3:검색 4:도서 목록 5:ISBN 목록 0:종료
0
종료합니다...


 
 */
class Book{
	//Field
	int bookNum; // key(중복 허용 X)
	String title;
	int price;
	
	//Constructor
	Book(int bookNum, String title, int price){
		this.bookNum = bookNum;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "검색결과 >> [ISBN=" + bookNum + ", 도서 제목=" + title + ", 가격=" + price + "]";
	}	
	//Method
}



class BookManager{
	static HashMap<Integer, Book> hsmap = new HashMap<Integer, Book>();
	static Scanner scanner = new Scanner(System.in);
	
	//Method: 1:추가 2:삭제 3:검색
	void add(){ // case1: 추가 
		//Book book = new Book(bookNum, title, price);
		System.out.print("추가할 책 번호(ISBN): ");
		int bookNum = scanner.nextInt();
		System.out.print("추가할 책 제목: ");
		String title = scanner.next();
		System.out.print("추가할 책 가격: ");
		int price = scanner.nextInt();
		hsmap.put(bookNum, new Book(bookNum, title, price)); // 추가하는 함수: put()
		System.out.printf("ISBN: %d 이름:%s 가격:%d 생성하였습니다. %n", bookNum, title, price);
		System.out.println();
	}
	
	void delete() { //case 2: 삭제
		System.out.println("삭제할 도서 ISBN: ");
		int bookNum = scanner.nextInt();
		Object key = hsmap.remove(bookNum); // 지우는 함수: remove()
		System.out.printf("ISBN: %d 도서를 삭제였습니다 %n",bookNum);
		System.out.println();
	}
	
	void search() { //case 3: 검색
		//hsmap.get(bookNum); 
		while(true) {
			System.out.print("검색할 도서의 ISBN: ");
			int bookNum = scanner.nextInt();
			if(!hsmap.containsKey(bookNum)) {
			System.out.println("존재하지 않는 도서 입니다");
			continue;
			}
			System.out.println(hsmap.get(bookNum).toString());
			System.out.println();
			break;
		}
	}
	
	void catalog() { //case 4: 도서 목록
		System.out.println("도서 목록");
		System.out.printf("도서 수: %d%n", hsmap.size());
		for(Book book: hsmap.values()) { //hsmap은 key랑 value 다 가지고 있는데 value만 가져옴
			System.out.println(book.toString());
		}
		System.out.println();
	}
		
	void catalogISBN() { //case 5: ISBN 목록
		System.out.println("ISBN 목록");
		System.out.printf("도서 수: %d%n", hsmap.size() );
		for(Integer booknum: hsmap.keySet()) {
			System.out.println(booknum);
		}		
		System.out.println();
	}
	void run() {
		int bookNum;
		
		while(true) {
			System.out.println("1:추가  2:삭제  3:검색  4:도서목록  5:ISBN목록  0:종료");
			int num = scanner.nextInt();
			
		switch (num) {
		case 1: //추가
			
			 add();
			 break;
			 
		case 2: // 삭제

			delete();
			break;
			
		case 3:	 // 검색
			
			search();
			break; 
			
		case 4: // 도서 목록
			catalog();
			break;
			
		case 5: //ISBN
			
			catalogISBN();
			break;
			
		case 0: // 종료
		System.out.println("종료합니다");
		System.exit(0);
		}
		}
	}	
}

public class HashMapTeamProject {
	public static void main(String[] args) {
		
		BookManager bookmanager = new BookManager();
		bookmanager.run();
		
	}
}
