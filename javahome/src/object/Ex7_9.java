package object;

public class Ex7_9 {

	public static void main(String[] args) {
		
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv3());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}

class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10);
	}
	Product2() {}
}

class Tv3 extends Product2 {
	Tv3() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}
	public String toString() {
		return "computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println(" 잔액부족 ");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "구입");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i]+ " , ";
		}
		System.out.println(sum);
		System.out.println(itemList);
	}
	
	

	
}
