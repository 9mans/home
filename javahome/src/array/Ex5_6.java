package array;

import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		
		String[] names = {"kim", "park", "lee"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + names[i]);
		}
		String tmp = names[2]; 
		System.out.println(tmp);
		names[0] = "yu";
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.print(Arrays.toString(names));
	}
}
