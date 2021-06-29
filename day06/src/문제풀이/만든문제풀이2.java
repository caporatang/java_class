package 문제풀이;

import javax.swing.JOptionPane;

public class 만든문제풀이2 {

	public static void main(String[] args) {
//      Q1
//
//      주문번호 입력: 배민307--891
//      주문번호중 끝글자가 '1'인 경우 짜장면
//      주문번호중 끝글자가 '2'인경우 피자
//      주문번호중 끝글자가 '3'인경우 초밥
//      없으면 -->주문이 되지 않았어요
//
//      주문번호중 앞에서 3번째 글자가 '1'인경우 포장
//      주문번호중 앞에서 3번째 글자가 '2'인경우 매장취식
//      주문번호중 앞에서 3번째 글자가 '3'인경우 배달
//       없으면-->주문을 다시해주세요      

      String bemin = JOptionPane.showInputDialog("주문번호를 입력");
      char be1 = bemin.charAt(9);
      char be2 = bemin.charAt(2);

      switch (be1) {
      case '1':
         System.out.println("짜장면");
         break;
      case '2':
         System.out.println("피자");
         break;
      case '3':
         System.out.println("초밥");
         break;

      default:
         System.out.println("주문이 되지 않았어요");
         break;
      }
      switch (be2) {
      case '1':
         System.out.println("포장");
         break;
      case '2':
         System.out.println("매장취식");
         break;
      case '3':
         System.out.println("배달");
         break;

      default:
         System.out.println("주문을 다시 해주세요");
         break;
      }

	}

}
