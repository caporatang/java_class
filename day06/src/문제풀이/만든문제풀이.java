package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 만든문제풀이 {

	public static void main(String[] args) {
//      Q3.운동을 시작하는 시간 입력 : 
//      운동 몇시간 했는지 계산.
//
//      내일 헬스장 오픈 시간 : 7시~ 10시이전 = "일찍 여는군요"
//      10시 시작~15시이전 : "오픈이 늦네요"
//      15시이후 : "사장님이 일이 있대요"
		Date date = new Date();
   int hour = date.getHours();
   String exe = JOptionPane.showInputDialog("운동을 언제 시작하나요?");
   int exe1 = Integer.parseInt(exe);

   System.out.println("운동을 한 시간은" + (hour - exe1));

   String start = JOptionPane.showInputDialog("내일 헬스장은 언제 여나요?");
   int start2 = Integer.parseInt(start);

   if (start2 >= 7 && start2 < 10) {
      System.out.println("일찍 여는군요");
   } else if (start2 >= 10 && start2 < 15) {
      System.out.println("오픈이 늦네요");
   } else {
      System.out.println("사장님이 일이있대요");
   }


	}

}
