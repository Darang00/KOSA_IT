package kr.or.kosa.dto;

import java.util.Date;

public class Board { //idx, userid, boardname, title, content, writedate, readnum, refernum, boardstatus
	   private int idx;  //jspboard 컬럼명과 동일
	   private String userid;  //writer
	   private String boardname="notice";
	   private String title; //title
	   private String content;
	   private Date writedate; //default SYSDATE
	   private int readnum;
	   //private int refernum;
	   private int boardstatus;
	   
	public Board() {
		super();
	}
	
	public Board(int idx, String userid, String boardname, String title, String content, Date writedate, int readnum,
			int boardstatus) {
		super();
		this.idx = idx;
		this.userid = userid;
		this.boardname = boardname;
		this.title = title;
		this.content = content;
		this.writedate = writedate;
		this.readnum = readnum;
		//this.refernum = refernum;
		this.boardstatus = boardstatus;
	}
	public int getIdx() {
		return idx;
	}
	public String getUserid() {
		return userid;
	}
	public String getBoardname() {
		return boardname;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Date getWritedate() {
		return writedate;
	}
	public int getReadnum() {
		return readnum;
	}

	/*
	 * public int getRefernum() { return refernum; }
	 */
	public int getBoardstatus() {
		return boardstatus;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public void setReadnum(int readnum) {
		this.readnum = readnum;
	}

	/*
	 * public void setRefernum(int refernum) { this.refernum = refernum; }
	 */
	public void setBoardstatus(int boardstatus) {
		this.boardstatus = boardstatus;
	}
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", userid=" + userid + ", boardname=" + boardname + ", title=" + title
				+ ", content=" + content + ", writedate=" + writedate + ", readnum=" + readnum + ", boardstatus=" + boardstatus + "]";
	}
	   
	
	   


}
