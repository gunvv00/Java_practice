package st02.ch01;

public class If08 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 7) +1;
		
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("월요일입니다.");
		}
		else if(num == 2) {
			System.out.println("화요일입니다");
		}
		else if(num == 3) {
			System.out.println("수요일입니다");
		}
		else if(num == 4) {
			System.out.println("목요일입니다");
		}
		else if(num == 5) {
			System.out.println("금요일입니다");
		}
		else if(num == 6) {
			System.out.println("토요일입니다");
		}
		else {
			System.out.println("일요일입니다");
		}
		

	}

}
