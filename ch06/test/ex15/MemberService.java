package ch06.test.ex15;

public class MemberService {
	boolean login(String id, String passward) {
		if (id.equals("hong")  && passward.equals("12345") ) {
			return true;
		} else {
			return false;
		}
	
	}
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}	
}
