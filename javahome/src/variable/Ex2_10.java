package variable;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요ㅕ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //입력받은 문자열값 input을 int타입의 정수로 변환하는 메소드 Integer.parseInt()
		
		System.out.println("입력내용: " + input);
		System.out.printf("num=%d%n", num);
		
		sc.close();
	}
	
}
