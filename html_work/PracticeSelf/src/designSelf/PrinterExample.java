package designSelf;

public class PrinterExample {

	public static void main(String[] args) {
		Printer[] printers = new Printer[3];

		printers[0] = new InkjetPrinter("101");
		printers[1] = new DotPrinter("101");
		printers[2] = new LaserPrinter("101");

		for (int i = 0; i < printers.length; i++) {
			if (printers[i].getID().equals("101")) {
				System.out.println("101 �����ʹ� �����ؾ� �մϴ� ���� �޼����� ����� �� �����ϴ�\n");
				continue;
			}

			printWelcome(printers[i]);

		}

	}

	public static void printWelcome(Printer printer) {
		System.out.println("�� �������� ID�� : " + printer.getID() + "�Դϴ�.");
		printer.print("�������� ���迡 �ʴ��մϴ�.");
		System.out.println("");
	}
}
