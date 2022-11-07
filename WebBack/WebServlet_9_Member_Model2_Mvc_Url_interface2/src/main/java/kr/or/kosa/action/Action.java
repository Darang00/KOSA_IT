package kr.or.kosa.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//내가 생성하는 모든 서비스는 Action 인터페이스를 구현했으면 좋겠다
public interface Action {
	public ActionForward execute(HttpServletRequest request , HttpServletResponse response); //추상함수라서 함수의 구현 부분 없어야 한다
}


