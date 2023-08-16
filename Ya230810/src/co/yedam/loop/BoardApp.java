package co.yedam.loop;

import java.util.Scanner;

public class BoardApp {

	Board[] boards = new Board[10];
	
	Scanner scn = new Scanner(System.in);
	
	
	
	
	void add() {
		System.out.println("제목 >>");
		String head = scn.nextLine();
		System.out.println("내용 >>");
		String body = scn.nextLine();
		System.out.println("작성자 >>");
		String name = scn.nextLine();
		
		
		Board board = new Board();
		board.head=head;
		board.body=body;
		board.name=name;
		
		
		for(int i=0; i<boards.length; i++) {
			if(boards[i]==null) {
				boards[i]= board;
				break;
			}
		}
		System.out.println("Ok");
	}
	
	
	
	void edit() {
		
		
		
		System.out.println("번호>>");
		int idx = Integer.parseInt(scn.nextLine());
		
		if(idx==boards.length) {
			System.out.println("변경제목");
			boards[idx].head = scn.nextLine();
			
			
		}
		
		
	}	
	
	
	
	
	void start() {
		
		
		boolean run = true;
		
		while (run) {
			System.out.println("1.등록 2.목록 3.상세보기 4.수정 5.삭제");
			System.out.println("선택>>");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			
			case 1:
				add();
				break;
			case 2:
				System.out.println("글번호 \t 제목 \t작성자");
				for(int i=0; i<boards.length;i++) {
					if(boards[i] != null){
						
						System.out.print("" + (i+10));
						boards[i].Info();
						
					}	
				}
				break;
			case 3:
				
			case 4:
				edit();
				break;
			case 5:
				
			
			}
		}
	}
}
