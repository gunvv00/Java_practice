package classPractice;

import java.util.*;

public class MethodEx2 {
	public static void main(String[] args) {
		MathGame mg = new MathGame();
		mg.randomNumber();
		mg.myNumber();
		mg.print();
		mg.guess();
	}

}

class MathGame {
	int rand, guessNumber, num;
	int result;

	public void randomNumber() {
		rand = (int) (Math.random() * 100) + 1;
	}

	public void myNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 하나만 입력하시오 : ");
		num = input.nextInt();
	}

	public void print() {
		result = num + rand;
		System.out.println("임의의 수에 더한 값은 : " + result);
	}

	public void guess() {
		boolean t = true;

		do {
			System.out.println("임의의 수를 맞춰 보시오 : ");
			Scanner num = new Scanner(System.in);
			guessNumber = num.nextInt();
			if (rand == guessNumber) {
				System.out.println("정답입니다.");
				t = false;
			} else {
				System.out.println("틀렸습니다 다시 입력하시오.");
			}
		} while (t);
	}
}
