package 다차원배열2차원;

public class 이차원배열 {
	public static void main(String[] args) {
		//앞에거가 [] 행 
		//뒤에 [] 가 열
		//행 : 가로 > row
		//열 : 세로 > column
		//Record > 저장의 단위를 얘기할때 레코드라고 함.
		// 눈에 보이는 변수 16 > 렝스 

		// 만들어진 변수 숫자는 = 3*5 = 15에 s추가 일단 렝스 빼고 16
		int[][] s = new int[3][5];
		
		//   		0   1   2  3  4 
		//		 0	0	0	0  0  0
		//		 1	0	0	0  0  0
		//		 2	0	0	0  0  0
		
		s[1][1] = 1;
		System.out.println(s[1][1]);
		s[1][2] = 1;
		System.out.println(s[1][2]);
		s[1][3] = 1;
		System.out.println(s[1][3]);
		s[2][4] = 1;
		System.out.println(s[2][4]);
		for (int i = 0; i < 3; i++) { // 2차원 배열의 행을 프린트 
			for (int j = 0; j < 5; j++) { // 1차원 배열의 열을 프린트.
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		//i = 0일때 s[0][0] s[0][1] s[0][2] s[0][3] s[0][4]   = for문 앞에 j
		//i = 0일때 s[1][0] s[1][1] s[1][2] s[1][3] s[1][4]    
		//i = 0일때 s[2][0] s[2][1] s2[][2] s[2][3] s[2][4]    
		
	}
}
