package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{

	//turnOn() abstract method overriding
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	//turnOff() abstract method overriding
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	//search() abstract method overriding
	@Override
	public void search(String url) {
		System.out.println(url + " 을(를) 검색합니다.");
	}	
}
