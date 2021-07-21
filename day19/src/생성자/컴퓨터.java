package 생성자;

public class 컴퓨터 {
	int price;
 	String com;
	int mon;
	

	public 컴퓨터(int price, String com, int mon) {
		super();
		this.price = price;
		this.com = com;
		this.mon = mon;
	}


	@Override
	public String toString() {
		return "컴퓨터 [가격=" + price + ", 제조회사=" + com + ", 모니터크기=" + mon + "]";
	}
	
	
	
	
}
