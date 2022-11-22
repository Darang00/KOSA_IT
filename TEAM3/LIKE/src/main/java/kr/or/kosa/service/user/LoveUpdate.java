package kr.or.kosa.service.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dao.MemberDao;
import kr.or.kosa.dto.Love;

public class LoveUpdate implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

		ActionForward forward = null;

		try {
			
			//System.out.println("loveupdate 서비스 진입");
			
			MemberDao member = new MemberDao();
			Love love = new Love();
			String userid = request.getParameter("userid");
			int idx = Integer.parseInt(request.getParameter("idx"));
			
			love.setIdx(idx);			
			love.setUserid(userid);
			
			
			int resultrow = member.loveCheck(love);
			
			if (resultrow == 0) {
				// 추천하기
				member.loveUpdate(love);
				
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/WEB-INF/views/board/board_content.jsp");

			} else if (resultrow == 1) {
				// 이미 추천한 경우
				member.loveUpdate(love);

				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/WEB-INF/views/board/board_content.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return forward;

	}
}
