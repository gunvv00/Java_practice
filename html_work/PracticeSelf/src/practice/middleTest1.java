package practice;

public class middleTest1 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int num = 1; num <= 1000; num++) {
			
			if(num % 2 == 0 && num % 7 == 00) {
				System.out.print(num + " ");
				sum =sum + num;
			}
			
		}System.out.println();
		System.out.print("1~1000���� 2�� ����̸鼭 7�� ����� ������ ���� : "+ sum);
		
	}

}