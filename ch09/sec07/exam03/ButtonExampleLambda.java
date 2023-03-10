package ch09.sec07.exam03;

public class ButtonExampleLambda {

	public static void main(String[] args) {
		// Ok 버튼 객체 생성
		Button btnOk = new Button();
		// Cancel 버튼 객체 생성
		Button btnCancel = new Button();

		// 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼이 클릭되었습니다.");
		});

		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼이 클릭되었습니다.");
		});

		// 버튼 클릭하기
		btnOk.click();
		btnCancel.click();
	}
}
