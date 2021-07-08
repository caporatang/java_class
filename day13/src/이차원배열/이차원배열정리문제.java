package 이차원배열;

import java.util.Random;

public class 이차원배열정리문제 {

	public static void main(String[] args) {
		//랜덤한값을 1~100
		// 4*5안에 넣으세요
		//전체를 프린트.
		Random r = new Random();
		
		int[][] a = new int[4][];
		
		int[] m1 = new int [5];
		int[] m2 = new int [5];
		int[] m3 = new int [5];
		int[] m4 = new int [5];
		
		a[0] = m1;
		a[1] = m2;
		a[2] = m3;
		a[3] = m4;
		
	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(100) + 1;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
