package variable;

public class Ex2_9 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23345657;
		
		// println은 변수의 값을 그대로 출력하지만 printf는 변수의 값을 바꾸지않고 출력하는 값을 다른 형태로 바꿀 수 있다
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);
		System.out.printf("[1234567890]%n");
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		
		
	}
}
