package co.yedam.classtest.student;

public class Student {
	//필드.
	private int stdNo; //0
	private String stdName; //null
	private int score;
	
	//생성자 : 필드의 값 초기화
	Student(){
		//기본생성자 인스턴스를 만들어주는기능
		
	}
	
	Student(int stdNo){
		this.stdNo = stdNo;
	}
	Student(int stdNo, String stdName, int score){
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.score = score;
	}
	//메소드
	void stdInfo() {
		System.out.println("학번: " + stdNo //
				+ ", 학생이름: " + stdName //
				+ ", 점수: " + score);
	}
	
	void setStdNo(int stdNo) {
		this.stdNo = stdNo;
		
	}
	void setStdName(String stdName) {
		this.stdName = stdName;
		
	}
	void setScore(int score) {
		if( score < 0) {
			this.score =0;
		} else {
			this.score = score;
		}
		
	}
	//getter 우클릭 source 밑에서 7번쨰꺼

	public int getStdNo() {
		return stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public int getScore() {
		return score;
	}
	
}
