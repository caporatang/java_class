package 자바기본;

import java.util.Scanner;

public class 기본입출력3배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		//int[] jumsu = {}; 배열에 넣을 값들을 미리 알고있을 경우에 괄호 안에 넣어주면 된다
		
		//int[] jumsu = {0, 0, 0, 0, 0};  배열은 자동 초기화 되기 때문에 아래 배열 코드와 같은 코드이다
		int[] jumsu = new int[5];
		
		for (int i = 0; i < 5; i++) {

			System.out.print("오늘 온도는 몇도인가요 ?");

			int temp = sc.nextInt();

			if (temp >= 30) {
				System.out.println("너무 더워요");
			} else {
				System.out.println("괜찮아요");
			}
			jumsu[i] = temp; 
			sum = sum + temp;
		}
	
		double avg = sum / 5.0; 
		System.out.println("평균은" + avg);
		System.out.println("--------------------------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		sc.close();

	}

}
