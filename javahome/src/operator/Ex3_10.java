package operator;

public class Ex3_10 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000; 
		// a 의 타입은 long 이지만 오른쪽항의 결과값은 int 다 
		
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println(a);
		System.out.println(b);
	}
}
