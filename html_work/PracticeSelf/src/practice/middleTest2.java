package practice;

import java.util.*;

public class middleTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("0보다 큰 정수를 입력하세요 : " );
		int num = input.nextInt();
		
		String a2 = Integer.toBinaryString(num);
		String a16 = Integer.toHexString(num);
		
		System.out.print("입력 받은 수 : " + num + "\n" + "2진수 >" + a2 + "\n" + "16진수> " + a16);
		


	}

}
