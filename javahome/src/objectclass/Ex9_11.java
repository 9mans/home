package objectclass;

public class Ex9_11 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2" + (sb == sb2)); // StringBuffer 클래스 안에는 equals 메서드를 오버라이딩하지 않아 올바른 값을 얻을 수 없다
		System.out.println("sb.equals(sb2)" + sb.equals(sb2));
		
		
		// StringBuffe 인스턴스에 담긴 문자열을 비교하기 위해서는 toString 메서드를 사용하여야 한다
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println(s.equals(s2));
	}
}
