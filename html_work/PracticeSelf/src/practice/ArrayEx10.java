package practice;

public class ArrayEx10 {

	public static void main(String[] args) {
		String[] names = {"kim" , "su" , "moon" };
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"]ÀÇ °ªÀº " + names[i]);
		}
		String tmp = names[2];
		System.out.println("tmp =" + tmp );
		names[0] = "park";
		
		for(String str : names) {
			System.out.println(str);
		}

	}

}
