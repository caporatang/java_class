package com.mega.mvcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class SkiDAO {

	public void insert(String name, String tel) {
		//JDBC4단계
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sunday";
			String user = "root";
			String pw = "fender601";
			Connection con 
				= DriverManager.getConnection(url, user, pw);
			String sql = "insert into ski values ( ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.executeUpdate();
			ps.close();
			con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
