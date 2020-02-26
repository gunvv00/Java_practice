package javajungsuk2;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx1 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); //Calendar객체는 new가 내장되어 있어서 getInstance()로 내용만 빼오면된다
		today.get(Calendar.YEAR); // 년도
		today.get(Calendar.MONTH); // 달 , MONTH는 0~11까지이므로 0이 1월 1이 2월로 봐야한다
		today.get(Calendar.WEEK_OF_MONTH); // 이달의 몇 째 주
		today.get(Calendar.WEEK_OF_YEAR); // 이 해의 몇 째 주
		today.get(Calendar.DATE); // 이달의 몇일
		today.get(Calendar.DAY_OF_YEAR);
		today.get(Calendar.DAY_OF_WEEK);
		today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		today.getActualMaximum(Calendar.DATE); // 이달의 마지막날
		
		
	}
}
