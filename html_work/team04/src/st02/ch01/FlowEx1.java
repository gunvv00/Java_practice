package st02.ch01;

import java.util.*;

public class FlowEx1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하시오 ");
		int score = input.nextInt();
		
		if(score >= 90) {
			System.out.print("A");
		}
		else if(score >= 80) {
			System.out.print("B");
		}
		else if(score >= 70) {
			System.out.print("C");
		}
		else {
			System.out.print("D");
		}

	}

}
