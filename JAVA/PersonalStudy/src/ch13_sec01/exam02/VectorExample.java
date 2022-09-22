package ch13_sec01.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//Board 객체를 저장
		list.add(new Board("title1", "content1", "author1"));
		list.add(new Board("title2", "content2", "author2"));
		list.add(new Board("title3", "content3", "author3"));
		list.add(new Board("title4", "content4", "author4"));
		list.add(new Board("title5", "content5", "author5"));
		
		list.remove(2); //2번 인덱스 객체(title3) 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(3); //3번 인덱스 객체(title5) 삭제
		
		for(int i = 0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.title + "\t" + board.content + "\t" + board.author);
		}
	}

}
