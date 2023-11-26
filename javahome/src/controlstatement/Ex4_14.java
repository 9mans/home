package controlstatement;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		
		num = Integer.parseInt(tmp); // 문자열 tmp를 숫자로 변환
		
		while (num != 0) {
			
			sum += num%10; //num을 10으로 나눈 나머지를 sum에 더함
			System.out.println("sum: " + sum + "num: " +num);
			
			num /= 10; // num에 10으로 나눈 값을 다시 저장
		}
		
		System.out.println("각자리수의 합" + sum);
	}
}
