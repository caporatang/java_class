package 다차원배열2차원;

public class 이차원배열2 {
	public static void main(String[] args) {
		//이차원배열은 1차원배열의 모음이다. 합해보자.
		//이차원 배율은 이중포문으로 돌려야된다 ( for문안에 for)
	
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrList = new int[3][];
		arrList[0] = arr1;
		arrList[1] = arr2;
		arrList[2] = arr3;
		
		
		arrList[1][1] = 1 ; 
		  
		
		
		//		0	1	2	3	4 // 인덱스값..
		
		
		//0		0	0	0
		//1		0	0	0	0	0
		//2		0	0	0	0
		
		arrList[1][3] = 1;
		System.out.println(arrList[1][3]);
		
		
		System.out.println(arrList.length);
		System.out.println(arrList[0].length);
		System.out.println(arrList[1].length);
		System.out.println(arrList[2].length);
		
		
	}
}
