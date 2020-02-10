package designSelf;

public class Dog implements Runnable {
	private int speed;
	private boolean braking;
	
	private String name;
	
	public String bark() {
		return "¿ù¿ù";
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