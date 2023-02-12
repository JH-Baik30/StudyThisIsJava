package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
		case '1':
		case '2':
			System.out.println("남자");
			break;
		case '3':
		case '4':
			System.out.println("여자");
			break;
		}
		System.out.println();

		char a = 'A';
		int b = 65;
		String c = "A";
		int d = ssn.charAt(6);
		int e = 1;
		System.out.println(d + "  " + e + "\n");
		System.out.println((int) a == b);
	}
}
