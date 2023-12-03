package object;

public class Ex7_10 {

	public static void main(String[] args) {
		
		Unit[] group = {new Marine(), new Tank(), new Dropshiop()};
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}

abstract class Unit {
	int x;
	int y;
	
	abstract void move (int x, int y);
	void stop() {}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("마린 이동 " + x + ", " + y);
	}
	
	void stimPack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("탱크 이동 " + x + ", " + y);
	}
	void mode() {}
}

class Dropshiop extends Unit {
	void move(int x, int y) {
		System.out.println("드랍십 이동 " + x + ", " + y);
	}
	void unload() {}
}