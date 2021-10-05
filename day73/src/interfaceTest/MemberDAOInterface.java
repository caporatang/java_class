package interfaceTest;

public interface MemberDAOInterface {

	// 불완전한 메서드 => 추상 메서드만 써야함
	// 규칙만 정의한 문서 역할이므로 불완전한 메서드만 써야한다.
	public abstract int insert(String id, String pw, String name, String tel);

	// 앞에가 자동으로 생략이 되기 때문에 안써줘도 되고
	// 둘중 하나만 써도 상관없다.
	abstract int update(String id, String tel);

	public int delete(String id);

	String select(String id);

}