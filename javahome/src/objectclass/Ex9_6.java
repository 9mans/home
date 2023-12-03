package objectclass;

public class Ex9_6 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("str1 == str2 ? "  + (str1 == str2));
		System.out.println(str1.equals(str2));
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc"); //new 연산자를 사용하여 만든 문자열은 서로 다른 주소를 가지고 있다
		
		System.out.println((str3 == str2));
		System.out.println(str3.equals(str4));
	}
}
