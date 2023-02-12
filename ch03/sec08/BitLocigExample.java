package ch03.sec08;

public class BitLocigExample {
	public static void main(String[] args) {
		byte receiveData = -120;
		
		//1
		int unsignedInt1 = receiveData & 255;
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		
		System.out.println(unsignedInt1);
		System.out.println(unsignedInt2);
	}
}
