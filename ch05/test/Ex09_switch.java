package ch05.test;

import java.util.Scanner;

public class Ex09_switch {
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
			
			
			switch (num) {
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;

			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
				break;

			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scours[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
//				max(scores);
				int max = 0;
				for (int i : scores) {
					if (max < i) {	max = i;	}	}
				System.out.println("최고 점수는: " + max);
				
//				avr(scores);
				int sum = 0;
				double avr = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avr = (double) sum / scores.length;
				System.out.println("평균 점수: " + avr);
				
				break;
					
			case 5:
				run = false;
			}

		}
		System.out.println("End");
	}

//	public static void max(int[] arr) {
//	}

//	public static void avr(int[] arr) {
//	}
}
