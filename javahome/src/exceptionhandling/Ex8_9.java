package exceptionhandling;

public class Ex8_9 {

	public static void main(String[] args) throws Exception {
		
		 method1(); 
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}
// 예외는 떠넘기다 결국 try로 처리해ㅑ줘야한다
