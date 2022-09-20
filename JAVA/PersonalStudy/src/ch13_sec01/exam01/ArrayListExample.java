package ch13_sec01.exam01;

import java.util.*; //이거 한 줄 쓰거나

/*
import java.util.ArrayList;
import java.util.List; //이거 두 줄 써야한다 List collection의 ArrayList 라는 interface 구현하므로
*/

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //String 객체 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBTIS");
		
		int size = list.size();
		System.out.println("The total number of the objects is "+ size);
		System.out.println();
		
		String skill = list.get(2); //저장된 총 객체 수 얻기
		System.out.println("2: " +skill);
		System.out.println();
		
		for(int i = 0; i<list.size(); i++) { //저장된 총 객체 수 만큼 looping
			String str = list.get(i);
			System.out.println(i + ":"+str);
		}System.out.println();
		
		list.remove(2); //index[2]의 객체(Database) 삭제
		list.remove(2); //index[2]의 객체 (Servlet/JSP) 삭제
		list.remove("iBTIS");
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":" + str);			
		}		
		
	}

}
