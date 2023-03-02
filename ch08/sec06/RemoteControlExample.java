package ch08.sec06;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc;
		
		rc = new Television();  //구현객체
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();		
		rc.setMute(true);		//선언은 인터페이스 소속은 구현객체.
		rc.setMute(false);
		System.out.println("현재 볼륨: " + rc.getVolume());
		System.out.println();
		
		rc = new Audio();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재 볼륨: " + rc.getVolume());
		
		RemoteControl.changeBattery();
	}
}
