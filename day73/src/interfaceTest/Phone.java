package interfaceTest;

public class Phone implements PhoneInterface {

	
	@Override
	public void call(int num) {
		System.out.println("전화번호 : " + num);
		
	}

	@Override
	public void message(String message) {
		System.out.println("메세지 내용 : " + message);
	}

	@Override
	public void wifi(String wifi) {
		System.out.println("와이파이 이름 : " + wifi);
		
	}

}
