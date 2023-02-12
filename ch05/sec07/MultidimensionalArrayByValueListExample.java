package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores = {
			{80, 90, 96},
			{76, 88}
		};
		
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//class1 average
		int class1sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1sum += scores[0][i];
		}
		double class1avg = (double)class1sum / scores[0].length;
		System.out.println("class1 average" + class1avg);
		
		//class2 average
		int class2sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2sum += scores[1][i];
		}
		double class2avg = (double)class2sum / scores[1].length;
		System.out.println("class2 average" + class2avg);
		
		//total student average
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("Total Students Average: " +  totalAvg);
		
		
		
		
		
	}
}
