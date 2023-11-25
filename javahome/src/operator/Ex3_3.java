package operator;

public class Ex3_3 {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 5;
		
		System.out.println(i++); // 후위형 증감연산자 값을 출력 후 1증가
		System.out.println(++j); // 전위형 증감연산자 값이 증가한 후 출력
		System.out.println("i = " + i + ", j = " + j);
	}
}
