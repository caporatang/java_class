package 문제풀이;

import java.util.Scanner;

public class 배열문제풀이2 {

	public static void main(String[] args) {
	
		
		//String s2= {"java , jsp , spring"};
		//s2[0] : 주소
		// String 변수는 원래 주소가 들어있지만,
		//내부적으로 그 주소가 가르키는 char들을 프린트되도록 조정이 되어있는 상태임. 
		//ppt 126페이지 참고할것..!
		
		
		
		
		
		String[] s = new String[3];
		//배열은 자동 초기화 {null , null , null}
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < s.length; i++) {
			System.out.print("과목 입력 > > >");
			s[i] = sc.next();
		}
		
		System.out.println(s[0] + "보다는 " + s[1]);
		sc.close();
	}

}
