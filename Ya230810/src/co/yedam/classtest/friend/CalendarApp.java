package co.yedam.classtest.friend;

import java.util.Calendar;

public class CalendarApp {
	public void showCalendar( int year, int month) {
		System.out.println("-----------" + year + "년 " + month +"월" + "-----------");
		Calendar cal = Calendar.getInstance();
		cal.set(year,  month -1, 1);
		
		String[] days = {"Sun","Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for (int i = 0; i< days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println("\n-------------------------------");
//	 Sun Mon Tue Wed Thr Fri Sat
//	       1   2   3   4   5   6
//	   7   8   9  10  11  12  13
//	  14  15  16  17  18  19  20
//	  21  22  23  24  25  26  27
//	  28  29  30
		
		//달력31까지
		int space = cal.get(Calendar.DAY_OF_WEEK) - 1; //1일의 요일정보 가져오기
		for (int i = 0; i<space; i++) {
			System.out.printf("%4s"," ");
		}
		//해당년월의 마지막날 계싼하기
		for(int i =1; i<=cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i);
			if((i+space)%7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
//		Calendar cal = Calendar.getInstance();
//		cal.set(2023, 2,3);
//System.out.println(cal.get(Calendar.YEAR));
//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//System.out.println(cal.getActualMaximum(Calendar.DATE));
		

	}
}
