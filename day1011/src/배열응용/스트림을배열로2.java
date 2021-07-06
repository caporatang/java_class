package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트림을배열로2 {

	public static void main(String[] args) {
		//공백을 제거해주자. // String에 포함되어 있는 공백을 제거할때는 trim을 쓴다. 
		//trim으로 양쪽 끝에 있는 공백을 자르고 가운데에 있는건 replace로 자른다..
		
		String s1 = " 감자";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		
		
		//아예 바꿔서 공백을 제거 하는방법..
		String s3 = s1.replace(" ", "");
		System.out.println(s3.length());
		
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		System.out.println(data.length());
		
		String data2 =data.trim();
		
		System.out.println(data2);
		System.out.println(data2.length());
		
		String data3 = data2.replace(" ", ""); // replace는 원본을 지키면서 data3에 넣어서 원본을 파괴하지 않으므로 비파괴함수이다. 
		System.out.println(data3);
		
		
		
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num); // sort는 원본을 바꾼다. 원본을 파괴시키는 함수라고 해서 파괴함수라고 부른다.
		for (int i : num) {
			System.out.print(i + " ");
		}
		
		
		
	}

}
