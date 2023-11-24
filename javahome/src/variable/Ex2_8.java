package variable;

public class Ex2_8 {

	public static void main(String[] args) {
		// x 와 y의 값을 서로 바꾸려면 값을 임시로 저장할 수 있는 변수 하나가 더 필요하다
		int x = 10;
		int y = 5;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int tmp = x;	// 임시로 저장하는 변수 tmp에 x를 저장 x 와 tmp 둘다 10
		x = y;			// y의 값을 x에 저장 x =5
		y = tmp; 		// tmp의 값을 y에 저장 y = 10
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
