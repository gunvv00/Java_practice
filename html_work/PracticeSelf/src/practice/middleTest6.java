package practice;

import java.util.*;

class middleTest6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" 3���� ���� �Է��Ͻÿ� : ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		middleTest6 tt = new middleTest6();
		
		tt.Max(x, y, z);
		tt.Min(x, y, z);

	}

	void Max(int x, int y, int z) {

		int tmp = 0;

		if (x >= y && x >= z) {
			tmp = x;
		} else if (y >= x && y >= z) {
			tmp = y;
		} else {
			tmp = z;
		}

		System.out.println("���� ū �� ��  :" + tmp); 

	}

	void Min(int x, int y, int z) {
		
		int tmp = 0;

		if (x <= y && x<= z) {
			tmp = x;
		} else if (y <= x && y <= z) {
			tmp = y;
		} else {
			tmp = z;
		}

		System.out.println("���� ���� ���� :" + tmp); 
		

	}
}