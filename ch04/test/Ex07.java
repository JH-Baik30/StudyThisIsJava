package ch04.test;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			
			int num = scanner.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("예금액");
				balance += scanner.nextInt();				
				break;
			case 2:
				System.out.println("출금액");
				if (scanner.nextInt() > balance) {
					System.out.println("잔고가 부족합니다.");
					break;
				} else {
					balance -= scanner.nextInt();
					break;
				}
			case 3:
				System.out.println("잔고");
				System.out.println(balance);				
				break;
			case 4:
				System.out.println("프로그램 종료");				
				break;

			}
		}
	}
}
