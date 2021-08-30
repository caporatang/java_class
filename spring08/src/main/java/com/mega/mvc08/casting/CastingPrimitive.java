package com.mega.mvc08.casting;

public class CastingPrimitive {

	public static void main(String[] args) {
		//Primitive : 기본형 데이터 <----------> Derive 파생된 데이터(참조형)
		// 기본형 형변환 (정수, 실수, 문자, 논리)
		// 형변환(데이터 type변환)

		byte b1 = 100; // -128-127
		int i1 = 200;

		i1 = b1; // int(큰) < ---- byte(작은)
		// 가능하다 작은개념에서 큰개념으로 갈때
		// 자동으로 byte에 들어있던 100데이터가 int로 변환되어 저장된다.
		// 자동 데이터 변환(자동 형변환)

		b1 = (byte)i1; // 불가능 int(큰) < ---- byte(작은)
		// 강제로 int에 들어있던 100데이터가 byte로 변환되어 저장된다.
		// 앞에 붙은 (000 000 000 100) << 인트라서 4자리다, cpu가 강제로 앞에 000 000 000을 자른 후에 넣는다
		// 강제 데이터 변환(강제형 변환)
		
		int i2 = 3000;
		byte b2 = (byte)i2;
		System.out.println(b2);
		// 강제형변환이 가능한 경우는 데이터타입 범위의 값만 가능하다.
		
	}

}
