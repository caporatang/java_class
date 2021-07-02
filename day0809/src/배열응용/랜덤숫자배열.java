package 배열응용;

import java.util.Random;
import java.util.Scanner;

public class 랜덤숫자배열 {

	public static void main(String[] args) {
		
		Random r = new Random(42);
		int[] jumsu = new int[100];
		
		//랜덤한 값 하나 만들어서 
		//배열의 특정한 인덱스에 저장
		
		//jumsu[100] = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < jumsu.length; i++) {
			
			jumsu[i] = r.nextInt(101);
			System.out.println();
		}
		
		for (int x : jumsu) {
			System.out.println(x);
		}

	}

}
