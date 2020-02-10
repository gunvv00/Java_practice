package designSelf;

public class Car {
	private String name;
	private int speed;
	private String direction;
	private boolean braking;
	private String color;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
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
	
	public String toString() {
		return this.name + this.color + this.speed;
	}

}


