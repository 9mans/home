package object;

public class Ex6_2 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 채널" + t1.channel + "입니다");
		System.out.println("t2 채널" + t2.channel + "입니다");
		
		t1.channel = 7;
		System.out.println("t1 채널" + t1.channel + "로 변경했습니다");
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}
}
