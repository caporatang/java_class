package com.mega.mvc08.casting;

import java.util.ArrayList;

public class 문제풀이 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		System.out.println(list);
		
		int money = (Integer)list.get(0);
		System.out.println(money + 2000);
		
		double cm = (Double)list.get(1);
		System.out.println(cm + 10);
		
		boolean meal = (Boolean)list.get(2);
		if (meal) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		char gender = (Character)list.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1, 3 예요");
		}else {
			System.out.println("주민번호는 2, 4 예요");
		}
		
		// int <--오토언박싱-- Integer <--다운캐스팅--Object		
		// int <--오토언박싱-- Double <--다운캐 스팅--Object		
		
		
	}

}
