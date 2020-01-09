package practice;

import java.util.*;
public class ArrayEx14 {

	public static void main(String[] args) {
		int [][] score = new int[5][3];
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int col = 0; col < score.length; col++) {
			System.out.print(col+1 + "\t");//번호 생성
			int sum = 0;
			double avg = 0;
			
			for(int row = 0; row < score[col].length; row++ ) {
				score[col][row] = (int)(Math.random()*100);//랜덤 점수 생성
				System.out.print(score[col][row] + "\t");// 점수 출력
				sum += score[col][row];
				avg = sum / 3;
			}
			System.out.print(sum + "\t");
			System.out.print(avg + "\t"
					+ "");
			System.out.println();
		}
	}

}
