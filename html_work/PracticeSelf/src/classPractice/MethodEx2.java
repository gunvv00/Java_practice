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
		System.out.println("������ �ϳ��� �Է��Ͻÿ� : ");
		num = input.nextInt();
	}

	public void print() {
		result = num + rand;
		System.out.println("������ ���� ���� ���� : " + result);
	}

	public void guess() {
		boolean t = true;

		do {
			System.out.println("������ ���� ���� ���ÿ� : ");
			Scanner num = new Scanner(System.in);
			guessNumber = num.nextInt();
			if (rand == guessNumber) {
				System.out.println("�����Դϴ�.");
				t = false;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ� �ٽ� �Է��Ͻÿ�.");
			}
		} while (t);
	}
}