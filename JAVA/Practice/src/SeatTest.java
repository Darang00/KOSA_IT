import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatTest {
	public String firstBraket = "[";
	//String blank = " ";
	public String firstList;
	public int midNumi;
	public int midNumj;
	public String lastBraket = "]";	
	
	public String[][] arr1 = new String[3][5];
	public String[][] arr2 = new String[4][5];
	public String[][] arr3 = new String[9][5];
	// int cnt = 0;
	static List<String[][]> room = new ArrayList<String[][]>(); //다형성 //열람실
	
	static String deskIndex[][] = new String[5][7]; //좌석 번호 //세로열 [0~9], 가로열[0, 9] 
	
	
	void seat() { //좌석 배열
			midNumi = 0;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[i].length; j++) {
					arr1[i][j] =firstBraket + "1"  + (String.valueOf(midNumi)) + (String.valueOf(midNumj++)) + lastBraket;
//					System.out.print(deskIndex[i][j]);
				}
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
			}
			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[i].length; j++) {
					arr2[i][j] =firstBraket + "2"  + (String.valueOf(midNumi)) + (String.valueOf(midNumj++)) + lastBraket;
//					System.out.print(deskIndex[i][j]);
				}
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
			}
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					arr3[i][j] =firstBraket + "3"  + (String.valueOf(midNumi)) + (String.valueOf(midNumj++)) + lastBraket;
//					System.out.print(deskIndex[i][j]);
				}
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
			}
			room.add(arr1);
			room.add(arr2);
			room.add(arr3);
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					System.out.print(arr3[i][j]);
				}
				System.out.println();
				midNumj = 0;
				String.valueOf(midNumi++);
				System.out.println();
			}		
	}



		
	

	
	
		
	void show() {
//		for(int r = 0; r<room.size(); r++) {
//			String[][] str = room.get(r);
//			System.out.println(r );
//		}
	}

		
		
		
	
	/*
	void checkAdd() { //ArrayList에 destIndex(2차원 배열 잘 들어갔니?)
		room.add(deskIndex)
		room.add(deskIndex);
	} */


	public static void main(String[] args) {
		
		SeatTest seatTest = new SeatTest();
		
		  seatTest.seat();
		  
		  room.add(deskIndex);
		  room.add(deskIndex);
		  
		  seatTest.show();
		  
		  //seatTest.checkAdd();
//		  for(int i = 0; i<room.size(); i++) {
//			 String[][] str = room.get(i);
//			 System.out.println(i + ":" + str);
//			 }
		//  for(String[][] i : room) {
		//	  System.out.println(Arrays.deepToString(i)); //Array.toString 하면 주소가 나온다 개빡침
		//  }
		 
	}
}
