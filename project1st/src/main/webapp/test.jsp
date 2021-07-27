<%@page import="Product.productDAO"%>
<%@page import="Product.productDTO"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    String productNum = JOptionPane.showInputDialog("고기");
    String productPic = JOptionPane.showInputDialog("사");
    String productName = JOptionPane.showInputDialog("상품명");
   	String productPrice = JOptionPane.showInputDialog("가격");
    String productWeight = JOptionPane.showInputDialog("중량");
    String productOrigin = JOptionPane.showInputDialog("원산지");
    
    
    
    productDTO dt = new productDTO();
	int price = Integer.parseInt(productPrice);
    dt.setProductName(productName);
   	dt.setProductPic(productPic);
	dt.setProductNum(productNum);
	dt.setProductOrigin(productOrigin);
	dt.setProductPrice(productPrice);
	dt.setProductWeight(productWeight);

	productDAO da = new productDAO();
	da.create(dt);
	
	
    

    
    
    %>
    
    
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전송 완료
</body>
</html>