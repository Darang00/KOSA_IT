package kr.or.kosa.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;

public class BookMarksListService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		
		try {
			System.out.println("BookMarksListService try문 진입");
			
		} catch (Exception e) {
			System.out.println("The error e is " + e.getMessage());
			e.getStackTrace();
		}
		
		
		return forward;
	}

}
