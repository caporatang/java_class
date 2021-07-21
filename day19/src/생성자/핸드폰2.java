package 생성자;

public class 핸드폰2 { // 자동완성 위에 메뉴에 source << 에서 밑에서 두번째는 생성자.
	//generator constructor using fields << 생성자
	// Tostring도 자동완성 할것.

	String tel;
	String num;
	String who;

	public 핸드폰2(String tel, String num, String who) {
	
		this.tel = tel;
		this.num = num;
		this.who = who;
	}


	public String toString() {
		return "핸드폰2 [tel=" + tel + ", num=" + num + ", who=" + who + "]";
	}
	
}
