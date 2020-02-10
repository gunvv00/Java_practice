package designSelf;

public class PrinterExample3 {

	public static void main(String[] args) {
		
		Printable[] printableObjects = new Printable[4];
		
		printableObjects[0] = new InkjetPrinter("101");
		printableObjects[1] = new DotPrinter("102");
		printableObjects[2] = new LaserPrinter("103");
		printableObjects[3] = new PolaroidCamera("Panasonic 104");
		
		for(int i = 0; i < printableObjects.length; i++) {
			printWelcome(printableObjects[i]);		
		}
	}
	
	public static void printWelcome(Printable printableObject) {
		printableObject.print("무엇인가를 출력합니다.");
		System.out.println("");
	}

}

