package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ReviewDAO {

	public int create(String id, String pw, String name, String tel) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // forname으로 드라이버를 연결.
		System.out.println("1. connector 연결......."); // 연결 확인하기.

		String url = "jdbc:mysql://localhost:3306/mega"; // url에 ip,포트 db의 정보를 넣는다
		String username = "root";
		String password = "fender601";

		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2단계 연결 성공"); // connection , drivermanager가 부품이다. 부품 안에 정보를 넣자.

		// 3. sql문 생성
		String sql = "insert into product values (?, ?, ?, ?) ";

		PreparedStatement ps = con.prepareStatement(sql);
		// prepared가 sql을 나타내는 부품이다. con에 넣어놨던 정보를 sql문과 ps에 넣어놓자.
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("sql문 생성....");

		int result = ps.executeUpdate(); // 정보와 sql문을 execute를 사용하여 db에 던진다.
		System.out.println("db에 던지기.");
		System.out.println(result); // 던지고 나서 int result에 넣어놨으므로
		// 프린트하면 성공했으면 1 , 실패하면 0이 프린트 된다.
		return result;
		
		
	}
}
