package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car mycar = new Car();
		
		//Tire 객체 장착
		mycar.tire = new Tire();
		mycar.run();
		
		mycar.tire = new HankookTire();
		mycar.run();
		
		mycar.tire = new KumhoTire();
		mycar.run();
	}
}
