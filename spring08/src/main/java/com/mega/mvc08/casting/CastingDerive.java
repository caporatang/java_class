package com.mega.mvc08.casting;

import com.mega.mvc08.box.볼펜;
import com.mega.mvc08.box.학용품;

public class CastingDerive {

	public static void main(String[] args) {
		//Derive >> 파생된 데이터, 참조형 변수
		//형변환(casting, 캐스팅)
		//참조형 형변환은 "상속관계에 있는 클래스간" 가능하다. >> 관계 없는 클래스끼리는 하지않는다.
		
		학용품 p = new 학용품(); // 부모, 수퍼클래스 , 큰 개념
		볼펜 b = new 볼펜(); // 자식, 서브클래스, 작은 개념
		//클래스간의 크기는 개념을 가지고 큰지 작은지를 판별한다.
		
		p = b; // 큰 <---자동 형변환--- 작
		b = (볼펜)p; // 작 <---강제 형변환--- 큰
		
		
	}

}
