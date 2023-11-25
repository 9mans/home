package operator;

public class Ex3_2 {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;
		
		j = i++; // 후위형 증감 연산자는 값을 출력한 이후에 1이 증가한다
		System.out.println("j = i++; 실행 후 i = " + i +", j = " + j);
								//j = i++ 이 실행이 되면 j = 5가된 후 i가 1이증가하여 6
		i = 5;    
		j = 0;
							
		j = ++i; // 전위형 연산자이기때문에 i의 값이 증가한 후에 j에 대입된다 j = 6 i = 6
		
		System.out.println("j = i++; 실행후, " + i + ", j = " + j);
	}
}
