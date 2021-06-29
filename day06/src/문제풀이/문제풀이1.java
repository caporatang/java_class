package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		//사원번호 입력 : 기103
		//사원번호 중 첫글자가 '기'인경우 '기획부이시군요'
		//       		  '인'인경우 '인사부이시군요'
		//                 '개'      개발부이군요.
		
		
	String num = JOptionPane.showInputDialog("사원번호를 입력하세요");
	char num2 = num.charAt(0);
	char num3 = num.charAt(1);
	
	switch (num2) {
	case '기':
		System.out.println("기획부이시군요.");
		break;
	case '인':
		System.out.println("인사부이시군요.");
		break;
	case '개':
		System.out.println("개발부이시군요.");
		break;
	
	}
	
   switch (num3) {
	
	case '1': case '2':
		System.out.println("임원");
		break;
	case '3':
		System.out.println("부장");
		break;
	case '4': case '5':
		System.out.println("평사원");
		break;
		
	default:
		System.out.println("나머지 해당 직급이 없음.");
		break;
		
		
   } 
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
	}

}
