package ch05.test;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		boolean run = true;

		int[] scores = null;
		int studentNum = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int num = scanner.nextInt();

			if (num == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (num == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (num == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scours[" + i + "]: " + scores[i]);
				}
			} else if (num == 4) {
				max(scores);
				avr(scores);
			} else if (num == 5) {
				run = false;
			}

		}
		System.out.println("End");
	}

	public static void max(int[] arr) {
		int max = 0;
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println("최고 점수는: " + max);
	}

	public static void avr(int[] arr) {
		int sum = 0;
		double avr = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avr = (double) sum / arr.length;
		System.out.println("평균 점수: " + avr);
	}
}
