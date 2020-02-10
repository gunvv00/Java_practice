package fucxIb;

class Me {
	int money;
	
	Me(){
		this.money = 5000;
	}
}

class Mart {
	int pear;
	Me pay = new Me();
	
	Mart() {
		this.pear = 2500;
	}
	
}

public class Shopping {
	public static void main(String[] args) {
		Me mon = new Me();
		Mart bae = new Mart();
		System.out.println("현재 나의 돈 : " + mon.money);
		System.out.println("나는 마트에 가서 " + mon.money + "을 주고" + bae.pear + "인 배를 사서 왔다");
		System.out.println("남은 돈은 : " + (mon.money - bae.pear));

	}
	
}
