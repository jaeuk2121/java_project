package co.yedam;

import java.util.Scanner;

/*
 * 은행app
 */
public class operatorExe2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int balance = 0; //10만원 이상 불가능, 마이너스 금액 불가.
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("선택>> ");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			if(menu == 1) {
				System.out.println("금액 입력>> ");
				//코드작성
				int val = Integer.parseInt(scn.nextLine());
			    if(balance+val >= 100000) {
			    	System.out.println("불가합니다");
			    }else {
			    	balance= balance + val;
			    }
			    System.out.println("통장 잔고: " + balance);
				
			}else if (menu == 2) {
				System.out.print("출금액 입력>> ");
				balance = balance - val;
				System.out.println("통장 잔고: " + balance);
				
			}else if (menu == 3) {
				System.out.println("잔고 : " + balance);
			}else if (menu == 4) {
				System.out.print(" 종료 ");
				break;
			}
			
			
		}
		System.out.println("end of prog.");
	}
}
