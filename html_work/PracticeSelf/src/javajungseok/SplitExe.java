package javajungseok;

public class SplitExe {

	public static void main(String[] args) {
		String data = "ȫ�浿;80;�Ӳ���;75";
		
		String[] arr = data.split(";");
		
		System.out.println(arr[0] + " ����:" + arr[1]);
		System.out.println(arr[2] + " ����:" + arr[3]);

	}

}
