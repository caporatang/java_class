package com.mega.mvc06;

import javax.swing.JOptionPane;

public class ArrayError4 {

	public static void main(String[] args)  {
		ArrayError2 error2 = new ArrayError2();
		try {
			error2.array();
		} catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "에러 발생 알림 서비스");
		}
		
		
		
		
	}

}
