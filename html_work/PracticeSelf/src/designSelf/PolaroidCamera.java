package designSelf;

public class PolaroidCamera extends Camera implements Printable {
	
	public PolaroidCamera(String name) {
		super(name);
	}
	
	public void print(Object image) {
		System.out.println("������ ���̿� ����մϴ�.");
		System.out.println(image);
		System.out.println("*������ ���̿� ��µǾ����ϴ�.");
	}

}