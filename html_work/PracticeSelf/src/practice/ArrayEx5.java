package practice;

public class ArrayEx5 {
	public static void main(String[] args) {
		
		int sum = 0;
		float avg = 0;
		
		int[] score = {100,96,70,100,80};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = (float)sum / score.length;
		
		System.out.println("sum ���� :" + sum );
		System.out.println("avg ���� :" + avg );
		
		
	}
}
