package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		//padding
		//int[] 변수명 : int로 만들어진 배열을 가르키는 주소가 변수명에 들어간다 라는 의미이다.
		
		int[] s = new int[10]; // 인트로 만들어진 배열 주소가 s에 들어감.
		double[] s2 = new double[5];
		String[] s3 = new String[100];
		//main안에서 만들어진 변수(배열의 값이 들어간.)는 메인을 벗어날수없다 .
		//배열은 자동초기화시켜줌 , 원래 하던대로 쓰레기값을 치우기위해 0이나 null로 초기화 시켜줄 필요가없다 .
		System.out.println(s); // 주소 프린트
		System.out.println(s[0]); // 주소 프린트
		System.out.println(s2); // 주소 프린트
		System.out.println(s3);
		System.out.println(s3[0]); // s3중에 첫번째 위치에 있는애를 프린
		
		
		

	}

}
