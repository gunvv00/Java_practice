package designSelf;

import java.util.Date;

class Customer {
	Order[] order;
	
	String name;
	String address;
}

class Order {
	Customer customer;
	Payment[] payment;
	OrderDetail[] lineItems;
	
	Date date;
	String status;
	
	Order(Customer customer, Payment[] patyment, OrderDetail[] lineItems) {
		this.customer = customer;
		this.payment = patyment;
		this.lineItems = lineItems;
	}
	
	double calcTax() {
		return 0;
	}
	
	double calcTotal() {
		double sum = 0;
		
		for(int i = 0; i < lineItems.length; i++) {
			sum += lineItems[i].calcSubTotal();
			

		}	
		return sum;
	}
	
	double calcTotalWeight() {
		double sum = 0;
		
		for(int i = 0; i < lineItems.length; i++) {
			sum += lineItems[i].calcWeight();

		}
		return sum;
	}

}


abstract class Payment {
	double amount;
	
	abstract boolean authorized();
}

class Credit extends Payment {
	String number;
	String type;
	Date expDate;
	
	boolean authorized() {
		return true;
	}
}


class Cash extends Payment {
	double cashTendered;
	
	boolean authorized() {
		return true;
	}
}

class Check extends Payment {
	String name;
	String bankID;
	
	boolean authorized() {
		return true;
	}
}

class OrderDetail {
	Item item;
	
	int quantity;
	int taxStatus;
	
	OrderDetail(Item item) {
		this.item = item;
	}
	
	double calcSubTotal() {
		return quantity * item.getPriceForQuantity();
	}
	
	double calcWeight() {
		return quantity * item.getWeight();
	}
}

class Item {
	double shippingWeight;
	String description;
	
	double getPriceForQuantity() {
		return 0;
	}
	
	double getWeight() {
		return shippingWeight;
	}
}












