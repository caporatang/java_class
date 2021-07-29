<%@page import="Product.ProductDTO"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    
    
    <%
    
    String productNum = request.getParameter("productNum");
    String productPic = request.getParameter("kmeet2.png");
   	String productName = request.getParameter("productName");
   	String productPrice = request.getParameter("productPrice");
   	String productWeight = request.getParameter("productWeight");
    String productOrigin = request.getParameter("productOrigin");
    
    
    
  	int productPrice2 = Integer.parseInt(productPrice);
   ProductDTO dto = new ProductDTO();
   dto.setProductNum(productNum);
   dto.setProductPic(productPic);
   dto.setProductName(productName);
   dto.setProductPrice(productPrice2);
   dto.setProductWeight(productWeight);
   dto.setProductOrigin(productOrigin);
    
    
    
    
    productDAO dao = new productDAO();
	dao.create(dto);  	
    		
    
    
    
    %>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>