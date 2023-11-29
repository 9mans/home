package object;

public class Ex6_3 {

	public static void main(String[] args) {
	
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.weight = " + Card.weight);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "space";
		c2.number = 10;
		
		System.out.println("c1 은" + c1.kind + ", " + c1.number + " 이며 크기는" + c1.width + " , " + c1.weight);
		System.out.println("c2 은" + c2.kind + ", " + c2.number + " 이며 크기는" + c2.width + " , " + c2.weight);
		
		c1.width = 50;
		c1.weight = 100;
		// c1의 길이와 넓이의 값을 변경했지만 길이와 넓이는 클래스 변수 static 이기때문에 모두 같은 값을 같는다 
		System.out.println(c2.weight + ","+ c2.width);
		
	}
	
}
	
	class Card {
		String kind;
		int number;
		static int width = 100;
		static int weight = 250;
	}

