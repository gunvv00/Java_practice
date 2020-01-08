package practice;

public class ArrayEx12 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i = 0; i < src.length(); i++ ) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch );
		}
		char[] chArr = src.toCharArray(); // String -> char[]로 변환하는 과정
		
		System.out.println(chArr);
		
	}

}
