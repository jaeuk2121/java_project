package co.yedam.friend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendApp {
	// 배열 > 컬랙션 > 파일 > DB
	Friend[] friends = new Friend[10];
	Scanner scn = new Scanner(System.in);

	// 컨트롤 //매개변수의 값이 어떻게 처리되는가
	public void start() {
		boolean run = true;
		int menu = -1;
		while (run) {
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("선택>>");
			try {
			menu = scn.nextInt(); // 3엔터를 입력하면 엔터가 남아잇음
			}catch(InputMismatchException e) {
				System.out.println("메뉴를 다시 선택하세요.");
			
				continue;
			}finally {
				scn.nextLine(); // 엔터까지 소진시켜줌
			}
			switch (menu) {
			case 1:
				addFriend();
				break;
			case 2:
				search();
				break;
			case 3:
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				System.out.println("종료합니다");
				run = false;
				break;

			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
	}

	//
	private String printString(String msg) {
		System.out.println(msg + ">>");
		return scn.nextLine();
	}
	// 등록
	int subMenu = -1;
	private void addFriend() {
		System.out.println("1.학교 2. 회사 3. 기타");
		System.out.printf("선택>>");
		try {
			subMenu = scn.nextInt();
		}catch(InputMismatchException e){
			System.out.println("1 2 3 중에 선택하세요.");
			scn.nextLine();
			addFriend();
		}finally {
			scn.nextLine();
		}

		Friend friend = null;
		String name = printString("이름입력");
		String phone = printString("연락처입력");

		if (subMenu == 1) {
			String univ = printString("학교입력");
			String major = printString("전공입력");

			friend = new UnivFriend(name, phone, univ, major);
		} else if (subMenu == 2) {
			String comp = printString("회사입력");
			String dept = printString("부서입력");
			friend = new ComFriend(name, phone, comp, dept);
		} else {
			friend = new Friend(name, phone);
		}

		//
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;   //모두담을수있는 코드 친구,회사,대학
				break;
			}

		}
	}

	// 조회 : 이름->조회. 이름 안넣으면 전체조회
	private void search() {
		boolean Exist = false;
		System.out.println("조회할 이름입력");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && name.equals("")) { //전체
				System.out.println(friends[i].showInfo());
			}else if (friends[i] != null && friends[i].getName().equals(name)) { //입력값
				System.out.println(friends[i].showInfo()); //반복문으로 바꿔넣어보기 (동명이인)
				break;
		
		}else if(!Exist) {
			System.out.println("이름 없음");
		}
		}
	}
		
	// 수정 :이름 넣으면 연락처수정.
	private void modify() {
		System.out.println("수정할 이름입력");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				System.out.println("번호수정");
				String phone = scn.nextLine();
				System.out.println("이름수정");
				name = scn.nextLine();
				
				friends[i] = new Friend(name,phone);
			}
		}
	}

	// 삭제 : 이름 넣으면 삭제.
	private void remove() {
		System.out.println("삭제할 이름입력");
		String name = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i]= null;
			}
	}
}
}