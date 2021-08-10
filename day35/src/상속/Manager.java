package 상속;

public class Manager extends Employee {

	int bonus;

	public void test() {
		System.out.println("진급시험을 보아요");
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", saslary=" + saslary + ", rrn="
				+ rrn + "]";
	}
	
}
