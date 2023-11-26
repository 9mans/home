package controlstatement;

public class Ex4_10 {

	public static void main(String[] args) {
		
		int sum = 0; //합계를 저장하기 위한 변수
		
		for (int i = 1; i <= 5; i++) {
			sum += i; // for 문이 실행될 때 마다 i의 값은 증가하고 값이 sum에 게속 더해진다 
			System.out.println(sum);
		}
	}
}
