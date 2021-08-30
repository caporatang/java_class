package com.mega.mvc08.box;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

public class BoxingUnBoxing3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//add(object o) : Object자리에는 모든 클래스가 다 들어갈 수 있다. 
		// object(super class)라는 큰 개념을 상속받았기 때문이다.
		// add(참조형 변수의 주소), 
		list.add("hong");
		list.add(new Date());
		list.add(new Random()); // >> object >> 참조형 주소가 들어가야한다
		
		// 기본형은 클래스가 아니라서 주소가 없다.
		// 오토박싱으로 wrapper클래스로 바꿔줬기 때문에 사용 가능한것이다.
		list.add(100); // Integer <---오토박싱---int
		list.add(11.1);// Double <---오토박싱---double
		list.add(true); // Boolean <---오토박싱---boolean
		list.add('a'); // Character <---오토박싱--- char
	}

}
