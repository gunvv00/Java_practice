package javajungsuk2;

import java.util.Calendar;

public class CalendarEx3 {

	public static void main(String[] args) {
		
		final int [] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.HOUR_OF_DAY, 30);
		time2.set(Calendar.HOUR_OF_DAY, 10);
		
		System.out.println("time1 :" + time1.get(Calendar.HOUR_OF_DAY) + "시" + time1.get(Calendar.MINUTE) + "분"+time1.get(Calendar.SECOND)+ "분");
		System.out.println("time1 :" + time2.get(Calendar.HOUR_OF_DAY) + "시" + time2.get(Calendar.MINUTE) + "분"+time2.get(Calendar.SECOND)+ "분");

	}

}
