package practice;

public class middleTest4 {

	public static void main(String[] args) {
		int[][] dan = new int[8][9];

		for (int col = 0; col < 9; col++)  {
			for (int row = 0; row < 8 ; row++) {
				int hap = (row+2) * (col+1); 
				dan[row][col] = hap;
				System.out.print(dan[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
/*
 * 8 x 9 ������ �迭�� �����ϼ��� 
 * 8 x 9 ������ �迭�� �������� ������� �����ϼ���
 */