package object;

public class Ex6_6 {

	public static void main(String[] args) {
	// 매개변수가 기본형이면 값을 변경할 수 없다	
		Data d = new Data();
		
		d.x = 10;
		System.out.println(d.x); //10
		
		change(d.x); // x =1000 , change x = 1000 
		System.out.println("After change(d.x)" );
		System.out.println("main() : x = " + d.x); // 10
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}


class Data {int x;}