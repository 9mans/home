package object;

class Data2 {int x;}

public class Ex6_7 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(Data2 d) {  //체인지 메소드의 매개변수가 참조형이라 값을 바꾼게아닌 주소값을 넘겨주었기때문에 값을 읽는것과 변경이 가능했다
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
