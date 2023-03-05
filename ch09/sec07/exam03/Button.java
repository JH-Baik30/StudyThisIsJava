package ch09.sec07.exam03;

public class Button {
	//Neated Interface
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	//Field
	private ClickListener clickListener;
	
	//Method
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
