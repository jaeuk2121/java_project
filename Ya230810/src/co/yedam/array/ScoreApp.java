package co.yedam.array;

import java.util.Scanner;

public class ScoreApp {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("  1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>>");
			int slt = Integer.parseInt(scn.nextLine());
			
			if(slt == 1) {
				System.out.print("학생수>");
				studentNum =  Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			}else if(slt ==2) {
				
				for ( int i =0; i< scores.length;i++) {
					System.out.print("점수");
					
					scores[i] =Integer.parseInt(scn.nextLine()); 
				}
					

				
			}else if(slt ==3) {
				for( int i=0; i<scores.length; i++) {
					
						System.out.println(scores[i]);
					
					
				}
			}else if(slt ==4) {
				int sum = 0;
				double avg = 0;
				int max = 0;
				for(int i=0; i<scores.length;i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = sum/studentNum;
				
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
			}else if(slt ==5) {
				
				run = false;
			}
			
			
			
		}
		System.out.println("프로그램 종료");
	}
}
