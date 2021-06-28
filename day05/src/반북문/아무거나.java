package 반북문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class 아무거나 {

	public static void main(String[] args) {
		// new : 벽돌처럼 사용할 때 ram에 새롭게 복사해서
		// 부품을 사용함.

		// JFrame f = new JFrame();
		// JFrame f = new JFrame();
		// JButton b1 = new JButton();
		// JTextArea t1 = new JTextArea();
		// void란 혼자 할일을 하고 끝나는 것을 말함.
		Random r = new Random(4); // 42 >> 아무 숫자나 넣어도 상관없고 랜덤 숫자 생성 후 고정.
		// 씨앗값(seed)이라고 부른다. 단, 처음에 넣었던 값을 바꾸면 랜덤 생성값도 바뀜.
		int num = r.nextInt(100); // 100 이라는 숫자 0-99
		System.out.println(num);
		
		//50보다 작은 임의의 수 생성
		//(0~44) (5~49)
		int num2 = r.nextInt(45) + 5;
		System.out.println(num2);
		//1000보다 작은 임의의 수 생성 
		//100~999
		int num3 = r.nextInt(900) + 100; // 최대값은 만들고자 하는 값에서 1크게 해야함
		System.out.println(num3);
		//3~22    >>> 뒤에게 최소값(시작하는 값 )
		int num4 = r.nextInt(20) + 3; 
		
		

	}

}
