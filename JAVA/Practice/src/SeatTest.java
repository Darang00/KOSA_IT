import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatTest {
	
	public String firstBraket = "[";
	private int indexX;
	private int indexY;
	public String lastBraket = "]";	
	private int cnt;
	private List<String[][]> roomNum = new ArrayList<String[][]>(); //������ //������ ��ȣ roomNum
	

	private String deskIndex1[][] = new String[6][9]; //�¼� ��ȣ //���ο� [0~2], ���ο�[0~6] 
	private String deskIndex2[][] = new String[4][6]; //�¼� ��ȣ //���ο� [0~3], ���ο�[0~5]
	private String deskIndex3[][] = new String[5][5]; //�¼� ��ȣ //���ο� [0~4], ���ο�[0~4]
	
	Scanner scan = new Scanner(System.in);
	
	void init() { //�ʱ�� �¼� �迭
		cnt = 0;
		
		//1������ �¼� �迭 arr1
		for (int i = 0; i <deskIndex1.length; i++) {
			for (int j = 0; j <deskIndex1[i].length; j++) {
				deskIndex1[i][j] =firstBraket + (String.valueOf(cnt++)) + lastBraket;
				//System.out.print(deskIndex1[i][j]);
			}
		}
		cnt=0;
		
		//2������ �¼� �迭 arr2
		for (int i = 0; i <deskIndex2.length; i++) {
			for (int j = 0; j <deskIndex2[i].length; j++) {
				deskIndex2[i][j] =firstBraket + (String.valueOf(cnt++)) + lastBraket;
			}
		}
		cnt=0;
		//3������ �¼� �迭 arr3
		for (int i = 0; i <deskIndex3.length; i++) {
			for (int j = 0; j <deskIndex3[i].length; j++) {
				deskIndex3[i][j] =firstBraket + (String.valueOf(cnt++)) + lastBraket;
			}
		}
		cnt=0;
		  roomNum.add(deskIndex1);
		  roomNum.add(deskIndex2);
		  roomNum.add(deskIndex3);
	}

	public List<String[][]> getRoomNum() {
		return roomNum;
	}

	public void makeRoom(int x, int y) {
		String temp[][] = new String[y][x];
		int room = 1;
		
		for(int i = 0 ; i < temp.length ; i++) {
			for(int j = 0 ; j < temp[i].length ; j++) {
				temp[i][j] = "[" + room +"]";
				room++;
			}
		}
		roomNum.add(temp);
	}
	
	public void print(int room) {
		String tmp[][] = roomNum.get(room-1);
		
		for(int i = 0 ; i < tmp.length ; i++) {
			for(int j = 0 ; j < tmp[i].length ; j++) {
				System.out.print(tmp[i][j]+"\t"); //�ڸ� �̻ڰ� ǥ���ϱ�
			}
			System.out.println();
		}
	}
	
	///
	public void update(int room) {
		boolean pnp = true; // [�����] �¼� ���ý� �ٽ� ������.

		while (pnp == true) {
			String seat = scan.nextLine();
			String tempSeat = "[" + seat + "]";
			String tmp[][] = roomNum.get(room - 1);

			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					if (tmp[i][j].equals(tempSeat)) {
						pnp = false;
						tmp[i][j] = "[" + "�����" + "]";
						this.indexX = i;
						this.indexY = j;
					}

				}
			}
		}

	}

	public int getIndexX() {
		return indexX;
	}

	public int getIndexY() {
		return indexY;
	}
	
}
