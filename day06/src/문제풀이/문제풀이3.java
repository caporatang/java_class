package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이3 {

	public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("나이를 입력하세요");
	//태어난 연도는 올해년도 - 나이 +1
	String hour = JOptionPane.showInputDialog("태어난 시간을 입력하세요");
	
	
	int age2 = Integer.parseInt(age);
	//임포트가 안되어있는 경우 커맨드 + 쉬프트 + o(영문) , f2 누르고 하나씩 해도 가능.
	int hour2 = Integer.parseInt(hour);
	
	Date date = new Date();
	
	int date2 = date.getYear() + 1900; // 기준이 1900년이기 때문에 1900을 더해줌.
	int age3 = date2 - age2 +1; // 만 나이로 계산되기 때문에 +1을 해줌.
	
	System.out.println( "출생년도는" + age3 + "입니다");
	
	
	
	
	if (hour2 < 12) {
		System.out.println("오전에 태어나셨군요");
	} else if (hour2 < 20) {
		System.out.println("오후에 태어나셨군요.");
	}else if (hour2 < 24) {
		System.out.println("밤에 태어나셨군요.");
		
	} else {
		System.out.println("새벽에 태어나셨군요.");
	}
	
	
	
	
	
	
	//switch (hour2) {
//	case 1 :
//	case 2 :
//	case 3 :
//	case 4 :
//	case 5 :
//	case 6 :
//	case 7 :
//		System.out.println("새벽에 태어나셨군요.");
//		break;
//	case 8 :
//	case 9 :
//	case 10 :
//	case 11 :
//		System.out.println("오전에 태어나셨군요.");
//		break;
//	case 12 :
//	case 13 :
//	case 14 :
//	case 15 :
//	case 16 :
//	case 17 :
//	case 18 :
//	case 19 :
//		System.out.println("오후에 태어나셨군요.");
//		break;
//	default:
//		System.out.println("밤에 태어나셨군요.");
//		break;
//	}
	
	
	
	}

}
