package co.yedam.variable;

public class VariableExe2 {
	public static void main(String[] args) {
		int num1 = 10;
		String str = "홍길동";
		str = "김길동";
		
		// 홍길동, 20
		Person hong = new Person(); //person(클래스) hong(이름) 은 새로운 person(클래스)
		hong.name = "홍길동";
		hong.age = 20;
		hong.weight = 60.5;
		
		hong = new Person(); //새로 선언함으로 초기화됨
		
		System.out.println("이름은" + hong.name
				+ ", 나이는 " + hong.age
				+", 몸무게는" + hong.weight);
		
		VariableExe3 exe3 =new VariableExe3();
		exe3.showInfo();
		exe3.hellmMsg();
	}
}
