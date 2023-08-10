package co.yedam.array;

import java.util.Scanner;

public class FriendApp {
	//checkFriend(String name) {}
	//public static 붙이는 이유
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[10];
	static String name;
	static String phone;
	static Gender gender;
	
	public static boolean checkFriend(String name) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals(name)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void init() {
		//초기값
			for(int i = 0; i< friends.length; i++) {
				Friend f = new Friend();
				f.name = "test"+ i;
				f.phone = "010-3245-456" +i;
				f.gender = i% 2 == 0 ? Gender.MEN : Gender.WOMEN;
					
					friends[i] = f;
				}
				
	}
	public static void printMenu() {
		System.out.printf("1. 추가, 2. 수정, 3. 삭제, 4. 조회, 5. 목록, 6. 종료");
		System.out.printf("선택>> ");
	}
	
	public static void add() {
		System.out.println("이름>>");
		String name = scn.nextLine();				
		System.out.println("연락처>>");
		String phone = scn.nextLine();				
		System.out.println("성별(1:남자, 2:여자)>>");
		int choice = Integer.parseInt(scn.nextLine());		
		Gender gender;
		if(choice== 1) {
			gender = Gender.MEN;
		}else {
			gender = Gender.WOMEN;
		}
		Friend fnd = new Friend();
		fnd.name=name;
		fnd.phone = phone;
		fnd.gender = gender;
		
		for(int i=0; i<friends.length;i++) {
			if(friends[i] == null ) {
				friends[i]= fnd;
				
			}
			
		}
		System.out.println("OK");
	}
	public static void edit() {
		
		System.out.println("이름>>");
		name = scn.nextLine();
		if(!checkFriend(name)) {
			System.out.println("찾는 이름이 없습니다.");
			break;
		}
		System.out.println("연락처>>");
		phone = scn.nextLine();
		
		for(int i=0; i<friends.length;i++) {
			if(friends[i] != null ) {
				if(friends[i].name.equals(name)) {
					friends[i].phone = phone;
					break; //for
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//추가, 수정, 삭제, 조회, 목록
		boolean run = true;
		Friend[] friends = new Friend[10];
		
		
		
		
while(run) {
			printMenu();
			
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1:
				add();
				break;
			case 2:
				edit();
				break;
				//switch
				
			case 3:
				boolean Exist = false;
				System.out.print("이름>>");
				name = scn.nextLine();
				if(!checkFriend(name)) {
					System.out.println("찾는 이름이 없습니다.");
					break;
				}
				for(int i=0; i<friends.length;i++) {
					if(friends[i] != null
						&& friends[i].name.equals(name)){
						friends[i] = null;
						Exist = true;
						break;
					}
				}
						if(!Exist){
							System.out.println("입력하신 이름이 없습니다.");
						}	
							break;
			case 4://조회. 이름 연락처 성별
				System.out.print("이름>>");
				name = scn.nextLine();
				for(int i=0; i<friends.length;i++) {
					if(friends[i] != null
						&& friends[i].name.equals(name)){
						friends[i].showInfo();
						break;
					}
				}
				break;
			case 5: //목록. 이름 연락처 
				for(int i=0; i<friends.length;i++) {
					if(friends[i] != null){
						friends[i].briefInfo();
				}	
					}
						break;
			case 6: //종료
				run = false;
				break;
			default : 
				System.out.println("메뉴를 다시 선택하세요");
				break;
			}
}
System.out.println("end");
}
}