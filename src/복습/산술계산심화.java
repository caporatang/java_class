package 복습;

import javax.swing.JOptionPane;

public class 산술계산심화 {

	public static void main(String[] args) {
		//
		int x = 111;
		int y = 222;
		System.out.println("두 수의 합은 " + (x + y));
		System.out.println("두 수의 나눗셈은 " + (x / y));

		// int sum = 333;
		int sum = x + y;
		int avg1 = sum / 2;
		System.out.println("평균은 " + avg1);
		//자바에서는 정수와 정수의 계산은 무조건 정수가 나온다!
		
		//자바에서는 하나라도 실수면 무조건 실수의 결과가 나온다!!
		double avg2 = sum / 2.0;
		System.out.println("평균은 " + avg2);
		
		int count = 2;
		avg2 = sum / (double)count;
		System.out.println("평균은 " + avg2);
		//casting, 캐스팅:
		//cpu가 원래의 데이터의 타입을 다른 타입으로 강제로 변환 하는것을 말한다.(double)
		//강제로 타입 변환, 강제형변환
		
		//int x2 = 22.0; > int 보다 더블이 더 큰 주이다.
		//double y2 = 22; < double이 더 큰 범주이므로 사용이 가능하다.
		
	}

}
