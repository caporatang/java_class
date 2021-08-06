package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MemberDAO {
	public void create(MemberDTO dto) {
		
		   try {
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/Makgeolli";
			  String username = "root";
			  String password = "fender601";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. shoes db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "insert into member values (?, ?, ?, ?, ?, ?, ?, ?)";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ps.setString(1, dto.getId());
			  ps.setString(2, dto.getPw());
			  ps.setString(3, dto.getName());
			  ps.setString(4, dto.getEmail());
			  ps.setString(5, dto.getTel());
			  ps.setString(6, dto.getAddress());
			  ps.setString(7, dto.getBirthday());
			  ps.setString(8, dto.getGender());
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>>드라이버 없음!!");
		} catch (SQLException e) {//2-4단계
			System.out.println("2-4번 에러>> DB관련 처리하다 에러 발생함!!!");
		}
	}
}
