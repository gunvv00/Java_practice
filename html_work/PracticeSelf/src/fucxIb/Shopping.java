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
		System.out.println("���� ���� �� : " + mon.money);
		System.out.println("���� ��Ʈ�� ���� " + mon.money + "�� �ְ�" + bae.pear + "�� �踦 �缭 �Դ�");
		System.out.println("���� ���� : " + (mon.money - bae.pear));

	}
	
}