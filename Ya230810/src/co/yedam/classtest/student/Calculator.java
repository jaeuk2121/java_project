package co.yedam.classtest.student;

public class Calculator {
	double p1 = 3.14; //인스턴스 멤버
	
	//인스턴스 멤버
	public double sum (double n1, double n2) {
		return n1+n2;
	}
	
	public double minus (double n1, double n2) {
		return n1-n2;
	}
	public static double multi(double n1, double n2) { //클래스가 메모리에 로딩될때 참조가능
		return n1 * n2;
	}
	
}
