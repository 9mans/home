package operator;

public class Ex3_11 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		// Math.round 는 소수점 첫째자리에서 반올림 한 값을 반환한다
		// 1000을 곱하여 반올림의 위치를 바꿨다 3.141592 -> 3141.592 가 된 것이다
		// 반올림하면 3142가되고 다시 1000.0(실수형으로)의 값으로 나누면 3.142의 값이 나옴
		System.out.println(shortPi); 
	}
}
