package designSelf;

public class LaserPrinter extends Printer implements Printable {
	
	public LaserPrinter(String ID) {
		super(ID);
	}

	public void print(Object msg) {
		System.out.println("*레이저 방식으로 프린트를 시작합니다.");
		System.out.println(msg.toString());
		System.out.println("*레이저 방식으로 프린트를 종료합니다.");
	}

	
}
