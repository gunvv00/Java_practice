package javajungsuk2;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx1 {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance(); //Calendar��ü�� new�� ����Ǿ� �־ getInstance()�� ���븸 ������ȴ�
		today.get(Calendar.YEAR); // �⵵
		today.get(Calendar.MONTH); // �� , MONTH�� 0~11�����̹Ƿ� 0�� 1�� 1�� 2���� �����Ѵ�
		today.get(Calendar.WEEK_OF_MONTH); // �̴��� �� ° ��
		today.get(Calendar.WEEK_OF_YEAR); // �� ���� �� ° ��
		today.get(Calendar.DATE); // �̴��� ����
		today.get(Calendar.DAY_OF_YEAR);
		today.get(Calendar.DAY_OF_WEEK);
		today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		today.getActualMaximum(Calendar.DATE); // �̴��� ��������
		
		
	}
}