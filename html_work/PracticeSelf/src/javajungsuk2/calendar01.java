package javajungsuk2;

import java.util.Calendar;

public class calendar01 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar cur = Calendar.getInstance();
		
		now.set(2019, 3, 15);
		
		System.out.println(now.get(Calendar.YEAR) + "��" + now.get(Calendar.MONTH)+ "��" + now.get(Calendar.DATE)+ "��" );
		System.out.println(cur.get(Calendar.YEAR) + "��" + cur.get(Calendar.MONTH)+ "��" + cur.get(Calendar.DATE)+ "��" );
		
		if(now.after(cur)) {
			System.out.println("now cur �� ���� ��¥�Դϴ�.");
		}
	}

}