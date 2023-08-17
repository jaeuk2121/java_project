package co.yedam.classtest.friend;

public class FriendMain {
	public static void main(String[] args) {
		//System.out.println(args[0] + args[1] + args.length);
		//FriendApp.start(); //정적메소드.
		
		FriendApp app = new FriendApp();
		app.start(); // 정적 -> 인스턴스메소드
	}
}
