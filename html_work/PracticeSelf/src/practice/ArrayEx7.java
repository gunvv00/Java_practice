package practice;

public class ArrayEx7 {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		for (int num = 0; num < numArr.length; num++) {
			numArr[num] = num;
			System.out.print(numArr[num]);
		}

		System.out.println();

		for (int mix = 0; mix < 10; mix++) {
			int random = (int) (Math.random() * 10);

			System.out.println(random);

			int tmp = numArr[0];
			numArr[0] = numArr[random];
			numArr[random] = tmp;

		}
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}

	}

}
