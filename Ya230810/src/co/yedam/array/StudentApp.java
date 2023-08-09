package co.yedam.array;


import java.util.Scanner;


public class StudentApp {
	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int idx= 0; //이 변수를 사용하여 student[idx] 사용후 idx++
		
	
		
		
		students[0]= s1;
		students[1]= s2;
		
		
		char name;
		int score;
		
		
		
		//1. 등록 2.조회 3.목록
		//학생등록, 등록된 학생 1명 조회(이름,점수), 등록된 모든 학생 조회
		while(run) {
			
			System.out.printf("1. 등록 2. 조회 3. 목록 4. 종료");
			System.out.printf("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
				case 1://이름, 점수 등록
					Student s1 = new Student();
					name = (char) Integer.parseInt(scn.nextLine());
					score =Integer.parseInt(scn.nextLine());
				
					
					
					
					
					
					
					
					
					
				case 2://이름, 점수 조회
				
				case 3: //이름 점수 출력
				
				case 4: //종료 
					break;
			}
			break;
			
			}
		System.out.println("end");
		}
		
	}
