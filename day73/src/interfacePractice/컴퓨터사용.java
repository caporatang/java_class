package interfacePractice;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		apple.on("켜짐");
		apple.open("pages");
		apple.close("java");
		
		BananaComputer bana = new BananaComputer();
		bana.on("꺼짐");
		bana.open("바나나 껍질 던지기");
		bana.close("바나나 먹기");
		
		
		
	}

}
