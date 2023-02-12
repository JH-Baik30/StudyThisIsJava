package ch05.test;

public class Ex08 {
	public static void main(String[] args) {
		int[][] arr = { 
			{ 95, 86 }, 
			{ 83, 92, 96 }, 
			{ 78, 83, 93, 87, 88 } };
		
		int sum = 0;
		double avr = 0;

		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				length ++;
				sum += arr[i][j];
			}
		}

		avr = (double) sum / length;
		System.out.println(sum);
		System.out.println(avr);
	}
	
}
