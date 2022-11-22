package kr.or.kosa.service.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dao.MemberDao;
import kr.or.kosa.dto.Board;
import kr.or.kosa.dto.Love;

public class LoveCount implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

		try {
			Board board = new Board();
			MemberDao memberDao;
			try {
				memberDao = new MemberDao();
			} catch (NamingException e) {
				e.printStackTrace();
			}
			Love love = new Love();
			PrintWriter out = response.getWriter();
			int result = memberDao.loveCheck(love);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
