package interfacePractice;

public class BananaComputer implements ComputerInterface {

	@Override
	public void on(String power) {
		System.out.println("바나나 컴퓨터 전원 " + power);

	}

	@Override
	public void open(String program) {
		System.out.println("바나나 컴퓨터로 오픈한 프로그램 " + program);
	}

	@Override
	public void close(String program) {
		System.out.println("바나나 컴퓨터로 종료한 프로그램 " + program);

	}

}
