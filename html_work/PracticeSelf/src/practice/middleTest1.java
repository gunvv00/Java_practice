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
		System.out.print("1~1000까지 2의 배수이면서 7의 배수인 수들의 합은 : "+ sum);
		
	}

}
