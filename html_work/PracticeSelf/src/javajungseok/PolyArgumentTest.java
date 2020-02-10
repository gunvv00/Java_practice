package javajungseok;

class Product {
	int price;
	int bounsPoint;

	Product(int price) {
		this.price = price;
		bounsPoint = (int) (price / 10.0);
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "AUDIO";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "COMPUTER";
	}
}

class Buyer {
	int money = 300;
	int bounsPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
		} else {
			money -= p.price;
			bounsPoint += p.bounsPoint;
			item[i++] = p;
			System.out.println(p + "을/를 구매하셨습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		System.out.println("현재 보너스 포인트는 " + bounsPoint + " 포인트 입니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("현재 내가 가진 돈은 " + b.money + "만원입니다.");
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.summary();

	}

}
