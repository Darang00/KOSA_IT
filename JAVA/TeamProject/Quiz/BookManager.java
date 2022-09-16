package Quiz;
//���� ������ Ŭ����

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookManager {

	Scanner scan = new Scanner(System.in);

	Map<String, Book> book_dic = new HashMap<String, Book>();
	
	FileOutputStream fos = null;	//������� ����
	BufferedOutputStream bos = null; //���q���� �ѱ����
	ObjectOutputStream out = null;	//��ü ����� ���� ����
	
	FileInputStream fis = null;	
	BufferedInputStream bis = null; 
	ObjectInputStream in = null;	
	
	String filename="BookData.txt";
	
	

	public void Run() {
		this.load();
		
		int key = 0;

		while ((key = selectMenu()) != 0) {

			switch (key) {

			case 1:
				addBook();
				break;

			case 2:
				removeBook();
				break;

			case 3:
				searchBook();
				break;

			case 4:
				listBook();
				break;

			case 5:
				listISBN();
				break;

			default:
				System.out.println("�߸� �����Ͽ����ϴ�.");
				break;

			}

		}

		System.out.println("�����մϴ�...");

	}

	int selectMenu() {

		System.out.println("1:�߰� 2:���� 3:�˻� 4:���� ��� 5:ISBN ��� 0:����");

		int key = scan.nextInt();

		scan.nextLine();

		return key;

	}

	void addBook() {

		String isbn;

		System.out.print("�߰��� ���� ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			System.out.println("�̹� �����ϴ� ISBN�Դϴ�.");

			return;

		}

		String title;

		int price;

		System.out.print("���� ����:");

		title = scan.nextLine();

		System.out.print("����:");

		price =  scan.nextInt();

		scan.nextLine();

		Book book = new Book(isbn, title, price);
		
		
		
		book_dic.put(isbn, book);
		
		save(book_dic);

		System.out.println(book.toString() + " �����Ͽ����ϴ�.");
		

		
	

	}
	
	
	void removeBook() {

		String isbn;

		System.out.print("������ ���� ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			book_dic.remove(isbn);

			System.out.println("�����Ͽ����ϴ�.");
			
			save(book_dic);

		}

		else {

			System.out.println("�������� �ʽ��ϴ�.");

		}

	}

	void searchBook() {

		String isbn;

		System.out.print("�˻��� ���� ISBN:");

		isbn = scan.nextLine();

		if (book_dic.containsKey(isbn)) {

			Book book = book_dic.get(isbn);
			System.out.println("�˻� ���>>" + book.toString());

		}

		else {

			System.out.println("�������� �ʽ��ϴ�.");

		}

	}

	void listBook() {

		System.out.println("���� ���");

		int cnt = book_dic.size();

		System.out.println("���� ��:" + cnt);

		for (Book book : book_dic.values()) {

			System.out.println(book.toString());

		}

	}

	void listISBN() {

		System.out.println("ISBN ���");

		int cnt = book_dic.size();

		System.out.println("���� ��:" + cnt);

		for (String isbn : book_dic.keySet()) {

			System.out.println(isbn);

		}

	}
	
	void save(Map<String, Book> book_dic) {
			
			try {
				
				fos = new FileOutputStream(filename);
				bos = new BufferedOutputStream(fos);
				
				//����ȭ
				out = new ObjectOutputStream(bos); 
				
	
				out.writeObject(book_dic);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					out.close();
					bos.close();
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}				
			}
		}
	
	void load() {
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			in	= new ObjectInputStream(bis);
			
			book_dic = (HashMap)in.readObject();
			
			Set<String> set = book_dic.keySet();
			
			for (String number : set) {
				String isbn = book_dic.get(number).getIsbn();
				String title = book_dic.get(number).getTitle();
				int price = book_dic.get(number).getPrice();							
			}
			
			} catch (FileNotFoundException e) {
				System.out.println("������ �������� �ʾƿ�");
			} catch (EOFException e) {
				System.out.println("�� " + e.getMessage());
			} catch (IOException e) {
				System.out.println("������ ���� �� �����");
			} catch (ClassNotFoundException e) {
				System.out.println("�ش� ��ü�� �������� �ʾƿ�");
			} catch (Exception e) {
				System.out.println("������ ����");
			} finally {
				try {
					in.close();
					bis.close();
					in.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}


}