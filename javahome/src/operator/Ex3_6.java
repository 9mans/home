package operator;

public class Ex3_6 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		// 정수의 값을 0으로 나누면 에러발생
		// int타입의 정수 두개를 나눌때는 소수점의 값을 저장하지 못하므로 소수점을 제외한 값이 나온다
		// 올바른 연산결과를 얻기 위해서는 두 피연산자중에 한쪽을 실수형으로 형변환해야 자동 형변환되어 올바른 실수형의 값을 얻는다
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
	}
}
