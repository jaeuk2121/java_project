package co.yedam.reply;

public class Exe {
	public static void main(String[] args) {
		
	ReplyApp app = new ReplyApp();
	app.start();
	}
}
//--댓글
//--3번 테스트 user3
//--1.첫번째 댓글입니다 user2
//--2.두번째 댓글입니다 user1
//--5.두번째 댓글입니다 user1
//--8.두번째 댓글입니다 user1
//--(항목: 댓글번호, 원본글번호, 댓글내용. 댓글작성자) Reply.java
//--(기능: 댓글등록, 댓글목록, 댓글삭제) -ReplyService.java 인터페이스
//--                                  ReplyServiceImpl or ReplyServiceJdbc
