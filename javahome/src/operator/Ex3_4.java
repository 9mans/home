package operator;

public class Ex3_4 {

	public static void main(String[] args) {
		
		int i = -10;
		i = +i;
		System.out.println(i);
		// 부호 연산자 - 수학에 음수와 같은 원리 - + 가 만나면 -  / - 와 - 가 만나면 +
		i = -10;
		i = -i;
		System.out.println(i);
	}
}
