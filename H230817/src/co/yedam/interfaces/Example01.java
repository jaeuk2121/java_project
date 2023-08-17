package co.yedam.interfaces;

public class Example01 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5]; //2차원배열 intAry[0]
		
		//System.out.println(intAry[2][2]);1
		
		int no = 1;
		for(int r = 0 ; r <5; r++) {
			for(int c = 0; c<5; c++) {
				intAry[r][c] = no;
				System.out.printf("%3s", intAry[r][c]);
				no++;
			}
			System.out.println();
		}
		//1 2 3 4 5
		//6 7 8 9 10
		//11 12 13 14 15
		
		System.out.println();
		no = 1;
		for(int r = 0 ; r <5; r++) {
			for(int c = 0; c<5; c++) {
				intAry[r][c] = no;
				no= no+5;
				if(intAry[r][c]>=16 && intAry[r][c]<=20 ) {
					
				}
				System.out.printf("%8s", intAry[r][c]);
			}
			no= no-24; 
			System.out.println();
		}
		System.out.println();
		for(int r = 4 ; r >=0; r--) {
			for(int c = 0; c<5; c++) {
					
				System.out.printf("%8s", intAry[c][r]);
				
			}
			System.out.println();
		}
			}
		
	}

