package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//인터페이스 변수선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통한 호출
		vehicle.run();
		
		//강제 타입변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
