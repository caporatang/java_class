package 배열복사;

public class 기본형복사 {

	public static void main(String[] args) {
		// ram의 변수에 들어있는 값을 복사한다. , 램엔 기본형과 참조형변수가 들어간다. 값이나 주소.
		//기본형 변수를 복사.
		
		
		int x = 100;
		int y = x;
		System.out.println("x: "+ x);
		System.out.println("y: " + y);
		
		
		
		System.out.println("-----원본 x값 수정후 ---------");
		x=200;
		System.out.println("x: "+ x);
		System.out.println("y: " + y);
		
		
		
	}

}
