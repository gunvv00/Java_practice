package designSelf;

public class DotPrinter extends Printer implements Printable {
	
	public DotPrinter(String ID) {
		super(ID);
	}

	public void print(Object msg) {
		System.out.println("*��Ʈ ������� ����Ʈ�� �����մϴ�.");
		System.out.println(msg.toString());
		System.out.println("*��Ʈ ������� ����Ʈ�� �����մϴ�.");
	}


}