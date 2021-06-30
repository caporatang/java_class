package 문제풀이;

import java.util.Scanner;
// String에서 ==을 안쓰는 이유가 무엇인가 ?  ==은 주소를 비교하고 
//equals는 String에 넣은값 자체를 비교하기 때문이다. 
//jsp = 인터넷을 만들때 사용하는 라이브러리를 통칭한다.
public class 콘솔입력스캐너45 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 입력(자바 , c++ , python)");
		String data = sc.next();

		if (data.equals("자바")) {
			System.out.println("JSP점프@@");
		} else if (data.equals("c++")) {
			System.out.println("ASP점프@@");
		} else {
			System.out.println("python으로 점프!");
		}

		switch (data) {
		case "자바":
			System.out.println("JSP점프@@");
			break;
		case "c++":
			System.out.println("c++로 점프@@");
			break;

		default:
			System.out.println("python으로 점프@@");
			
			break;
		}

	}

}
