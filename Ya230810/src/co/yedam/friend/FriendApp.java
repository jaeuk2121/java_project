package co.yedam.friend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import co.yedam.stream.Friend;




public class FriendApp {
	Map<String, String> userList = new HashMap<>();
	// 추가, 수정, 삭제, 목록:
	List<Friend> friends = new ArrayList<Friend>();
	Scanner scn = new Scanner(System.in);
	//생성자1
	public FriendApp() {
		userList.put ("user1", "1234");
		userList.put ("user2", "5678");
		userList.put ("user3", "9087");
		
	}
	
	private boolean userCheck() {
		
		System.out.println("id>> ");
		String id = scn.nextLine();
		System.out.println("pw>> ");
		String pw = scn.nextLine();
		if(userList.containsKey(id)) {
			if(userList.get(id).equals(pw)){
				return true;
			}
		}
		return false;

	}

	public void start() {
		boolean run = true;
		while(true) {
			if(userCheck()) {
				break;
			}
			System.out.println("로그인 실패");
		}
		

		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록");
			System.out.println("입력>");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				add();

			} else if (menu == 2) {
				edit();
				break;
			} else if (menu == 3) {

			} else if (menu == 4) {
				list();

			}
		}
	}

	private void add() {
		// Friend 인스턴스 생성
		// friends 컬랙션에 추가

		String name = printString("이름");
		String phone = printString("번호");
		String birth = printString("생년월일");
	}

	

	private void edit() {
		String name = printString("이름");
		String phone = printString("연락처");
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.get(i).setPhone(phone);
				break;
			}
		}

	}

	private void del() {
		String name = printString("이름");
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getName().equals(name)) {
				friends.remove(i);
			}
		}

	}

	private void list() {
		for (Friend fm : friends) {

		}
	}
}
