package practice;

public class Practice01 {
	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
			System.out.println(arr[i]);
		}

		System.out.println();
		int[] tmp = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {

			tmp[i] = arr[i];
//			arr = tmp;
			System.out.println(tmp[i]);

		}
		for (int i = arr.length; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}

	}
}
