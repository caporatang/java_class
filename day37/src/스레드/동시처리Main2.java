package 스레드;

public class 동시처리Main2 {
	public static void main(String[] args) {
		AtThread at = new AtThread();
		DollarThread Do = new DollarThread();
		PercentThread pc = new PercentThread();

		at.start();
		pc.start();
		Do.start();

	}
}
