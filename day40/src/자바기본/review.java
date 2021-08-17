package 자바기본;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		// 시작할 값 입력, 종료할 값 입력
		// 5의 배수만 더해서 출력
		// 5의 배수의 개수
		// 5의 배수의 목록
		// 5의 배수의 평균값
		// 시작값 1020 , 종료값 3333

		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력하세요 > > > >");
		int start = sc.nextInt(); // 1020
		System.out.print("시작값을 입력하세요 > > > >");
		int end = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		int count = 0;
		int sum = 0; // 지역변수 > 초기화 시켜주기
		while (start <= end) {
			// 전역변수는 자동 초기화 > class 아래에 만들어준다.
			if (start % 5 == 0) {
				sum += start;
				count++;
				list.add(start);
			}
			start++;
		}
		System.out.println("5의 배수 더한 값은 " + sum);
		 // System.out.println(list.size()); 갯수가 곧 어레이리스트의 사이즈이다.
		System.out.println("5의 배수의 갯수는 " + count); // 
		System.out.println("5의 배수 목록은 " + list); // arraylist는 toString이 되어있기 때문에 그냥 출력한다.
		System.out.println("5 배수 평균은 " + sum / count);

	}

}
