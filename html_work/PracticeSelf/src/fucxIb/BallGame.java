package fucxIb;

public class BallGame {
	public static void main(String[] args) {
		
		//int price = (int)(Math.random()*2);//이기고 지고 판단할 변수

		ChildBall child1 = new ChildBall();
		ChildBall child2 = new ChildBall();

		child1.setBall(15);
		child2.setBall(9);
	}
}

class ChildBall {
	private int ball;

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}
	
	public boolean playGame(boolean m) {
		boolean result;
		
		if(m == true) {
			result = true;
		}else {
			result = false;
		};
		return false;
	}
	public void printBallAmount() {
		
	}
	

}