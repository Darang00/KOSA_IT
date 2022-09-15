import java.io.IOException;

import kr.or.kosa.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		/*
		try {ExClass ex = new ExClass("Temp");
		} catch (NullPointerException e) {모든 예외 다 처리하는데 아래 예외가 무슨 의미
			e.printStackTrace();
		} catch (IOException e); {
		e.printStackTrace();
	}

	}*/
		
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e) { // 모든 예외 다 처리하는데 아래 예외가 무슨 의미
			e.printStackTrace();
		}
	}
}