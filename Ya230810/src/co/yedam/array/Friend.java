package co.yedam.array;

public class Friend {

	String name;
	String phone;
	Gender gender;
	
	//func 안에 있는 것을 메소드
	//자바는 타입을 지정하는 것이 중요
	//void 뜻알아보기
	void showInfo(){
		System.out.printf("이름:%s, 연락처:%s, 성별:%s\n",
				name, phone,
				gender == Gender.MEN ? "남" : "여");
	}
	
	void briefInfo() {
				System.out.printf("이름:%s, 연락처:%s\n", //
						name, phone);
	}
	
}
