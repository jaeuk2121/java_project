package co.yedam.array;

import java.util.Scanner;

public class TodoApp {

	public static void main(String[] args) {
		//등록 /완료 /조회(날짜) /미완료
		//등록 1(순번) 할일 0812
		//완료 : 1 2 4 선택, 미완상태의 1,2,4,의 완료상태로 바꿔주면 됨 (불린써서)
		//조회(날짜): 0812/ 		1 2 4 3 6 5
		//미완료 : 
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1. 등록 2. 완료 3. 조회(날짜) 4. 미완료 5. 종료");
			System.out.print("선택 >> ");
            int menu = Integer.parseInt(scn.nextLine());
            
            switch(menu) {
            case 1:
            	
            case 2:
            	
            case 3:
            	
            case 4:
            	
            case 5:
            	
            }
		}
	}
	
	
	//버블정렬
	public static void sortSample() {
		int[] intAry = { 45, 23, 90, 77, 12 };
		int len = intAry.length-1;
		//for문에 중괄호가 없으면 가장 가까운 for문을 감싼다
		for(int j=0; j< 4; j++)
		for(int i=0;i<len; i++) {
			if(intAry[i] > intAry[i+1]) {
				int tmp = intAry[i];
				intAry[i] = intAry[i+1];
				intAry[i+1] = tmp;
			}
		}
		for(int num : intAry) {
			
			System.out.println(num);
		}
	}
}
