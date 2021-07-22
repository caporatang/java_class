package 생성자;

public class MemberBag {
	
	String id;
	String pw;
	String name;
	String num;
	
	public MemberBag(String id, String pw, String name, String num) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "회원가입 [id=" + id + ", pw=" + pw + ", name=" + name + ", num=" + num + "]";
	}
	
	
	
}
