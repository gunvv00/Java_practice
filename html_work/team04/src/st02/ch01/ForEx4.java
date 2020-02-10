package st02.ch01;

import java.util.*;

public class ForEx4 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] b = new int[4][2];
		int tmp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}
}