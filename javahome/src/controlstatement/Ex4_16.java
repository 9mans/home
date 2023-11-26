package controlstatement;

public class Ex4_16 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while (true) {
			if (sum > 100) { //if 는 제어문
				// while 이 반복문이라 while 을 벗어난다
				break;
				
			}
			sum += ++i;
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
