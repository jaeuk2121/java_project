package co.yedam.board;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
	// users.txt에서 정보를 읽고 user정보를 list컬랙션에 저장
	// User 클래스 생성.
	List<User> userList = new ArrayList<>();

	public UserServiceImpl() {
		loadFile();
	}

	@Override
	public boolean checkLogin(User user) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUserId().equals(user.getUserId())) {
				if (userList.get(i).getUserPw().equals(user.getUserPw())) {
					return true;
				}
			}

		}
		return false;
	}

	void loadFile() {
		try {
			FileReader fr = new FileReader("C:/temp/users.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				String[] data = str.split(" ");

				userList.add(new User(data[0], data[1], data[2]));
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
