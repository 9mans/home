package objectclass;

public class Ex9_5 {

	public static void main(String[] args) {
		
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("Heart", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

