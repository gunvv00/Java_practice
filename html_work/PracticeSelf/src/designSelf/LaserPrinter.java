package designSelf;

public class LaserPrinter extends Printer implements Printable {
	
	public LaserPrinter(String ID) {
		super(ID);
	}

	public void print(Object msg) {
		System.out.println("*������ ������� ����Ʈ�� �����մϴ�.");
		System.out.println(msg.toString());
		System.out.println("*������ ������� ����Ʈ�� �����մϴ�.");
	}

	
}