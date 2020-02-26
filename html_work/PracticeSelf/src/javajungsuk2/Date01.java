package javajungsuk2;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		System.out.println(now.getDate());
		
		
		Date curDate = new Date(119, 1, 21);
		
		System.out.println(curDate.getYear());
		System.out.println(curDate.getMonth());
		System.out.println(curDate.getDate());
		
		Calendar cal = Calendar.getInstance();
		Date date1 = new Date(cal.getTimeInMillis());//calendar로 만든후 date로 받아올때
		
		Calendar cal2 = Calendar.getInstance();
		Date date2 = new Date();
		cal2.setTime(date2); // 반대의 경우
		
		
	}

}
