package controlstatement;

public class Ex4_17 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			if(i%3 == 0) {
				continue;   // i를 3으로 나눈 후 나머지값이 0일때 컨티뉴
			}
		System.out.println(i);
		}
		
	}
}
