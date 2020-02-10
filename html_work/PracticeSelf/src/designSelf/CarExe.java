package designSelf;

public class CarExe {

	public static void main(String[] args) {
		Car car = new Car("내 차 " , "까만색",120);
		System.out.println(car);
		car.stop();
		System.out.println(car);

	}

}
