package 배열생성;

public class 기본형배열문제1 {

	public static void main(String[] args) {
		// 1.int크기 5인 배열을 생성해보세요.
		// 2.배열의 크기를 프린트해보세요
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		// 4. 배열의 마지막 위치에 500을 넣어서, 프린트
		// 5. 배열의 3번째 위치에 200을 넣어서, 프린트
		// 6. 배열의 전체 데이터를 프린트
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		// 8. 그림으로 그려보세요
		//133페이지 참고
		
		int[] a = new int[5];
		System.out.println(a.length);
		
		a[0] = 100;
		System.out.println(a[0]);
		
		a[a.length - 1] = 500; // a[a.length-1] == 500;     >> 랭스보다 -1 로 표현해주는게 좋다
		System.out.println(a[4]);
		a[2] = 200;
		System.out.println(a[2]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
        System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i +"] : " + a[i]);
		}
		//이게 값들을 모르는 경우.
	}

}
