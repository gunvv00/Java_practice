package st02.ch01;

import java.util.*;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gob = 0;
		
		System.out.println("구구단 출력할 단 입력 : " );
		int x = input.nextInt();
		
		for(int i = 1; i < 10; i++ ) {
			gob = (x * i);
			System.out.print(gob + "\t");
		}

	}

}
