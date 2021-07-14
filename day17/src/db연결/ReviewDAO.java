package db연결;

import java.sql.Connection;
import java.sql.DriverManager;

public class ReviewDAO {
			
	public void create() throws Exception {
		
		
		Class.forName("com.mysql.jdbc.Driver"); // forname으로 드라이버를 연결.
		System.out.println("1. connector 연결......."); // 연결 확인하기.
		
		String url = "jdbc:mysql://localhost:3306/mega"; // url에 ip,포트 db의 정보를 넣는다
		String username = "root";
		String pw = "fender601";
		
		Connection con =DriverManager.getConnection(url, username, pw);
		System.out.println("2단계 연결 성공"); // connection , drivermanager가 부품이다. 부품 안에 정보를 넣자.
		
		
		
		
		
		
		
		
	}
	
			

	}


