package kr.or.kosa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.or.kosa.dto.BoardYo;

public class BoardDaoYo {
	DataSource ds = null;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql; 
	List<BoardYo> list;
	
	public BoardDaoYo() throws NamingException{
		Context context = new InitialContext();
		ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
	}
	
	//글쓰기 (원본글)
	public int writeok(BoardYo boarddata) {
		conn = null;
		pstmt = null;
		int row = 0;
		try {
			conn = ds.getConnection();
			sql = "insert into jspboard(idx, writer, pwd, subject, content, email, homepage, writedate, readnum, filename, filesize, refer)"+
			" values(jspboard_idx.nextval, ?, ?, ?, ?, ?, ?, sysdate, 0, ?, 0, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, boarddata.getWriter());
			pstmt.setString(2, boarddata.getPwd());
			pstmt.setString(3, boarddata.getSubject());
			pstmt.setString(4, boarddata.getContent());
			pstmt.setString(5, boarddata.getEmail());
			pstmt.setString(6, boarddata.getHomepage());
			pstmt.setString(7, boarddata.getFilename());
			
			//계층형 게시판
			//refer (참조값), step, depth
			//1. 원본글: refer 생성? ,  step(0) default, depth(0) default
			//2. 답변글: refer 생성? , step +1, depth +1
			
			int refermax = getMaxRefer();
			int refer = refermax + 1;
			pstmt.setInt(8,  refer);
			
			row = pstmt.executeUpdate();
		}catch(Exception e) {
			
		}finally {
			try {
				pstmt.close();
				conn.close(); //반환하기
			} catch (Exception e2) {
				
			}
		}
		
		return row;
	}
	
	//글쓰기 (refer) 값 생성하기 (원본글)
	private int getMaxRefer() {
		conn = null;
		pstmt = null;
		rs = null;
		int refer_max=0;
		try {
			conn = ds.getConnection(); // 빌려주세요^^ 이따 반납할게요
			 sql = "select nvl(max(refer), 0) from jspboard";
			 pstmt = conn.prepareStatement(sql);
			 rs = pstmt.executeQuery();
			 if(rs.next()) {
				 refer_max = rs.getInt(1);
			 }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				pstmt.close();
				rs.close();
				conn.close(); //반납이요^^
			}catch(Exception e) {
				
			}
		}
		return refer_max;
	}
	
	//게시물 목록보기
	public List<BoardYo> list(int cpage, int pagesize){
		conn = null;
		pstmt = null;
		rs = null;
		list = null;
		try {
			conn = ds.getConnection();
			sql = "select * from " + 
											"(select rownum rn, idx, writer, email, homepage, pwd, subject, content, writedate, readnum " + 
											", filename, filesize, refer, depth, step " + 
											"from ( SELECT * FROM jspboard ORDER BY refer DESC, step ASC ) " +
											"where rownum <= ?" + //endrow
											") where rn >=?" ; // startrow
			pstmt = conn.prepareStatement(sql);
			// 공식같은 로직
			int start = cpage * pagesize - (pagesize -1); 
			int end = cpage * pagesize; 
			//
			pstmt.setInt(1, end);
			pstmt.setInt(2, start);
			
			rs = pstmt.executeQuery();
			list = new ArrayList<BoardYo>();
			while(rs.next()) {
				BoardYo boardYo = new BoardYo();
				boardYo.setIdx(rs.getInt("idx"));
				boardYo.setSubject(rs.getString("subject"));
				boardYo.setWriter(rs.getString("writedate"));
				boardYo.setWritedate(rs.getDate("writedate"));
				boardYo.setReadnum(rs.getInt("readnum"));
				
				//계층형
				boardYo.setRefer(rs.getInt("refer"));
				boardYo.setStep(rs.getInt("step"));
				boardYo.setDepth(rs.getInt("depth"));
				
				list.add(boardYo);

			}

			
		} catch (Exception e) {
			System.out.println("오류: " + e.getMessage());
		}finally {
			try {
				pstmt.close();
				rs.close();
				conn.close(); //반환
			}catch (Exception e2) {

			}
		}
		return list;
	}
	
	//게시물 총 건수 구하기
	public int totalBoardCount() {
		conn = null;
		pstmt = null;
		rs = null;
		int totalcount = 0;
		try {
			conn = ds.getConnection();
			sql = "select count(*) cnt from jspboard";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				totalcount = rs.getInt("cnt");
			}
		} catch (Exception e) {
			
		}finally {
			try {
				pstmt.close();
				rs.close();
				conn.close();
			}
		}
	
	}
	

}
