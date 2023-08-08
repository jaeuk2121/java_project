package co.yedam.variable;

import java.io.IOException;

public class VariableExe4 {
	public static void main(String[] args) {
		// 이름은 홍길동 나이는 20살
		String name = "홍길동";
		int age = 20;
		double weight = 67.8;

		System.out.println("이름은 " + name + ", 나이는" + age + "살 입니다.");
		System.out.printf("이름은 %s, \n나이는 %d살, \t몸무게는 %.2f 입니다", name, age, weight);

		System.out.println("값을 입력>>>");
		try {
			while (true) {
				int result = System.in.read();
//				System.out.println("키코드 : " + result);
				if (result == 113) {
					break;
				} else if (result == 10 || result == 13) {
					// enter(cr : 13, if: 10)
				} else {
					System.out.println("키코드 : " + result);
					System.out.println("값을 입력>>>");
					// System.out.println("값을 입력>>>");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog. ");

	}// end of main
}// end of class.
