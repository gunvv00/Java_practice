package practice;
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUP() { ++channel; }
	void channelDown() { --channel; }
}


class TvTest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		
		t.color = "red";
		t.channel = 8;
		t.channelDown();
		
		System.out.println("Tv의 채널은 : " + t.channel + "\n" + "색깔은 : " + t.color );
	}

}
