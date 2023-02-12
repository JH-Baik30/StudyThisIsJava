package ch04.test;

public class Ex02 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = switch (grade) {
			case "A" -> score1 = 100;
			case "B" -> {
				int result = 100-20;
				yield result;
			}
			default -> score1 = 60;
		};
	}
}
