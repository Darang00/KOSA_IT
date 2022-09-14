package kr.or.kosa.common;

public class Car {

	
		int i; // 컴파일러가 자동으로 default (같은 폴더 같은 package)
		// default package에 Ex01_Main에서 i는 사용 불가 (default 는 같은 폴더 한정)
		public int window; //같은 package(폴더) 다른 package(폴더)와 상관없이 다 사용
		private int door; // 캡슐화 접근 불가... 너 why 만들었어 쓰지도 못하는데
		// 직접 접근은 안되니까 간접 접근하게 해 줄게
		//setter, getter
		
		public void setDoor(int d) {
			door = d; // write (숨겨진 자원)
		}
		public int getDoor() {
			return door; //read (숨겨진 파일)
		
	}

}
