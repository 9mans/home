package array;

public class Ex5_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0F;
		
		int[] score = {100, 20, 30, 50, 80};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum/(float)score.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + average);
	}
}
