package 자바기본;

import java.util.Random;

public class 기본입출력문제8 {

	public static void main(String[] args) {
		
		Random r = new Random(100); // seed값, 씨앗값 입력하면 랜덤의 숫자를 고정 시킨다.
		int start = r.nextInt(100); // 0~99 , 시작값
		int end = r.nextInt(10) + 1000; // 1000~1009, 종료값
		
		int sum = 0;
		while (start <= end) {
			if (start % 3 == 0) {
				sum += start;
			} 
			start++; // 하나하나 분석해보자
		}
		System.out.println(sum);
		
		
		
		
	}

}
