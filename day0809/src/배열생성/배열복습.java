package 배열생성;

import java.util.Iterator;

public class 배열복습 {

	public static void main(String[] args) {
		//int = 4byte
		// 배열을 만들 때 값을 처음부터 알고 있는 경우
		int[] num = { 100, 200, 300 };
		num[1] = 500;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int a : num) {
			System.out.println(a);
		}
		// 값을 처음에 모르고 있다가 나중에 넣는 경우
		int[] num2 = new int[3]; // {0,0,0} < 자동으로 초기화가 되서 0이 값으로 들어가있다.
		num2[0] = 1000;
		num2[num2.length-1] = 1000;
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
				
	}

}
