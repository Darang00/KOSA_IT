package kr.or.kosa.common;

public class Car {

	
		int i; // �����Ϸ��� �ڵ����� default (���� ���� ���� package)
		// default package�� Ex01_Main���� i�� ��� �Ұ� (default �� ���� ���� ����)
		public int window; //���� package(����) �ٸ� package(����)�� ������� �� ���
		private int door; // ĸ��ȭ ���� �Ұ�... �� why ������� ������ ���ϴµ�
		// ���� ������ �ȵǴϱ� ���� �����ϰ� �� �ٰ�
		//setter, getter
		
		public void setDoor(int d) {
			door = d; // write (������ �ڿ�)
		}
		public int getDoor() {
			return door; //read (������ ����)
		
	}

}
