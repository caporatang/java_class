package 클래스사용;

import java.io.ObjectStreamClass;
import java.sql.DriverManager;

public class MemberDB {
		//DB작업
		//1.DB, 테이블 생성 (스키마)
		//2. 데이터 집어넣기
		//3. 데이터 조작(Create, Read , Update , Delete)
		// 포트 아이피 아이디 비번 넣고 승인을 먼저 받는다.
		//자바랑 mysql(서버) 연결을 해야할땐 통로(stream)이 필요하다. 
		
		//빌드 패스 > 콘피큐어 > add external
		String ip = "localhost";       //mysql이랑만 연결할거고 아이피가 안바뀌기 때문에 미리 그냥 넣어버려라 //127.0.0.1
		String port = "3306";
		String user = "root";
		String pass = "fender601";
	
	
		
		
		
		public void login(String id, String pw) {
			//회원 가입시 사용한 id apple, pw는 1111
			if (id.equals("apple") && pw.equals("1111")) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("로그인 실패");
			}
		}
		
		
		public void create(String id, String pw, String name, String tel ) throws Exception {
			//DB연결해야한다.
			//1)연결할 mysql server정보가 필요 네트워크 연결할 mysql sever정보 :주소와 연결(ip + port) 
			//2)연결할 mysql server에 승인을 받아야한다. 필요한 정보 id, pw
			
			
			System.out.println(ip + port + "에 연결되었습니다");
			System.out.println("회원가입 처리");
			System.out.println("도착한 id는 " + id);
			System.out.println("도착한 pw은 " + pw);
			System.out.println("도착한 name은 " + name);
			System.out.println("도착한 tel은 " + tel);
			//java와 mysql과의 연결 순서 정해져 있음. (JDBC프로그래밍) 
			//java DB Connectivity
			
			
			//1. connetor 설정.
			Class.forName("com.mysql.jdbc.Driver"); // 패키지는 소문자로 써야되고 class(Driver)는 대문자로 사용 Driver만 대문자이다. // 위험하다고 빨간줄이 뜨면 throws Exception
			System.out.println("1. 커넥터 설정 성공!!!");
			
			//2. mysql server의 db와 연결하고 승인을 받자.
			String url = "jdbc:mysql://" + ip + ":"  + port + "/shoes";        // url은 IP와 port의 결합이다. url 작설할때는 "jdbc"db이름://"
			DriverManager.getConnection(url, user, pass); // 스트림(연결다리)
			System.out.println("2. mysql서버 승인/연결 성공!!!"); 
			//3. sql문을 만들자.
			
			//4. sql문을 mysql에 전송해준다.
			
		}
		

		public void read(String id) { //String 이 들어간 자리에 검색할 조건을 입력하면 된다.
			System.out.println("회원정보 검색 처리");
		}
		
		

		public void update() {
			System.out.println("회원정보 수정 처리");
			
		}
		
		

		public void delete(String id) {
			System.out.println("회원정보 삭제 처리");
			System.out.println(id + "님의 탈퇴가 완료되었습니다.");
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
}
