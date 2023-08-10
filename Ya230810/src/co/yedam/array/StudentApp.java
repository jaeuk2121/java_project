package co.yedam.array;


import java.util.Scanner;


public class StudentApp {
	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int idx= 0; //이 변수를 사용하여 student[idx] 사용후 idx++
	
		
//		//초기값
		Student s1 =new Student();
		s1.name = "홍길동";
		s1.score = 85;
		s1.height = 178.9;
		s1.gender = Gender.MEN;
		
		Student s2 =new Student();
		s1.name = "김길동";
		s1.score = 92;
		s1.height = 170.9;
		s1.gender = Gender.MEN;
		
		students[0] =s1;
		students[1] =s2;
		
		
		//1. 등록 2.조회 3.목록
		//학생등록, 등록된 학생 1명 조회(이름,점수), 등록된 모든 학생 조회
		while(run) {
			
			System.out.printf("1. 등록 2. 조회 3. 목록 4. 키큰학생 5. 종료");
			System.out.printf("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
				case 1://이름, 점수, 키 등록
					Student s = new Student();//인스턴스
					System.out.println("이름");
					s1.name = scn.nextLine();
					System.out.println("점수");
					s1.score =Integer.parseInt(scn.nextLine()); //integer은 "123"문자인 숫자를 숫자타입으로 변경시켜줌
					//Double.parseDouble(178.9)
					System.out.println("키");
					s1.height =Double.parseDouble(scn.nextLine());
					students[idx] = s1;
					idx++;
					break;
					
				case 2://이름, 점수 조회
					boolean Exist = false; //boolean 선언이유
					System.out.println("이름");
					String name = scn.nextLine();
					for( int i=0; i<students.length; i++) {
						if(students[i] != null &&  students[i].name.equals(name)) {//&& and
							
							System.out.printf("%s의 점수: %d, 키: %-10.2f\n", students[i].name, students[i].score, students[i].height);
							Exist = true;
						}
						break;
					}
					if(!Exist) {
						System.out.println("입력하신 이름이 존재하지않습니다.");
						}
					
					break;
				case 3: //이름 점수 출력
					for( int i=0; i<students.length; i++) {
						if(students[i] != null &&
								students[i].gender == Gender.MEN) {
							System.out.printf("이름 : %s, 점수 %d, 키%-10.2f\n", students[i].name, students[i].score, students[i].height);
						
						}
					}
					break;
				case 4: //키큰학생
					Student max = new Student();
							for( int i=0; i<students.length; i++) {
								if(students[i] != null) {
									if(max.height < students[i].height) {
										max = students[i];
									}
								}
							}
							System.out.printf("이름 : %s, 키 %f\n", max.name, max.height);
							break;
				case 5: run = false;
			}
			
			
			}
		System.out.println("end");
		}
		
	}
