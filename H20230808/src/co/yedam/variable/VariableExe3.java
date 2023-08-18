package co.yedam.variable;

public class VariableExe3 {
	
	int num = 101; // 전체에 통하는 num1
	
	public void showInfo() {
		int num = 100 + this.num; //this.num = 101
		System.out.println("num: " + num);
		int num1 = 200; //로컬변수는 선언된 실행블럭안에서만 유효값
	}
	
	public void printNum() {
		int num1 = 200;
		System.out.println("num: " + num1);
	}
	public void hellmMsg() {
		int num = 200 + this.num;
		System.out.println("num: " + num);
	}
}
