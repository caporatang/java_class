package interfaceTest;

public class BbsDAO implements BbsDaoInterface {

	
	
	@Override
	public void create(int no, String title, String content) {
		System.out.println("bbs테이블에 jdbc처리");

	}

	@Override
	public void delete(int no) {
		System.out.println("bbs테이블에 삭제처리");
		
	}

	
}
