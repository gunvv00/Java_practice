package practice;

public class ArrayEx13 {

	public static void main(String[] args) {
		
		int[][] score = new int[5][5];
		int count = 1;
		for(int i = 0; i < score.length; i ++) {
			for(int j = 0; j < score[i].length; j ++, count++ ) {
				score[i][j] = count;
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.println();
		}
		
	}

}
