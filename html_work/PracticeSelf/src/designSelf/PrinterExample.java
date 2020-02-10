package designSelf;

public class PrinterExample {

	public static void main(String[] args) {
		Printer[] printers = new Printer[3];

		printers[0] = new InkjetPrinter("101");
		printers[1] = new DotPrinter("101");
		printers[2] = new LaserPrinter("101");

		for (int i = 0; i < printers.length; i++) {
			if (printers[i].getID().equals("101")) {
				System.out.println("101 프린터는 수리해야 합니다 따라서 메세지를 출력할 수 없습니다\n");
				continue;
			}

			printWelcome(printers[i]);

		}

	}

	public static void printWelcome(Printer printer) {
		System.out.println("이 프린터의 ID는 : " + printer.getID() + "입니다.");
		printer.print("프린터의 세계에 초대합니다.");
		System.out.println("");
	}
}

