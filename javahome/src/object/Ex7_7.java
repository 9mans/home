package object;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;
		fe2.water();
		
		
		
	}
}

class Car {
	String color;
	int door;
	
	void drive () {
		System.out.println("운전하는 기능");
	}
	
	void stop () {
		System.out.println("멈추는 기능");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("물을 뿌리는 기능");
	}
}
