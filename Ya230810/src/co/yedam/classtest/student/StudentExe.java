package co.yedam.classtest.student;

public class StudentExe {
	public static void main(String[] args) {

		Student s1 = new Student(); //기본생성자를 호출해서 인스턴스를 만들겟다 s1이라는 주소값에
		s1.setStdNo(100);
//		s1.stdNo = 100;
//		s1.stdName = "Hong";
		s1.setStdName("Hong");
//		s1.score = 80;
		s1.setScore(-80);
		s1.stdInfo();
		System.out.println(s1.getStdName());
		
		Student s2 = new Student(101, "Hwang", 100);
		s2.stdInfo();
		
}
}
