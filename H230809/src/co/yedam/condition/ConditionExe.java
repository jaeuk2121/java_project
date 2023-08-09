package co.yedam.condition;

public class ConditionExe {
	public static void main(String[] args) {
		//임의의수
		//1은 가위 2 바위 3보
		int rsp;
		rsp = (int) (Math.random()*3)+1;
		String a = "";
		
		switch(rsp) {
		case 1:
			a= "가위";
			break;
		case 2:
			a= "바위";
			break;
		case 3:
			a= "보";
			break;
		}
		System.out.println(a);
		
		int num = 97;
		char chr = (char) ((Math.random() * 4) + 65);
		
		System.out.println(chr);
		System.out.println(chr == 'A');
		
		switch(chr) {
		case 'A' :System.out.println(chr + "는 VVIP혜택을 받으실 수 있습니다."); break;
			
		case 'B' :System.out.println(chr + "는 VIP혜택을 받으실 수 있습니다."); break;
			
		case 'C' :System.out.println(chr + "는 우수혜택을 받으실 수 있습니다."); break;
		
		case 'D' :System.out.println(chr + "는 일반혜택을 받으실 수 있습니다."); break;
		
		default : System.out.println(chr + "는 혜택이 없습니다");
		}
		
		
		
		
		
		
		
	}
}
