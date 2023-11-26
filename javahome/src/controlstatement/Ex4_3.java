package controlstatement;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 하나 입력하세요");
		int x = sc.nextInt();
		
		if (x == 0) {
			System.out.println("0입니다");
		} else {
			System.out.println("0이 아닙니다");
		}
		
	}
}
