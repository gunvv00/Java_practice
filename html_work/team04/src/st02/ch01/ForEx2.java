package st02.ch01;

public class ForEx2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 11; i++) {
			if(i % 2 ==0) {
				sum += i;
			}else{continue;}
		}
		System.out.print("1~10의 숫자중 짝수의 합 : " + sum);


	}

}
