package javajungseok;

public class SplitExe {

	public static void main(String[] args) {
		String data = "È«±æµ¿;80;ÀÓ²©Á¤;75";
		
		String[] arr = data.split(";");
		
		System.out.println(arr[0] + " Á¡¼ö:" + arr[1]);
		System.out.println(arr[2] + " Á¡¼ö:" + arr[3]);

	}

}
