package controlstatement;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' '; 
		char opt = ' ';
		
		System.out.println("점수를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.println("당신의 점수는 " + score + " 입니다");
		
		if (score >= 90) {
			grade = 'a';
			if (score >= 95) {
				opt = '+';
			} else {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'b';
			if (score >= 85) {
				opt = '+';
			} else {
				opt = '-';
			}
		} else {
			grade = 'c';
		}
		
		System.out.println("당신의 학점은" + grade + opt);
	}
}
