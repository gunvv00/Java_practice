package practice;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1~100사이의 수를 입력하시오 : ");
		
		int number = input.nextInt();
		boolean primeNumber = serchPrime(number);

		System.out.print(primeNumber);

	}

	static boolean serchPrime(int number) {

		boolean primeNumber = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				primeNumber = false;
			} else {
				break;
			}
		}
		return primeNumber;
	}

}
