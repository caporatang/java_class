package 클래스생성;

public class TV { //tv뒤에 기본적으로 extends Object가 생략되어있고, 상속이라고 부름. 
	
				//클래스를 만들때는 그 부품들이 가지는
				// 특징을 선택해서 틀을 만들게 된다.
				// 특징 : 
				// 1)성질(멤버변수) : 채널, 볼륨, 전원 
				// 2)동작(멤버메서드) : tv켜다, tv끄다 , 볼륨 up하다  > 메서드는 동작을 정의하는것으로 사용한다. 
		
		public int ch; // 클래스 밑에 생긴 멤버변수들은 자동 초기화 , 전역변수, 
		//전역변수는 자동 초기화가 된다.   < - > 지역변수는 자동초기화가 안된다.
		public int vol;
		public Boolean onOff;
		
			
		
		
		
		//멤버 메서드 , 메서드를 정의 해야한다.
		//메서드 정의할 때 고려사항
		//1.입력값이 있는가 .
		//2.반환값이 있는가
		public void tv켜다() {
			System.out.println("리모콘으로 on버튼을 누르다");
		}
	
		public void tv끄다() {
			System.out.println("리모콘으로 off버튼을 누르다");
			
		}
	
	public void 볼륨up하다() {
		System.out.println("볼륨을 1씩 up시키다.");
	}
	
}
