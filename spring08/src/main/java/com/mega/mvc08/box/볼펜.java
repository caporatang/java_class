package com.mega.mvc08.box;

public class 볼펜 extends 학용품 {

	double bold;
	
	public void write() {
		System.out.println("볼펜으로 글을 써요");
	}

	@Override
	public String toString() {
		return "볼펜 [bold=" + bold + ", price=" + price + ", com=" + com + "]";
	}

	
}
