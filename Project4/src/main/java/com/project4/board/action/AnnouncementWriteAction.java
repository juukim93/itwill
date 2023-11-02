package com.project4.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project4.board.db.BoardDAO;
import com.project4.board.db.BoardDTO;
import com.project4.util.Action;
import com.project4.util.ActionForward;

public class AnnouncementWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		BoardDTO dto = new BoardDTO();
		dto.setId(request.getParameter("id"));
		dto.setBoard_subject(request.getParameter("board_subject"));
		dto.setBoard_content(request.getParameter("board_content"));
		dto.setBoard_file(request.getParameter("board_file"));
		dto.setBoard_image(request.getParameter("board_image"));
		
		BoardDAO bdao = new BoardDAO();
		bdao.insertBoard(dto);
		
		ActionForward forward = new ActionForward();
		forward.setPath("./Announcement.bo");
		forward.setRedirect(true);
		
		return forward;
	
	
	}

}
