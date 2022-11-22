package kr.or.kosa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.or.kosa.dto.Board;
import kr.or.kosa.dto.Files;
import kr.or.kosa.dto.Grade;
import kr.or.kosa.dto.Love;
import kr.or.kosa.dto.MemberDetail;
import kr.or.kosa.dto.UserGrade;

public class MemberDao {
	DataSource ds = null;
	private Connection conn;
	private PreparedStatement pstmt1;
	private PreparedStatement pstmt2;
	private PreparedStatement pstmt3;
	private ResultSet rs1;
	private String sql1;
	private String sql2;
	private String sql3;
	private int idx;
	private int resultRow;
	private String pwdCheck;
	private Board board;
	private List<Board> boardList;
	private int totalcount;
	private Love love;
	private Grade grade;
	private UserGrade usergrade;

	public MemberDao() throws NamingException {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		conn = null;
		pstmt1 = null;
		pstmt2 = null;
		pstmt3 = null;
		rs1 = null;
		resultRow = 0;
		sql1 = "";
		sql2 = "";
		sql3 = "";
		idx = 0;
	}

	// 계정 수정
	public int update(MemberDetail memberdetail) {
		try {
			// String pwdCheck;
			conn = ds.getConnection();
			sql1 = "update MemberDetail set pwd=?, name=?, email=?, phone=?, address=?, gender=? where userid=?";
			pstmt1 = conn.prepareStatement(sql1);

			pstmt1.setString(1, memberdetail.getPwd());
			pstmt1.setString(2, memberdetail.getName());
			pstmt1.setString(3, memberdetail.getEmail());
			pstmt1.setString(4, memberdetail.getPhone());
			pstmt1.setString(5, memberdetail.getAddress());
			pstmt1.setString(6, memberdetail.getGender());
			pstmt1.setString(7, memberdetail.getUserid());
			resultRow = pstmt1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return resultRow;
	}

	// 카테고리별 게시물 총 건수 구하기
	public int totalBoardCount(String boardname) {
		try {
			conn = ds.getConnection();
			sql1 = "select count(*) cnt from board where boardname = ?";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setString(1, boardname);

			rs1 = pstmt1.executeQuery();
			if (rs1.next()) {
				totalcount = rs1.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		return totalcount;
	}

	// 게시물 총 건수 구하기
	public int totalBoardCount() {
		try {
			conn = ds.getConnection();
			sql1 = "select count(*) cnt from board";
			pstmt1 = conn.prepareStatement(sql1);
			rs1 = pstmt1.executeQuery();
			if (rs1.next()) {
				totalcount = rs1.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		return totalcount;
	}

	// 카테고리별 게시물 목록보기
	public List<Board> list(int cpage, int pagesize, String boardname) {
		try {
			conn = ds.getConnection();
			sql1 = "select * from (select rownum as num, b.* from " + "board b where boardname = ? order by idx desc) "
					+ "where num <= ? " + // end
					"and num >= ?"; // start
			pstmt1 = conn.prepareStatement(sql1);

			int start = cpage * pagesize - (pagesize - 1);
			int end = cpage * pagesize;
			pstmt1.setString(1, boardname);
			pstmt1.setInt(2, end);
			pstmt1.setInt(3, start);
			rs1 = pstmt1.executeQuery();
			boardList = new ArrayList<Board>();

			while (rs1.next()) {
				board = new Board();
				board.setIdx(rs1.getInt("idx"));
				board.setTitle(rs1.getString("title"));
				board.setUserid(rs1.getString("userid"));
				board.setWritedate(rs1.getDate("writedate"));
				board.setReadnum(rs1.getInt("readnum"));
				// 계층형
				board.setLovenum(rs1.getInt("lovenum"));
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();// 반환
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return boardList;
	}

	// 게시물 목록보기
	public List<Board> list(int cpage, int pagesize) {
		try {
			conn = ds.getConnection();
			sql1 = "select * from (select rownum as num, b.* from " + "board b order by lovenum desc, idx asc) "
					+ "where num <= ? " + // end
					"and num >= ?"; // start

			pstmt1 = conn.prepareStatement(sql1);

			int start = cpage * pagesize - (pagesize - 1);
			int end = cpage * pagesize;
			pstmt1.setInt(1, end);
			pstmt1.setInt(2, start);
			rs1 = pstmt1.executeQuery();
			boardList = new ArrayList<Board>();

			while (rs1.next()) {
				board = new Board();
				board.setIdx(rs1.getInt("idx"));
				board.setTitle(rs1.getString("title"));
				board.setUserid(rs1.getString("userid"));
				board.setWritedate(rs1.getDate("writedate"));
				board.setReadnum(rs1.getInt("readnum"));
				// 계층형
				board.setLovenum(rs1.getInt("lovenum"));
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return boardList;
	}

	// 글쓰기
	public int writeok(Board board) {
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String boardname = "";
			sql1 = "select boardname from category where boardname=?";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setString(1, board.getBoardname());
			rs1 = pstmt1.executeQuery();
			sql2 = "insert into board(idx,userid,boardname,title,content,writedate,readnum,lovenum,boardstatus) "
					+ "values(board_idx.nextval,?,?,?,?,sysdate,0,0,1)";

			if (rs1.next()) {
				boardname = rs1.getString("boardname");
			} else {
				boardname = "";
			}
			pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, board.getUserid());
			pstmt2.setString(2, boardname);
			pstmt2.setString(3, board.getTitle());
			pstmt2.setString(4, board.getContent());
			resultRow = pstmt2.executeUpdate();

			conn.commit();
			conn.setAutoCommit(true);

		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				pstmt2.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		return resultRow;
	}

	// 글쓰기(파일 추가)
	public int writeok(Board board, Files file) {
		try {

			resultRow = writeok(board);
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			if (resultRow > 0) {
				sql1 = "select max(idx) as idx from board";
				pstmt1 = conn.prepareStatement(sql1);
				rs1 = pstmt1.executeQuery();
				if (rs1.next()) {
					idx = rs1.getInt("idx");
					sql2 = "insert into files(filenum,idx,filename,filesize) " + "values(files_idx.nextval,?,?,?)";
					pstmt2 = conn.prepareStatement(sql2);
					pstmt2.setInt(1, idx);
					pstmt2.setString(2, file.getFilename());
					pstmt2.setInt(3, file.getFilesize());
					resultRow = pstmt2.executeUpdate();
				}
			}

			conn.commit();
			conn.setAutoCommit(true);

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				pstmt2.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		return resultRow;
	}

	// 게시물 상세보기
	public Board getContent(int idx) {
		try {
			conn = ds.getConnection();
			sql1 = "select idx, userid, boardname, title, content, writedate, "
					+ "readnum, lovenum, boardstatus from board where idx=?";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, idx);
			rs1 = pstmt1.executeQuery();
			if (rs1.next()) {
				board = new Board();
				board.setIdx(rs1.getInt("idx"));
				board.setUserid(rs1.getString("userid"));
				board.setBoardname(rs1.getString("boardname"));
				board.setTitle(rs1.getString("title"));
				board.setContent(rs1.getString("content"));
				board.setBoardstatus(rs1.getInt("boardstatus"));
				board.setReadnum(rs1.getInt("readnum"));
				board.setLovenum(rs1.getInt("lovenum"));
				board.setWritedate(rs1.getDate("writedate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return board;
	}

	// 게시글 조회수 증가
	public boolean getReadNum(int idx) {
		boolean result = false;
		try {
			conn = ds.getConnection();
			sql1 = "update board set readnum = readnum + 1 where idx=?";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, idx);
			resultRow = pstmt1.executeUpdate();
			if (resultRow > 0) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}

	// 추천 여부 검사
	public int loveCheck(Love love) {

		int lovecheck = -1; // 아예 동작하지 않을 경우 대비해서 -1로 초기화

		try {
			conn = ds.getConnection();
			sql1 = "select count(*) cnt from love where idx = ? and userid = ?";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, love.getIdx());
			pstmt1.setString(2, love.getUserid());
			rs1 = pstmt1.executeQuery();

			if (rs1.next()) {
				lovecheck = rs1.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		return lovecheck;
	}

	// 추천 insert, delete
	public int loveUpdate(Love love) {

		int lovecheck = -1;

		try {
			lovecheck = loveCheck(love);

			conn = ds.getConnection();
			conn.setAutoCommit(false);

			if (lovecheck == 0) {
				sql1 = "insert into love(loveidx, idx, userid) values(love_idx.nextval, ?, ?)";
				pstmt1 = conn.prepareStatement(sql1);
				pstmt1.setInt(1, love.getIdx());
				pstmt1.setString(2, love.getUserid());
				resultRow = pstmt1.executeUpdate();
			} else if (lovecheck == 1) {
				sql2 = "delete from love where idx=? and userid=?";
				pstmt2 = conn.prepareStatement(sql2);
				pstmt2.setInt(1, love.getIdx());
				pstmt2.setString(2, love.getUserid());
				resultRow = pstmt2.executeUpdate();
			}

			conn.commit();
			conn.setAutoCommit(true);

		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			} finally {
				try {
					pstmt1.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
		}
		return resultRow;
	}

	// 추천수 카운트
	public int loveCount(int idx) {

		int lovecount = 0;

		try {
			conn = ds.getConnection();
			sql1 = "select count(loveidx) cnt from love where idx in (select idx from board where idx=?)";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, love.getIdx());
			rs1 = pstmt1.executeQuery();

			if (rs1.next()) {
				lovecount = rs1.getInt("cnt");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt1.close();
				rs1.close();
				conn.close();
			} catch (Exception e2) {
			}
		}

		return lovecount;
	}

}
