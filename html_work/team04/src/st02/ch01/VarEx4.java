package st02.ch01;

import java.util.Scanner;

public class VarEx4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하시오 : ");
		String name = scanner.nextLine();

		System.out.println("국어 점수를 입력 하시오 :");
		int kor = scanner.nextInt();

		System.out.println("수학 점수를 입력 하시오 : ");
		int math = scanner.nextInt();

		int sum = kor + math;
		double avg = (double) sum / 2;

		System.out.println("이름:" + name + "\n" + "총점:" + sum + "\n" + "평균:" + avg);
	}

}
