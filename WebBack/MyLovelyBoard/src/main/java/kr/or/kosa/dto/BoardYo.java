package kr.or.kosa.dto;

import java.util.Date;

public class BoardYo { // SELECT * FROM jspboard;
	private int idx; //jspboard 칼럼명과 동일
	private String writer;
	private String pwd;
	private String subject;
	private String content;
	//not null (필수 입력)
	private Date writedate; //default SYSDATE
	private int readnum; //default 0
	
	private String filename;
	private int filesize;
	private String homepage;
	private String email;
	//부가 입력 사항
	
	//계층형 (답글)
	private int refer; //글의 묶음
	private int depth; //글의 들여쓰기
	private int step; //글의 순서
	
	public BoardYo() {}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWritedate() {
		return writedate;
	}

	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}

	public int getReadnum() {
		return readnum;
	}

	public void setReadnum(int readnum) {
		this.readnum = readnum;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getFilesize() {
		return filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRefer() {
		return refer;
	}

	public void setRefer(int refer) {
		this.refer = refer;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	@Override
	public String toString() {
		return "BoardYo [idx=" + idx + ", writer=" + writer + ", pwd=" + pwd + ", subject=" + subject + ", content="
				+ content + ", writedate=" + writedate + ", readnum=" + readnum + ", filename=" + filename
				+ ", filesize=" + filesize + ", homepage=" + homepage + ", email=" + email + ", refer=" + refer
				+ ", depth=" + depth + ", step=" + step + "]";
	}

}
