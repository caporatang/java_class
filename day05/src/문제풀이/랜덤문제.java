package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {
		// 랜덤한 숫자를 2개 발생시켜서 
		//첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
		// 두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		
		Random r = new Random(7); // 부품을 복사해서 r이라는 공간에 저장함.
		
		int target = r.nextInt(30); // 0~30까지의 숫자중 랜덤으로 생성해서 변수 target에 저장 
		int target2 = r.nextInt(100); // 0~100까지의 숫자중 랜덤으로 생성해서 변수 target2에 저장
		
		System.out.println(target); // target에 저장한 값을 가져와서 cpu가 출력
		System.out.println(target2);// target2에 저장한 값을 cpu가 출력
		
		if (target > target2) {       		// target , target2 에 저장된 값을 가져와서 비교함.
			System.out.println("n1이 더 큼"); // 비교한게 true면 그대로 cpu에서 출력.	
		}		
		
		if (target < target2) {				//target , target2 에 저장된 값을 가져와서 비교함.
			System.out.println("n2가 더 큼 "); // 비교한게 true이면 출력.
		}
		
		
		
		while (true) {
			if (target > target2) {
				 JOptionPane.showMessageDialog(null, "첫번째 숫자가 더 커요");
				 break;
			} else {
				JOptionPane.showMessageDialog(null, "두번째  숫자가 더 커요");
				
					System.exit(0);
			}
			
			
			
			
			
			
		}//while
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		

	} // main

} //class
