package co.yedam.classtest.friend;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;

public class FriendApp {

	Friend[] frds = new Friend[10];
	Scanner scn = new Scanner(System.in);
	
	public FriendApp(){
		
	}

	void addFriend() {
		System.out.println("이름 연락처 생년월일");
		String[] data = scn.nextLine().split(" ");


		Friend friend = new Friend(data[0], data[1], data[2]);

		for (int i = 0; i < frds.length; i++) {
			if (frds[i] == null) {
				frds[i] = friend;
				break;
			}
		}
	}// addFriend

//		try {
//			birth = sdf.parse(data[2]);
//		}catch (ParseException e) {
//			e.printStackTrace();
//		}
//		new Friend(data[0],data[1],birth);
//	}

	void list() {
		for (int i = 0; i < frds.length; i++) {
			if (frds[i] != null) {
				System.out.println(frds[i].toString());
			}
		}
	}
	void findFriend() {
		boolean Exist = false;
		System.out.println("찾을 이름");
		String name = scn.nextLine(); 
		for (int i = 0; i <frds.length; i++) {
			if (frds[i] != null && frds[i].getName().equals(name)) {
				System.out.println(frds[i].toString());
				Exist= true;
				break;
			}if(!Exist) {
				System.out.println("입력하신 이름이 존재하지않습니다.");
				}
		}
	}


	 void start() {

		FriendApp app = new FriendApp();
		Scanner scn = app.scn;

		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정 5.삭제 9.종료");// findFriend/editFriend/delFriend
			System.out.print("선택>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case Menu.ADD:
				app.addFriend();
				break;

			case Menu.LIST:
				app.list();
				break;
			case Menu.SEARCH:
				app.findFriend();
				break;
			case Menu.EDIT:

			case Menu.DEL:

			case Menu.EXIT:
				System.out.println("종료합니다");
				run = false;
			}// end of switch
		} // end of while
	}// end of start
}// end of class
