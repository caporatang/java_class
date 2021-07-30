<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    productDAO dao = new productDAO();
    ArrayList<ProductDTO> list = dao.readI();
    
    
   
    
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int i = 0; i<list.size(); i++){
	ProductDTO dto = list.get(i);
	

%>

<%=dto.getProductNum() %> <br>
<img width="300px" height="300px"
		src="img/<%=dto.getProductPic()%>"><br>
<%=dto.getProductName() %><br>
<%=dto.getProductPrice() %><br>
<%=dto.getProductWeight() %><br>
<%=dto.getProductOrigin() %><br>
<% }%>
</body>
</html>