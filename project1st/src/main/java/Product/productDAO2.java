package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class productDAO2 {

	
	public void create(String num, String pic) {
	
		// 받아온 bag을 get을 이용해서 꺼낸다.
//		bag.getTitle()
		

		 try {
			//자바와 db연결하는 프로그램(JDBC) 순서
			  //1. jdbc connector설정
			  Class.forName("com.mysql.jdbc.Driver");
			  System.out.println("1. connector연결 성공!!!");
			  
			  //2. java에서 db로 연결: 
			  //   연결할 주소url(ip, port, db명), username, password
			  String url = "jdbc:mysql://localhost:3306/Makgeolli";
			  String username = "root";
			  String password = "fender601";
			  Connection con = DriverManager.getConnection(url, username, password);
			  System.out.println("2. listup db연결 성공!!!");
			  
			  //3. sql문을 만든다.
			  String sql = "insert into listup values (?, ?, ?, ?, ?, ?)";
			  //String sql = "delete from member where id = 'win'";
			  //PrepareStatment : sql을 나타내는 부품.
			  //부품을 램에 넣어놓은 주소만 잇으면 됨.
			  //ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
			  PreparedStatement ps = con.prepareStatement(sql);
			  //ps.setString(1, productNum);
			  //ps.setString(2, productPic);
			  //ps.setString(3, dt.getProductName());
			//  ps.setInt(4, dt.getProductPrice());
			//  ps.setString(5, dt.getProductWeight());
			 // ps.setString(6, dt.getProductOrigin());
			  
			  System.out.println("3. sql문 생성 성공!!!");
			  
			  //4. sql문을 mysql로 전송한다.
			  int result = ps.executeUpdate();
			  System.out.println("4. sql문 전송 전송");
			  System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
				System.out.println("1번 에러 >> 드라이버 없음.!!!!!");

				e.printStackTrace();
		} catch (SQLException e) { // 2-4단계 
			System.out.println("2-4번 에러 >> DB관련 처리로 에러 발생함..!!");
			e.printStackTrace();
		}
		
		
		
	} //create
	
	public ArrayList<ProductDTO> read(String pnum) throws Exception {
		//자바와 db연결하는 프로그램(JDBC) 순서
		//1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		//2. java에서 db로 연결: 
		//   연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/Makgeolli";
		String username = "root";
		String password = "fender601";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. listup db연결 성공!!!");
		
		//3. sql문을 만든다.
		String sql = "select * from listup where productNum = ?";
		//PrepareStatment : sql을 나타내는 부품.
		//부품을 램에 넣어놓은 주소만 잇으면 됨.
		//ps부품을 2단계에서 획득한 con부품이 만들어서 return.!
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pnum);
		System.out.println("3. sql문 생성 성공!!!");
		
		//4. sql문을 mysql로 전송한다.
		ResultSet rs = ps.executeQuery();
		
		System.out.println("4. sql문 전송 전송");
		System.out.println();
		ProductDTO dt = new ProductDTO();
		ArrayList<ProductDTO> arr = new ArrayList<ProductDTO>();
		
		if (rs.next()) {
			String productNum = rs.getString(1);
			String productPic = rs.getString(2);
			String productName = rs.getString(3);
			int productPrice = rs.getInt(4);
			String productWeight = rs.getString(5);
			String productOrigin = rs.getString(6);
			
			
			dt.setProductNum(productNum);
			dt.setProductPic(productPic);
			dt.setProductName(productName);
			dt.setProductPrice(productPrice);
			dt.setProductWeight(productWeight);
			dt.setProductOrigin(productOrigin);
			
			arr.add(dt);
		}
		return arr;
		
		

		
		
		
		
	}//delete end

	
	
}//class