package kr.or.kosa.action; //java 내장 인터페이스다 직접 선언한거 아니고.

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//생성하는 모든 서비스는 Action 인터페이스를 구현했으면 좋겠다

public interface Action { //이 인터페이스를 구현한는 클래스들은 service 패키지 안에 있는 클래스들
	public ActionForward execute(HttpServletRequest request , HttpServletResponse response);
}

