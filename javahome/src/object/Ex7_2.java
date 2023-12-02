package object;

public class Ex7_2 {

	public static void main(String[] args) {
		child c = new child();
		c.method();
	}
}

class parent {
	int x = 10;
}

class child extends parent {
	
	int x = 20;
	void method() { // this오ㅏ 슈퍼는 자신과 상속받은 부모클래스의 변수가 이름이 동일할때 사용된다
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}