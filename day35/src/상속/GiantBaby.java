package 상속;

public class GiantBaby extends Baby {

	boolean big;

	public void eat() {
		System.out.println("나이에 비해 많이 먹어요");
	}

	@Override
	public String toString() {
		return "GiantBaby [big=" + big + ", resemble=" + resemble + ", name=" + name + ", age=" + age + "]";
	}

}
