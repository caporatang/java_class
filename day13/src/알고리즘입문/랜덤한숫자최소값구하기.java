package 알고리즘입문;

import java.util.Arrays;
import java.util.Random;

public class 랜덤한숫자최소값구하기 {

	public static void main(String[] args) {
		//랜덤한 값 1000까지 10000개까지 해서 시드값은 100 넣고 
		// 갯수 , 위치 , 최소값 구해보세요 
		// += << 앞에있는거까지 같이 더 해라 .
		
		Random r = new Random(100);
		
		int[] a = new int[10000];
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(1000) + 1;
		}
		int so = a[0];
		int count = 0; 
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < so) {
				so = a[i];
			}
		}
		System.out.println("최소값은 : " + so);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == so) {
				count++;
			}
		}
		
		System.out.println("최소값의 개수는 " + count);
		
		
		String sum = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] == so ) {
				sum = sum + i + "번 ";
			}
		}
		
		System.out.println(sum);
		
		
		//파괴함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		//배열은 크기가 고정적이고 데이터 타입이 같을때 사용한다.
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
