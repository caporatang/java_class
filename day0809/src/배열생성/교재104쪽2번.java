package 배열생성;

import java.util.Iterator;

public class 교재104쪽2번 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		
		//for문을 이용하여 반복 합계 계산
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			}
			evenSum = evenSum + i;
		}
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			oddSum = oddSum + i;
		}
		
		System.out.println("짝수의 합계는 " + evenSum);
		System.out.println("홀수의 합계는 " + oddSum);
		
		
	}
}
