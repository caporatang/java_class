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
<Link rel="stylesheet" href="css/productMain.css">
<!-- <link rel="stylesheet" href="css/productMain.css"> -->
</head>
<body class="container">
	<%
	for (int i = 0; i < list.size(); i++) {
		ProductDTO dto = list.get(i);
	%>
	<ul class = "pList">
		<li class="list1">
				<div class="img_box">
					<img width="250px" height="250px"
						src="img/<%=dto.getProductPic()%>" alt="">
				</div>
				<div class="text_box">
					<p><%=dto.getProductName()%></p>
					<span class="pPrice"><%=dto.getProductPrice()%>원</span>
				</div>
		</li>
	</ul>
	<%}%>
	<!-- dto for end -->
</body>
</html>



