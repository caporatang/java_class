package 배열생성;

public class 기본형배열review {
	public static void main(String[] args) {
		// 1.int크기 5인 배열을 생성해보세요.
		// 2.배열의 크기를 프린트해보세요
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		// 4. 배열의 마지막 위치에 500을 넣어서, 프린트
		// 5. 배열의 3번째 위치에 200을 넣어서, 프린트
		// 6. 배열의 전체 데이터를 프린트
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		// 8. 그림으로 그려보세요

		int[] a = new int[7];
		System.out.println(a.length);
		
		a[0] = 100;
		a[a.length - 1] = 500;
		System.out.println(a[6]);
		
		a[2] = 200;
		System.out.println(a[2]);
	}
}
