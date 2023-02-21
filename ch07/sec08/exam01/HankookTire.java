package ch07.sec08.exam01;

public class HankookTire extends Tire{
	//method overriding
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}
