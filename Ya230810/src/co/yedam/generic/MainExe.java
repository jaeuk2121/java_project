package co.yedam.generic;

public class MainExe {
	Box box = new Box<String>();
	box.set("Hello");
	String result = box.get();
	
	Box<Integer> ibox = new Box<Integer>();
	ibox.set(10);
	Integer iresult = ibox.get();
	
}
