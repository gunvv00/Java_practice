package designSelf;

public class PhysicalCar implements Runnable {
	private String name;
	private int speed;
	private String direction;
	private boolean braking;
	private String color;
	
	public PhysicalCar(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void drive(int speed) {
		this.speed = speed;
	}
	
	public void stop() {
		brake();
		speed = 0;
		braking = false;
	}
	
	public void brake() {
		braking = true;
	}

}
