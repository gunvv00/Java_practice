package classPractice;

import java.util.*;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("국어,영어,수학 점수를 입력하시오");
		int kor = input.nextInt();
		int math = input.nextInt();
		int eng = input.nextInt();
		int totalScore = kor + math + eng;
		float avg = (float)totalScore / 3;
		char hak;
		
		System.out.println("총점은 : " + totalScore );
		System.out.println("평균은 : " + avg);

		if (avg >= 90) {
			hak = 'A';
		} else if (avg >= 80) {
			hak = 'B';
		} else if (avg >= 70) {
			hak = 'C';
		} else if (avg >= 60) {
			hak = 'D';
		} else {
			hak = 'F';
		}

		System.out.println("학점은 : " + hak);

	}

}
