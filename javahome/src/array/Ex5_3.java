package array;

public class Ex5_3 {

	public static void main(String[] args) {
		
		int[] score = {79, 77, 88, 40, 30, 100, 55, 70};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
