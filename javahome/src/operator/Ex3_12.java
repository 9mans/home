package operator;

public class Ex3_12 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		// %는 나머지 연산자 몫을 제외한 나머지값을 반환합니다
		System.out.printf("몫은 %d 이고, 나머지는 %d입니다", x/y, x%y);
	}
}
