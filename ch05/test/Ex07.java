package ch05.test;

public class Ex07 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 8, 2 };

		int max = 0;

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
