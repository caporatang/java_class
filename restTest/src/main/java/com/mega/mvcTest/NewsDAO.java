package com.mega.mvcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class NewsDAO {
	
	public void newsInsert(String title, String link, String date) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sunday";
			String user = "root";
			String pw = "fender601";
			Connection con 
				= DriverManager.getConnection(url, user, pw);
			String sql = "insert into news values ( ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, link);
			ps.setString(3, date);
			ps.executeUpdate();
			ps.close();
			con.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
