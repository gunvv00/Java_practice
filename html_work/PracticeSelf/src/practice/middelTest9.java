package practice;

public class middelTest9 {
	public static void main(String[] args) {

		for (int col = 2; col < 10; col+=2) {
			for (int row = 1; row <= col; row++) {
				int sum = col * row;
				System.out.print(col + "x" + row + "=" + sum + "\t");
			}
			System.out.println();
		}
	}
}
