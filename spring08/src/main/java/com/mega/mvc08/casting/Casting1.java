package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.box.볼펜;

public class Casting1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		MemberDTO dto = new MemberDTO();
		dto.setId("hong");

		list.add(dto); // object(큰) <--자동형변환-- String(작은)
		list.add("hong"); // object(큰) <--자동형변환-- String(작은)
		list.add(new Date()); // object(큰) <--자동형변환-- Date(작은)
		list.add(new Random()); // object(큰) <--자동형변환-- Random(작은)

		list.add(100);
		// object(큰) <--자동형변환(UpCasting 업캐스팅)-- Integer(작은) <-auto-boxing---int(기본형변환)

		list.add(11.11);
		// object(큰) <--자동형변환-- Double(작은) <-auto-boxing---double(기본형변환)
		System.out.println(list);

		// object로 꺼내야한다.
		Object dto2 = list.get(0); // Object
		// System.out.println(dto2.getId());
		// list에 dto에 들어간 값이 UpCasting 되서 object로 들어갔기 때문에 get메서드로 꺼낼수없다
		// 업캐스팅되어 Object로 들어간 객체는 원래 클래스가 가지고 있던
		// 자식에서 추가된 메서드를 쓸 수 없게 된다.
		// 부모클래스로 업캐스팅하는 경우는 자식에서 추가된 메서드를 인식하지 못한다.

		// 자식에서 추가된 메서드를 사용하고 싶으면 다시 자식타입으로 강제변환하여 사용 해야한다.
		// 자식타입은 부모타입보다 작으므로 강제형변환이 필요하다.
		MemberDTO dto3 = (MemberDTO) list.get(0);
		// MemberDTO(작)<---강제형변환(다운캐스팅) ---- Object(큰)
		System.out.println(dto3.getId());

		// 100꺼내서 1 더해보기
		// object에서 연산을 하려면 Integer를 사용해야한다.
		// Integer로 강제형변환(다운캐스팅)해서 연산해준다
		int num = (Integer) list.get(4);
		System.out.println(num + 1);
		// int <--오토언박싱-- Integer <--다운캐스팅--Object

		// 11.11꺼내서 1 더해보기
		double temp = (Double) list.get(5);
		System.out.println(temp + 100);
		// int <--오토언박싱-- Double <--다운캐스팅--Object
	}

}
