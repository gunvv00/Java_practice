package practice;

public class ArrayEx14 {

	public static void main(String[] args) {
		int[][] score = new int[5][3];

		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("==============================================");

		for (int col = 0; col < score.length; col++) {
			
			int sum = 0;
			double avg = 0;
			
			System.out.print(col + 1 + "\t");
			
			for (int row = 0; row < score[col].length; row++) {

				score[col][row] = (int) (Math.random() * 100);
				sum += score[col][row];
				avg += (double) score[col][row] / 3;

				System.out.print(score[col][row] + "\t");

			}
			System.out.print(sum + "\t");
			System.out.print(avg + "\t\n");

		}
	}

}