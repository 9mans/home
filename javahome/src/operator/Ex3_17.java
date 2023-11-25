package operator;

public class Ex3_17 {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		
		int absX;
		int absY;
		int absZ;
		
		char signX;
		char signY;
		char signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		// 삼항 연산자는 (조건식)? x : y; <--- 삼항연산자는 앞에 조건식이 참이면 x를 거짓이면 y를 반환한다
		absX = (x > 0)? x : -x;
		absY = (y > 0)? y : -y;
		absZ = (z > 0)? z : -z;
		
		System.out.println(absX);
		System.out.println(absY);
		System.out.println(absZ);
	}
}
