package designSelf;

class InkjetPrinter extends Printer implements Printable {

	public InkjetPrinter(String ID) {
		super(ID);
	}

	public void print(Object msg) {
		System.out.println("*��ũ�� ������� ����Ʈ�� �����մϴ�.");
		System.out.println(msg.toString());
		System.out.println("*��ũ�� ������� ����Ʈ�� �����մϴ�.");
	}

}