package co.yedam.loop;

public class WhileExe {
	public static void main(String[] args) {
//		boolean run = true;
//		while(run) {
//			int tmp = (int) (Math.random()*100);
//			if(tmp > 90) {
//				//break;
//				run = false;
//			}
//			System.out.println(tmp);
//		}
//		System.out.println("end");
//		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		};
		
		int sum = 0;
		for(int i=1;i<=100;i++) {
		sum = sum+i;
		}
		System.out.println(sum);
		
		//3의배수 합
		sum= 0;
		for(int i=0;i<100; i++) {
			if(i%3 == 0) {
				sum= sum+i;
			}else {
				continue;
			}
			
		}
		System.out.println(sum);
		
		//주사위 합이 5
		int dice1 = 0;
		int dice2 = 0;
		int a = 0;
		
		while(dice1 + dice2 != 5) {
			dice1 = (int) ((Math.random()*6)+1);
			dice2 = (int) ((Math.random()*6)+1);
			a++;
		}
		System.out.println(a+ "번째 : " + dice1 + "," + dice2);
		
		
		String a1 ="";
		for(int i=1;i<=4;i++) {
			System.out.println(a1+="*");
		}
		a1="";
		
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4-i; j++) {
				System.out.printf(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
	}
}
