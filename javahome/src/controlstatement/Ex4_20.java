package controlstatement;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴 (1~3)를 선택하세요 종료는 0번");
			//메뉴를 선택한다
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp); // 내가 문자열로 숫자를 입력해서 입력한 문자열을 숫자로 바꿔준다
			
			if (menu == 0) { // 수자가 0이면 프로그램이 종료도ㅚ면서 반복문을 탈출  0이아니고 1~3이 아니면 잘못선택 컨티뉴
				System.out.println("프로그램 종료");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("잘못 선택하셨습니다");
				continue;
			}
			
			for (;;) { // for문에 초기 조건 증감식이 없어서 그냥 반복
				System.out.println("계산할 값을 입력하세요(계산종료 0, 전체종료 99");
				tmp = scanner.next(); // 계산할 값을 입력하고 그 값을 인트타입의 정수로바꾸ㅓ주기
				num = Integer.parseInt(tmp);
				
				if (num == 0) { //0번을 눌럿다면 포문이 종료 다시 바깥에서 시작
					break;
				} 
				
				if (num == 99) { // 99번을 누르면 outer라는 이름을 가진 while문이 종료
					break outer;
				}
				
				switch(menu) {// 1~3번을 선택했을때 값을 반환하는 제어문
				case 1: 
					System.out.println("result" + num*num);
					break;
				
				case 2: 
					System.out.println("result" + Math.sqrt(num));
					break;
				
				case 3: 
					System.out.println("result" + Math.log(num));
					break;
				}
			}
		}
	}
}
