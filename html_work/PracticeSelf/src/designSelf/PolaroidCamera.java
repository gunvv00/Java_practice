package designSelf;

public class PolaroidCamera extends Camera implements Printable {
	
	public PolaroidCamera(String name) {
		super(name);
	}
	
	public void print(Object image) {
		System.out.println("사진을 종이에 출력합니다.");
		System.out.println(image);
		System.out.println("*사진이 종이에 출력되었습니다.");
	}

}
