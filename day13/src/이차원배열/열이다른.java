package 이차원배열;

public class 열이다른 {

	public static void main(String[] args) {
		//1. 배열 처음에 만들 때 값을 이미 알고 있는 경우
		int[][] n1 = {
				{1, 2, 3,},
				{1, 2, 3, 4},
				{1, 2, 3, 4, 5}
		};
		
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		
		//2. 배열 처음에 만들 때 값을 모르고 있는 경우 
		//2-1 1차원 배열을 만들어라.
		//2-2 1차원 배열을 2차원 배열의 각 행에 끼워 넣어라
		
		int[][] n2 = new int[3][];
		
		int[] m1 = new int [10];
		int[] m2 = new int [15];
		int[] m3 = new int [12];
		
		n2[0] = m1;
		n2[1] = m2;
		n2[2] = m3;
		

			for (int i = 0; i < n2.length; i++) {
				for (int j = 0; j < n2[i].length; j++) {
					System.out.print(n2[i][j] + " ");
				}
				System.out.println();
			}
		
		
		

	}

}
