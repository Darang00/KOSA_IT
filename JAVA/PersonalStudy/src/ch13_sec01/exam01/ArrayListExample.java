package ch13_sec01.exam01;

import java.util.*; //�̰� �� �� ���ų�

/*
import java.util.ArrayList;
import java.util.List; //�̰� �� �� ����Ѵ� List collection�� ArrayList ��� interface �����ϹǷ�
*/

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //String ��ü ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBTIS");
		
		int size = list.size();
		System.out.println("The total number of the objects is "+ size);
		System.out.println();
		
		String skill = list.get(2); //����� �� ��ü �� ���
		System.out.println("2: " +skill);
		System.out.println();
		
		for(int i = 0; i<list.size(); i++) { //����� �� ��ü �� ��ŭ looping
			String str = list.get(i);
			System.out.println(i + ":"+str);
		}System.out.println();
		
		list.remove(2); //index[2]�� ��ü(Database) ����
		list.remove(2); //index[2]�� ��ü (Servlet/JSP) ����
		list.remove("iBTIS");
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":" + str);			
		}		
		
	}

}
