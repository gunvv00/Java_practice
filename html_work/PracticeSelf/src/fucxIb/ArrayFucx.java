package fucxIb;

public class ArrayFucx {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4   }, 
				    {   5, 6, 7, 8 } };
		int[][] b = new int[4][2];
		int tmp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
				System.out.print(b[j][i]);
			}System.out.println();
		}

	}

}