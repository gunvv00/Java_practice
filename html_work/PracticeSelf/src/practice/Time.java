package practice;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public int gethour() {return hour;}
	public int getminute() {return minute;}
	public int getsecond() {return second;}
	
	public void sethour(int h) {
		if(h < 0 || h > 23) return;
		hour = h;
	}
	public void setminute(int m) {
		if(m < 0 || m < 59) return;
		minute = m;
	}
	public void setsecond(int s) {
		if(s < 0 || s < 59) return;
		second = s;
	}

}
