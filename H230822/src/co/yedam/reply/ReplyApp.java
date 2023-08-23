package co.yedam.reply;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yedam.board.ReplyServiceImpl;

public class ReplyApp {
	Scanner scn = new Scanner(System.in);
	String logWriter;
	int no;
	ReplyService service = new ReplyServiceImpl();
	List<Reply> rplist = new ArrayList<>();
	 
	public void start() {
		
		boolean run = true;

		while (run) {
			System.out.println("1.댓글등록 2.댓글목록 3.댓글삭제");
			System.out.println("선택 >>");
			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				replyList();
				break;
			case 3:
				remove();
				break;
			case 4:
				System.out.println("종료");
				service.save();
				
				run = false;
			}

		}
	} // start end

	void register() {
		no++;
		String content = printString("내용입력");
		String writer = logWriter;
		int replyNo = no;
		Reply rp = new Reply(replyNo, content, writer);
		rplist.add(rp);

	}

	void replyList() {

		for (int i = 0; i < rplist.size(); i++) {
			System.out.println(rplist.get(i).toString());
		}

	}

	void remove() {
		System.out.println("삭제할 댓글번호입력");
		int replyNo = scn.nextInt();
		scn.nextLine();
		try {
			if (rplist.get(replyNo - 1) != null) {

				rplist.remove(replyNo - 1);
				System.out.println("삭제성공");
			}
		} catch (Exception e) {
			System.out.println("삭제실패");
		}

	}

	private String printString(String msg) {
		System.out.println(msg + " >>");
		return scn.nextLine();
	}
}
