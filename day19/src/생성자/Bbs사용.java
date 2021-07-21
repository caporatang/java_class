package 생성자;

public class Bbs사용 {

	public static void main(String[] args) {
		
		System.out.println("게시판");
		System.out.println("----------------");
		
		System.out.println("no" +" "+ "title" +" "+ "content" +" "+ "writer");
		Bbs bbs1 = new Bbs("1", "java", "fun java", "park");
		Bbs bbs2 = new Bbs("2", "jsp", "fun jsp", "hong");
		Bbs bbs3 = new Bbs("3", "spring", "funspring", "kim");
		
		System.out.println(bbs1);
		System.out.println(bbs2);
		System.out.println(bbs3);
		
		
		
			
	}

}
