package 반북문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
			
		// while loop condition.
		//시작값: 3
		// 종료값: 10
		//3 , 4 , ~10까지 프린트
		
		String start = JOptionPane.showInputDialog("시작값을 입력하세요.");
		String end = JOptionPane.showInputDialog("종료값을 입력하세요.");
		
		int start2 = Integer.parseInt(start);
		int end2 = Integer.parseInt(end);
		
		
		while (start2 <= end2) {
			System.out.println(start2);
			start2++; // 증감
			
		}
		
		
		
		
		
		
		
		
			// 반복문엔 시작값 , 조건식 , 증감식이 필요하다.
	
			
	
	
	
	
	
	
	
	
	
	
	
	} //main 

} //class 
