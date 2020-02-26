package javajungsuk2;

import java.util.Calendar;

public class calendar01 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar cur = Calendar.getInstance();
		
		now.set(2019, 3, 15);
		
		System.out.println(now.get(Calendar.YEAR) + "년" + now.get(Calendar.MONTH)+ "월" + now.get(Calendar.DATE)+ "일" );
		System.out.println(cur.get(Calendar.YEAR) + "년" + cur.get(Calendar.MONTH)+ "월" + cur.get(Calendar.DATE)+ "일" );
		
		if(now.after(cur)) {
			System.out.println("now cur 의 이후 날짜입니다.");
		}
	}

}
