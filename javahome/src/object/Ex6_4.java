package object;

public class Ex6_4 {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long result1 = mm.add(3L, 5L);
		long result2 = mm.multiply(3L, 5L);
		long result3 = mm.subtract(3L, 5L);
		double result4 = mm.divide(3.0, 5.0);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
}





class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	}
	long multiply(long a, long b) {
		long result = a * b;
		return result;
	}
	double divide(double a, double b) {
		double result = a / b;
		return result;
	}
}