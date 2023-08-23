package co.yedam.board;

import java.io.Serializable;

public class Reply implements Serializable {
	private int replyNo;
	private int writeNo;
	private String rpContent;
	private String rpWriter;

	public Reply() {

	}

	public Reply(int replyNo,String rpContent, String rpWriter) {
		super();
		this.replyNo = replyNo;
		this.rpContent = rpContent;
		this.rpWriter = rpWriter;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public int getWriteNo() {
		return writeNo;
	}

	public void setWriteNo(int writeNo) {
		this.writeNo = writeNo;
	}

	public String getRpContent() {
		return rpContent;
	}

	public void setRpContent(String rpContent) {
		this.rpContent = rpContent;
	}

	public String getRpWriter() {
		return rpWriter;
	}

	public void setRpWriter(String rpWriter) {
		this.rpWriter = rpWriter;
	}

	@Override
	public String toString() {
		return replyNo + "댓글내용: " + rpContent + " 작성자 :" + rpWriter;
	}
	
	
	
	
	
}