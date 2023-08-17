package co.yedam.array;

public class CalendarExe {
	public static void main(String[] args) {
		String[] days = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
	int month = 9;
	//달력. 31까지.
		int space = getFirstDay(month);
		for(int i= 0; i<days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		for(int i = 0; i< space ;i++) {
			System.out.printf("%4s", " ");
		}	
		for(int i = 1; i<= getLastDate(month);i++) {
			System.out.printf("%4d", i);
			//원리
			if((i+space)%7 == 0) {
				System.out.println();
			}
		}
	}
	//다음달의 1일구하기
	public static int getFirstDay(int month) {
		int day = 0;
		int totalDays =0;
		for (int i=1; i<= month; i++) {
			totalDays +=getLastDate(i);
		}
		day = (day + totalDays) %7;
		
		switch(month) {
		case 1:
			day =0;
			break;
		case 2:
			day =3;
			break;
		case 7:
			day = 6;
			break;
		case 8:
			day = 2;
			break;
		}
		return day;
	}
	
	
	public static int getLastDate(int month) {
		//1-31, 2-28,3-31, 4-30 5-31 6-30 7-31 8-31 9-30 10-31 11-30 12-31
		int LastDate= 0;
		
		switch(month) {
			
		case 1: case 3: case 5: case 7: case 8 : case 10 :case 12:
			LastDate =31;
			break;
		
			
			
		case 4: case 6: case 9:case 11:
			LastDate = 30;
				break;
		case 2:
			LastDate =29;
			break;
			
			
		}
		return LastDate;
		}
	}

