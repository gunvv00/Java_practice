package practice;

public class ArrayEx6 {

	public static void main(String[] args) {
		int score[] = {90,50,55,70,100};
		
		int max = score[0];
		int min = score[0];

		for(int i = 1; i < score.length; i++) {
			if(score[i] > max)
				max = score[i];
			else if(score[i] < min)
				min = score[i];
		}
		System.out.println("최소값은 : " + min);
		System.out.println("최대값은 : " + max);
	}

}
