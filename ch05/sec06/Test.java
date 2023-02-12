package ch05.sec06;

public class Test {
	public static void main(String[] args) {
		makeIntArr(new int[] {10, 20, 30});
		makeDbArr(new double[] {.1, .2, .3});
		makeStrArr(new String[] {"1월", "2월", "3월"});
		
		
	}

	
	public static void makeIntArr(int[] arr) {
//		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: " + arr[i] + ", ");
		}
		System.out.println();
	}

	public static void makeDbArr(double[] ds) {
		for (int i = 0; i < ds.length; i++) {
			System.out.print("arr[" + i + "]: " + ds[i] + ", ");
		}
		System.out.println();
	}
	
	public static void makeStrArr(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			System.out.print("arr[" + i + "]: " + strArr[i] + ", ");
		}
		System.out.println();
	}
}
