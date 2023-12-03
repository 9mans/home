package exceptionhandling;

public class Ex8_6 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("asd");
			throw e; 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
