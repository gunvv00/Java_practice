package practice;

public class Circle {
	final static double pi = 3.14;
	public static void main(String[] args) {
		
		System.out.println("radius = 5");
		System.out.println("반지름이 5인 원의 넓이와 둘레를 구하라");
		//Circle cc = new Circle();
		double width = CircleWidth(5);
		double dulrae = CircleDulrae(5);
		System.out.println("넓이 : " + width);
		System.out.println("둘레 : " + dulrae);

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
