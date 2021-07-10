package 클래스생성;

public class 내거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		//new를 하면, 멤버변수들이 heap영역에 복사된다.
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다. 
		myTv.ch= 7;
		//myTv안에 들어있는 주소가 가르키는 ch변수에 7을 넣으라는 의미
		myTv.vol = 9; 
		myTv.onOff = true;
		System.out.println("mytv에 채널은 " +myTv.ch);
		System.out.println("mytv에 볼륨은 " + myTv.vol);
		System.out.println("mytv에 전원은 " + myTv.onOff);
		//myTv.onOff = false;
		
		System.out.println(myTv);
		
		
		
		
		TV yourTv = new TV();
		yourTv.ch = 9;
		yourTv.vol = 12; 
		yourTv.onOff = true;
		System.out.println("yourtv에 채널은 " + yourTv.ch);
		System.out.println("yourtv에 볼륨은 " + yourTv.vol);
		System.out.println("yourtv에 전원은 " + yourTv.onOff);
		
		System.out.println(yourTv);
		
		
		
		coffe c = new coffe();
		c.amount = 1000;
		c.kind = "마끼아또";
		c.L = 10000000;
		c.hotice = "차가운거";
		
		System.out.println();
		
		System.out.println("오늘 하루 마신 커피의 잔 수는 " + c.amount);
		System.out.println("마시는 커피의 종류는 " + c.kind);
		System.out.println("오늘 하루 마신 커피의 양은 " + c.L);
		System.out.println("오늘 마신 커피는 " + c.hotice);
		
		
		c.drink();
		c.shake();
		
		
		
		
	}

}
