package object;

public class Ex7_13 {

	class InstanceInner {}
	static class StaticInner {}
	
	// 인스턴스 멤버 간에는 서로 직접 접근이 가능하다
	InstanceInner iv = new InstanceInner();
	// static 멤버간에는 서로 직접 접근이 가능하다
	static StaticInner cv = new StaticInner();
	
	
	static void staticMethod() {
		
		// 스태틱 멤버는 인스턴스 멤버에 접근할 수 없다
		// 스태틱 멤버만 접근 가능하다
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod() {
		
		// 인스턴스 메서드에서는 인스턴스 멤버와 스태틱멤버 모두 접근 가능하다
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
//		LocalIneer lv = new LocalInner(); 메서드 내에 지역클래스로 선언된 클래스는 외부에서 접근할수 없다
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
