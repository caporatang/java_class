package 배열복사;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사

		int[] x = { 1, 2, 3 };
		//int[] y = x; // // 참조형 복사 (얕은 복사 : 주소만 복사) -
		int[] y =x.clone(); // 참조형 복사 (깊은 복사 : 주소가 가르키는 값들의 목록을 복사한다.)

		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n== 원본 x값 수정후=="); //역슬러시 n을 쓰면 뉴라인. 엔터.. \t 는 텝
		// 역슬러시(\)를 이스케잎 문자라고 부른다.
		
		x[0] = 9; 
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}

		System.out.println();

		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		
		
		
		
		
		
	
	
	
	
	}

}
