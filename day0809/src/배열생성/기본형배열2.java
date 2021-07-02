
package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
		
		//int[] : int로 가르키는 주소가 들어간다는 의미.
		// s  : 힙영역에 할당된 저장공간에 주소가 들어간다.
		// = : 힙영역에 할당된 저장공간의 주소를 변수에 넣는다.
		// new : 힙영역에 지정된 타입의 크기만큼 배열을 만들어
		// int[10] : 배열로 만들어질 타입과 크기가 결정된다.
		
		// + " " > > >공백을 붙여주면 보기가 깔끔하다.
		
		int[] s = new int[10]; 
		System.out.println(s.length);
		
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
			//배열은 변수값을 자동 초기화 시켜준다.
		}
		System.out.println();
		for (int i = 0; i < s.length; i++) {
			s[i] = i; // 0 1 2 3 4 차례대로 프린트로 확인하기 
		
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + 1 + " ");
		}
		
		
	}

}
