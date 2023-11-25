package operator;

public class Ex3_14 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
		System.out.printf(" str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
		System.out.println(str1.equals("abc"));
		System.out.println(str2.equals("abc"));
		System.out.println(str1.equals("ABC"));
		// 대소비교연산자는 boolean을 제외한 기본형에만 사용가능하고
		// 등가비교연산자는 기본형과 참조형에 모두 사용할 수 있지만 참조형의 등가비교연산자는 객체의
		// 주소값이 같은지를 비교하기때문에 문자열의 등가비교는 .equals() 메소드를 사용해야한다
		// 대소문자를 구분하지만 구분하고 싶지 않다면 .equalsIgnoreCase()메소드를 사용하면 된다
		
	}
}
