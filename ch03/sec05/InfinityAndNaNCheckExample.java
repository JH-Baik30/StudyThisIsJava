package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 19;
		int y = 5;
		int z = x / 5;
//		double z = x / y;
//		double z = x % y;
		
//		System.out.println(z);
		System.out.println((double) 19/5);
		System.out.println(19/5);
		System.out.println((float)7/3);
		System.out.println((double)7/3);
	}
}
