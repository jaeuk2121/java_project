package co.yedam.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp2 {
	List<Friend> friends = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	
	public FriendApp2() {
		loadFile();
	}

	public void start() {
		boolean run = true;
		while (run) {

			System.out.println("1.등록 2. 목록 3. 종료");
			System.out.println("선택>>");
			int menu = scn.nextInt(); // 1엔터
			scn.nextLine();
			if (menu == 1) {
				add();
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				saveFile();
				run = false;
			}
		}
	}// end of start

	SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

	private void add() {
		String name = printString("이름입력");
		String phone = printString("연락처입력");
		String birth = printString("생일입력(95-06-03)");
		try {// 예외선언알아보기
			Friend fnd = new Friend(name, phone, sdf.parse(birth));
			friends.add(fnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void list() {
		for (Friend fnd : friends) {
			System.out.println(fnd);
		}
	}

	private void saveFile() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//friends 컬랙션에 있는 값 -> 텍스트형식으로 저장 char
		try {
			FileWriter fw = new FileWriter("C:/temp/friendList.txt");
			for(Friend fnd : friends) {
				String line = fnd.getName() + " " + fnd.getPhone() + " " + sdf.format(fnd.getBirth());
				fw.write(line + "\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private void loadFile() {
		File file = new File("C:/temp/friendList.txt");
		Scanner scn2 = null;
		try {
			scn2 = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private String printString(String msg) {
		System.out.print(msg + ">> ");
		return scn.nextLine();
	}
}