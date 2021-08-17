package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력8문제 {

	public static void main(String[] args) {
		// 시작할 값 입력, 종료할 값 입력
		// 5의 배수만 더해서 출력
		// 5의 배수의 개수
		// 5의 배수의 목록
		// 5의 배수의 평균값

		Scanner sc = new Scanner(System.in);

		System.out.print("최소값을 입력해주세요 > > > >");
		int s = sc.nextInt(); // 1020
		System.out.print("최대값 입력해주세요 > > > > ");
		int m = sc.nextInt(); // 3333

		int count = 0;
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (s <= m) {
			if (s % 5 == 0) {
				count++;
				sum += s;
				list.add(s);
			}
			s++;
		}
		System.out.println("5의 배수 총 합은" + sum);
		//System.out.println(list.size()); << 리스트에 들어가있기 때문에 카운트를 안해도 
		// 사이즈를 구하면 된다.
		System.out.println("5의 배수 총 개수는 " + count);
		
		
		
		
		//System.out.println((double)sum / list.size());  float도 가능하다.
		// 하나를 실수로 만들어주어야 하기 때문에 double로 캐스팅한다. 
		int total = sum / count;
		System.out.println("5의 배수 평균은" + total);
		
		
		//5의 배수 목록 > arraylist는 toString 되어있기 때문에
		// 그냥 리스트를 프린트 하면 목록이 프린트 된다
		//System.out.println(list);
		for (Object o : list) {
			System.out.println(o + " ");
		}
		
		
		
		
	}

}
