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
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			money -= p.price;
			bounsPoint += p.bounsPoint;
			item[i++] = p;
			System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
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
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("���� ���ʽ� ����Ʈ�� " + bounsPoint + " ����Ʈ �Դϴ�.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("���� ���� ���� ���� " + b.money + "�����Դϴ�.");
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.summary();

	}

}