package overloading;

public class Ex6_12 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "auto", 2);
		
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		System.out.print(c2.color + c2.gearType + c2.door);
		
	}
}




class Car {
	
	String color;
	String gearType;
	int door;
	
	Car () {}
	Car (String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}