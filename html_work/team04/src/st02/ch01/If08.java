package st02.ch01;

public class If08 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 7) +1;
		
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("�������Դϴ�.");
		}
		else if(num == 2) {
			System.out.println("ȭ�����Դϴ�");
		}
		else if(num == 3) {
			System.out.println("�������Դϴ�");
		}
		else if(num == 4) {
			System.out.println("������Դϴ�");
		}
		else if(num == 5) {
			System.out.println("�ݿ����Դϴ�");
		}
		else if(num == 6) {
			System.out.println("������Դϴ�");
		}
		else {
			System.out.println("�Ͽ����Դϴ�");
		}
		

	}

}