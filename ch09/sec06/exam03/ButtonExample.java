package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		// Button 객체 생성
		Button btnOk = new Button();
		Button btnCancel = new Button();

		// Button Click Event 처리 클래스(Listener 클래스) 선언
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnCancel.setClickListener(new CancelListener());
		
		btnOk.click();
		btnCancel.click();
	}
}
