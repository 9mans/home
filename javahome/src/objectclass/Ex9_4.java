package objectclass;

public class Ex9_4 {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.err.println(c2.toString()); 
		// toString 메소드는 오버라이딩 하지 않으면 16진수 해시코드를 얻는다
	}
}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}