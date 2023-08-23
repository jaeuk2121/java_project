package co.yedam.board;

import java.util.List;
import java.util.Scanner;

import co.yedam.reply.ReplyApp;

public class BoardApp {

	Scanner scn = new Scanner(System.in);

	BoardService service = new BoardServiceJdbc();
	UserService uservice = new UserServiceJdbc();
	String logId;

	public void start() {
		//	id/pw 가 맞으면 진행 아니면 반복문탈출x
		while(true) {
			String id = printString("id");
			String pw = printString("pw");
			User user = new User();
			user.setUserId(id);
			user.setUserPw(pw);
			
			user = uservice.checkLogin(user);
			
			if(user != null) {
				System.out.println(user.getUserNm() + ", 환영합니다");
				logId= id;
				break;
			}else {
				System.out.println("로그인실패");
			}
		}
		
		
		boolean run = true;

		while (run) {
			System.out.println("1.글등록 2.목록 3.수정 4.삭제 5.상세조회 9.종료");
			System.out.println("선택>>");
			int menu = scn.nextInt();
			scn.nextLine();

			switch (menu) {
			case 1: // 글등록
				register();

				break;
			case 2: // 목록
				boardList();
				break;

			case 3: // 글수정
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				search();
				break;
			case 9:
				System.out.println("종료합니다");
				service.save();
				run = false;
			}
		}
	}// end

	private String printString(String msg) {
		System.out.println(msg + " >>");
		return scn.nextLine();
	}

	void register() {
		String title = printString("제목입력");
		String content = printString("내용입력");
		String writer = logId;
		Board board = new Board(title, content, writer);

		if (service.add(board)) {
			System.out.println("등록성공");
		}
	}

	void boardList() {
		int page = 1;
		while (true) {

			List<Board> list = service.list(page);
			for (Board b : list) {
				System.out.println(b.toString()); // listinfo
			}
			//4> 1pag, 9>2page, 19>4page
			int totalCnt = service.getTotal();
			int lastPage = (int) Math.ceil(totalCnt/5.0);
			for(int i=1; i<= lastPage;i++) {
				if(page == i) {
					System.out.printf("[" + i + "]");
				}else {
					System.out.printf(" %d ", i);
				}
			}
			System.out.println();
			System.out.println("총 개수:" + service.getTotal());
			System.out.print("조회페이지 입력 exit=9>>");
			page = scn.nextInt();
			if(page ==9) {
				break;
			}
		}
	}
//update board set brd_content = 'dfdf' where brd_no=5; 
	void modify() {
		String brdNo = printString("글번호입력");
		if(! service.getResponseUser(Integer.parseInt(brdNo)).equals(logId)) {
			System.out.println("권한없음");
			return;
		}
		String content = printString("내용입력");
		Board brd = new Board();
		brd.setBrdNo(Integer.parseInt(brdNo));
		brd.setBrdContent(content);
		if (service.modify(brd)) {
			System.out.println("수정성공");
		}
	}

	void remove() {
		String brdNo = printString("번호입력");
		if (service.remove(Integer.parseInt(brdNo))) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
	}

	void search() {
		String brdNo = printString("번호입력");
		Board result = service.search(Integer.parseInt(brdNo));
		if(result == null) {
			System.out.println("해당글번호가 없습니다.");
		}else {
			
			System.out.println(result.showInfo());
		}
		
		ReplyApp rapp = new ReplyApp();
		rapp.start();
	}

}
