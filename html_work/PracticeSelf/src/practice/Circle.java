package practice;

public class Circle {
	final static double pi = 3.14;
	public static void main(String[] args) {
		
		System.out.println("radius = 5");
		System.out.println("�������� 5�� ���� ���̿� �ѷ��� ���϶�");
		//Circle cc = new Circle();
		double width = CircleWidth(5);
		double dulrae = CircleDulrae(5);
		System.out.println("���� : " + width);
		System.out.println("�ѷ� : " + dulrae);

	}

	static double CircleWidth(double radius) {
		double width = (radius * radius) * pi;
		
		return width;

	}
	
	static double CircleDulrae(double radius) {
		double dulrae = 2 * pi * radius;
		
		return dulrae;
		
	}
}