package st02.ch01;

public class midTest {

	public static void main(String[] args) {
		int[][] dan = new int[8][9];

		for (int col = 1; col < 9; col++) {
			for (int row = 1; row < 10; row++) {
				int hap = col * row;
				System.out.print(hap);
			}
			System.out.println();
		}
	}

}
/*
 * 8 x 9 ������ �迭�� �����ϼ��� 
 * 8 x 9 ������ �迭�� �������� ������� �����ϼ���
 */