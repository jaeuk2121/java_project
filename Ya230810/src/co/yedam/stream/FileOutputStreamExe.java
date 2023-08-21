package co.yedam.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExe {

public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("C:/Temp/out.data");
		fos.write(100);
		fos.write(200);
		fos.write(257); //2 4 8 16 32 64 128 256 
		//0~ 255
		
		fos.flush(); //버퍼의 캐시값을 비움.
		fos.close();//리소드 환원.
		
		FileInputStream fis=//
				new FileInputStream("C:/Temp/out.data");
		
		
		while(true) {
			int val = fis.read();
			if(val == -1) {
				break;
			}
			System.out.println(val);
			
		}
		fis.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("end");
}
}
