
package practice;

class tvv {
	String color;
	int channel;
	boolean power;

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	void power() {
		power = !power;
	}

}

class TvTest2 {
	public static void main(String[] args) {
		tvv[] tvArr = new tvv[3];

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new tvv();
			tvArr[i].channel = i + 10;
		}

	}
	

}
