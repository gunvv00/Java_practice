package practice;

public class middleTest5 {

	public static void main(String[] args) {

		System.out.println("���� �Է�>");
		float[] score = new float[7];
		
		for(int total = 0; total <score.length-2; total++) {
			score[total] = (int)(Math.random()*100) +1;
			score[5] += score[total];
			System.out.println(score[total]);
		}
		score[6] = score[5] / 5
				;
		System.out.println("���� : " + score[5]);
		System.out.print("��� : " + score[6]);
	}

}
