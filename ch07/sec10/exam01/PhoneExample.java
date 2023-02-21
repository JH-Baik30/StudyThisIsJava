package ch07.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		String name = smartPhone.owner;
		System.out.println("사용자 " + name +"이(가)");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
