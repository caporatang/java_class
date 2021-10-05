package interfacePractice;

public class AppleComputer implements ComputerInterface {

	@Override
	public void on(String power) {
		System.out.println("전원 : " + power);

	}

	@Override
	public void open(String program) {
		System.out.println("오픈한 프로그램은 : " + program );

	}

	@Override
	public void close(String program) {
		System.out.println("닫은 프로그램은 : " + program );
		


	}

}
