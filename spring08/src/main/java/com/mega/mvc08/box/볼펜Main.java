package com.mega.mvc08.box;

public class 볼펜Main {

	public static void main(String[] args) {

		볼펜 pen = new 볼펜();
		
		//학용품
		pen.com = "모나미";
		pen.price = 1000;
		
		pen.buy();
		System.out.println(pen.com);
		System.out.println(pen.price);
		//볼펜
		pen.bold = 11.1;
		pen.write();
		System.out.println(pen.bold);
	}

}
