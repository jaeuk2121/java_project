package co.yedam.array;

import java.util.Scanner;

public class TodoApp {

	public static void main(String[] args) {
		//등록 /완료 /조회(날짜) /미완료
		//등록 1(순번) 할일 0812
		//완료 : 1 2 4 선택, 미완상태의 1,2,4,의 완료상태로 바꿔주면 됨 (불린써서)
		//조회(날짜): 0812/ 		1 2 4 3 6 5
		//미완료 : 
		Todo[] todos = new Todo[10];//인스턴스
		int idx = 0;
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1. 등록 2. 완료 3. 조회(날짜) 4. 미완료 5. 종료");
			System.out.print("선택 >> ");
            int menu = Integer.parseInt(scn.nextLine());
            
            switch(menu) {
            case 1:
            	
            	System.out.println("할 일>>");
        		String todo = scn.nextLine();
        		Todo td = new Todo();
        		td.todo = todo;
        		
        		
        			if(todos[idx] == null ) {
        				todos[idx]= td;
        				todos[idx].done = false;
        				
        			}
        			idx++;
        			
        			
        		
        		System.out.println("OK");
        		break;
            	
            case 2:
            	
            	
            case 3:
            	int lnth = 0;
            	for (int i =0; i<todos.length -1; i++) {
            		if (todos[i] != null)
            			lnth++;
            	}
            	
            		for(int i =0; i < lnth -1; i++) {
            			Todo tmp = new Todo();
            			if(todos[i].no < todos[i+1].no) {
            				tmp = todos[i];
            				todos[i] =  todos[ i+1];
            				todos[ i +1 ]= tmp;		
            				
            			}
            		}
            				for( int i=0; i<todos.length; i++) {
        						if(todos[i] != null) {
        							System.out.printf("이름 : %s", todos[i].todo);
        							System.out.println();
        						}
            				}
            				break;
            	
            case 4:
            	for(int i = 0;i<todos.length;i++) {
            		if(!todos[i].done) {
            			System.out.println(todos[i].todo);
            		}
            	
            	}
            	break;
            	
            case 5:
            	run = false;
            }
            System.out.println("종료");
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
