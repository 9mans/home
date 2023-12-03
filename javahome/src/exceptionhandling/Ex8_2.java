package exceptionhandling;

public class Ex8_2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(0/0); // 예외가 발생하는 순간 바로 캐치블록으로 넘어간다
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println(3);
		} 
		System.out.println(4);
	}
}
