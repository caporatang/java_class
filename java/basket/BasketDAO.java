package basket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class BasketDAO {
	Connection con;
	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	// 중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	// 파라메터, parameter
	
	public void setcart(BasketDTO DT) {
	try {
		String sql = "insert into basket values(BasketId.NEXTVAL,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, DT.getProductNum());
		ps.setString(2, DT.getProductId());
		ps.setInt(3, DT.getBasketId());
		ps.setString(4, DT.getAmount());
		
		ps.executeUpdate();
		
		con.close();
		
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	
	}
	
	
	
	public int create(BasketDTO DT) {
		int result =0;
		
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/makgeolli?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. Makgeolli db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "insert into basket(ProductId, ProductName, ProductPrice, Amount) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, DT.getProductId());
			ps.setString(2, DT.getProductName());
			ps.setInt(3, DT.getProductPrice());
			ps.setInt(4, DT.getAmount());
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public int  update(BasketDTO DT) {
		System.out.println("전달된 제품번호는 " + DT.getProductNum());
		System.out.println("전달된 주문자는 " + DT.getProductId());
		System.out.println("전달된 장바구니는 " + DT.getBasketId());
		System.out.println("전달된 수량은 " + DT.getAmount());
		int result =0;
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/makgeolli?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "fender601";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "update basket set BasketId =?, ProductId =? where Amount = ?"; // 아이디가 ?인걸 tel과 name으로 바꿔라
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, DT.getProductNum());
			ps.setString(2, DT.getProductId());
			ps.setInt(3, DT.getBasketId());
			ps.setString(4, DT.getAmount());
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			 result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
		}
		return result;
	
	}// update end
public int delete(BasketDTO DT) {
	System.out.println("전달된 제품번호는 " + DT.getProductNum());
	System.out.println("전달된 주문자는 " + DT.getProductId());
	System.out.println("전달된 장바구니는 " + DT.getBasketId());
	System.out.println("전달된 수량은 " + DT.getAmount());
	int result =0;
	try {
		// 자바와 db연결하는 프로그램(JDBC) 순서
		// 1. jdbc connector설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		// 2. java에서 db로 연결:
		// 연결할 주소url(ip, port, db명), username, password
		String url = "jdbc:mysql://localhost:3306/makgeolli?useUnicode=true&characterEncoding=utf8";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		// 3. sql문을 만든다.
		String sql = "delete from basket where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, DT.getBasketId());
		System.out.println("3. sql문 생성 성공!!!");
		// 4. sql문을 mysql로 전송한다.
		 result = ps.executeUpdate();
		System.out.println("4. sql문 전송 전송");
		System.out.println(result);
	} catch (ClassNotFoundException e) { // 1단계
		System.out.println("1번 에러>> 드라이버 없음.!!!!");
	} catch (SQLException e) { // 2-4단계
		System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
	}
	return result;
}
	public String[] read(BasketDTO dto) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1.connector 연결 성공!!");
		String url = "jdbc:mysql://localhost:3306/Makgeolli";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2.Makgeolli db연결 성공!!!");
		String sql = "select * from basket where id = ?,?,?,?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.ProductId);
		System.out.println("3.sql 생성  성공!!!!");
		ResultSet rs = ps.executeQuery();// true false
		System.out.println("4.SQL문 전송 성공!!!!!");
		System.out.println(rs.next());// 2번쓰면 안된다.
		String[] result = new String[4];
		// {"win", "win", "win", "win"}
		if (rs.next()) {
			// 테이블에 검색 결과가 있다라는 얘기
			String productNum = rs.getString(1);
			String productId = rs.getString(2);
			int amount = rs.getInt(3);
			int productPrice = rs.getInt(4);
			System.out.println(productNum + " " + productId + " " + amount + " " + productPrice);
			result[0] = productNum ;
			result[1] =  productId;
			result[2] = amount;
			result[4] = productPrice;
		}
		return result;
	}// read end
	
	
public ArrayList<BasketDTO> read () {
		
		//DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어주어야 한다.
		ArrayList<BasketDTO> list = new ArrayList<>();
		ResultSet rs = null; //지역변수는 항상 초기화 시켜줘야한다. //set은 집합, 모음이다.
		//메서드 안에서 선언된변수는 모두 지역변수이며 지역변수는 초기화를 해주어야 한다.
		  //회원Bag은 public뒤에 랑 같아야한다.
		try {
			// 3. sql문을 만든다.
			String sql = "select * from basket ";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
//			 result = ps.executeUpdate(); //CUD일 때만 사용한다.
			rs =ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
//			System.out.println("검색 결과는>> "+rs.next());
			while(rs.next()) {
				BasketDTO bag3 = new BasketDTO();
				System.out.println("검색결과가 있음.");
				//-----------------------------------------
				String ProductNum= rs.getString(1);
				String ProductId=rs.getString(2);
				int basketId1=rs.getInt(3);
				String Amount= rs.getString(4);
				
				bag3.setProductNum(ProductNum);
				bag3.setProductId(ProductId);
				bag3.setBasketId(basketId1);
				bag3.setAmount(Amount);
				
				
				
//				bag3.setProductNum(rs.getString(1));
//				bag3.setProductId(rs.getString(2));
//				bag3.setBasketId( rs.getInt(3));;
//				bag3.setAmount(rs.getString(4));
//				System.out.println(bag3);
				list.add(bag3);
				System.out.println(list.size());
			}
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!!");
			e.printStackTrace();
		}
		return list; // 결과값을 리턴해라 위치확인.
		
	}//read end.
	
}// class end