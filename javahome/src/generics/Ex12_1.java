package generics;

import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}


public class Ex12_1 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
		productList.add(new Tv()); // 지네릭스의 타입변수는 직접적인 형변환이 불가능하여 객체에 자손클래스를 추가해주는 방식으로 저장한다
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
	}
	
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
	} 
}
