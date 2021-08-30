package com.mega.mvc08.generic;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		// 제너릭 프로그램
		// 가변적인 데이터 모음, 변화가 많음
		// 하나의 데이터 타입만 넣으려고 하는 경우.
		//ArrayList list = new ArrayList<>();
		//박싱과 업캐스팅이 일어난다.
		//list.add(100);
		//list.add(200);
		//list.add(300);
		// 꺼낼때는 언박싱과 다운 캐스팅을 해야한다.
		
		
		//제너릭 프로그램은 자바 1.8버전부터 사용 가능한 문법이다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		//제너릭 프로그램을 사용하면 캐스팅을 안해도 된다.
		list.add(100);
		list.add(200);
		list.add(300);
		int i1 = list.get(0);
		System.out.println(i1 + 100);
		
		
		ArrayList<Double> list2 = new ArrayList<Double>();
		list2.add(11.1);
		list2.add(11.2);
		list2.add(11.3);
		//객체 생성시 사용할 데이터의 타입을 정할 수 있는 문법. == 제너릭 프로그램
		
		
		
		
		
		
	}

}
