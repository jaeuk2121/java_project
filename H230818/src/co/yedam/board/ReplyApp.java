package co.yedam.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		String content = printString("댓글 내용 입력");
		String writer = logWriter;

		Reply reply = new Reply();
		reply.setRpContent(content);
		reply.setRpWriter(writer);

		service.add(reply);

	}

	void replyList() {
		List<Reply> replyList = service.list();

		if (replyList.isEmpty()) {
			System.out.println("댓글없음");
		} else {
			for (Reply reply : replyList) {
				System.out.println(reply.toString());
			}
		}
	}

	void remove() {
		String replyNo = printString("번호입력");
		if (service.remove(Integer.parseInt(replyNo))) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
	}

	private String printString(String msg) {
		System.out.println(msg + " >>");
		return scn.nextLine();
	}
}
