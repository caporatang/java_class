<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
   	<%
   	productDAO dao = new productDAO();
   	ArrayList<ProductDTO> dao2= dao.read("M4578");
   	
   	
   	
   	%>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국내산 소고기</title>
</head>
<body>
<%= dao2.get(0).getProductNum() %><br>
<img width="300px" height="300px"
		src="img/<%=dao2.get(0).getProductPic() %>"><br>
<%= dao2.get(0).getProductName() %> 
<%= dao2.get(0).getProductPrice() %>
<%= dao2.get(0).getProductWeight() %>
<%= dao2.get(0).getProductOrigin() %>






</body>
</html>