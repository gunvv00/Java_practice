package practice;

public class middleTest3 {

	public static void main(String[] args) {

		int[] arr = new int[7];
		String hol = "";
		String jjak = "";
		
		System.out.println("ÀÓÀÇÀÇ ¼ö »ı¼º");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			int j = (arr.length-1) - i;
			
			if (i % 2 != 0) {
				hol += arr[i] + "\t";
			}
			if(j%2 == 0){
				jjak += arr[j]  + "\t";
			}
		}
		System.out.println("È¦¼ö ÀÎµ¦½º : " + hol);
		System.out.println("È¦¼ö ÀÎµ¦½º : " + jjak);
	}

}
