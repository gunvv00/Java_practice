package practice;

import java.util.*;

public class middleTest2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("0���� ū ������ �Է��ϼ��� : " );
		int num = input.nextInt();
		
		String a2 = Integer.toBinaryString(num);
		String a16 = Integer.toHexString(num);
		
		System.out.print("�Է� ���� �� : " + num + "\n" + "2���� >" + a2 + "\n" + "16����> " + a16);
		


	}

}