package operator;

public class Ex3_9 {

	public static void main(String[] args) {
		
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // 대입연산자는 왼쪽에서 오른쪽으로 진행된다는걸 생각해보자 a * b 의 값은 int기때문에 
						// int 인 상태로 c에 대입이 되어 값이 올바르게 나오지 않는다
		
		long d = (long)a * b;   
		System.out.println(c); //-1454759936 값이 출력된다
		System.out.println(d); // 2000000000000 이 출력된다
	}
}
