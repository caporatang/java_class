package 메서드반환값;

import java.util.Date;

public class 다양한반환값사용 {

	public static void main(String[] args) {
		다양한리턴 r = new 다양한리턴();
		//대체 가능한것을 써도 상관없지만 더 크거나 같은걸 써야한다.
		
		int result1 = r.add1(); // int보다 더 큰 숫자가 온다면 long
		double result2 = r.add2(); // float도 사용 가능하지만 반환값이 double이면 더 커야함. 
		char result3 = r.add3();
		boolean result4 = r.add4();
		String result5 = r.add5();
		Date result6 = r.add6(); 
		System.out.println(result6);
		int[] result7 = r.add7();
		for (int x : result7) {
			System.out.print(x + " ");
		}
		계산기 result8 = r.add8();
		result8.add(200, 100);
		
		
		
		
		
		
		

	}

}
