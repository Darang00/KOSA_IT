import java.io.IOException;

import kr.or.kosa.ExClass;

public class Ex04_throws {

	public static void main(String[] args) {
		/*
		try {ExClass ex = new ExClass("Temp");
		} catch (NullPointerException e) {��� ���� �� ó���ϴµ� �Ʒ� ���ܰ� ���� �ǹ�
			e.printStackTrace();
		} catch (IOException e); {
		e.printStackTrace();
	}

	}*/
		
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e) { // ��� ���� �� ó���ϴµ� �Ʒ� ���ܰ� ���� �ǹ�
			e.printStackTrace();
		}
	}
}