<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>





<%
productDAO dao = new productDAO();

ArrayList<ProductDTO> list = dao.readA();
%>






<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<Link rel="stylesheet" href="css/productMain.css">
<link rel="stylesheet" href="css/reset.css">
</head>
<body class="container">

	<%
	for (int i = 0; i < list.size(); i++) {
		ProductDTO dto = list.get(i);
	%>



	<ul>

		<li class="list">
			<a href="http://localhost:8889/project1st/kMeetInfo<%=i%>.jsp?id=<%=dto.getProductNum()%>">
				<div class="img_box">
					<img width="250px" height="250px"
						src="img/<%=dto.getProductPic()%>" alt="">
				</div>
				<div class="text_box">
					<p><%=dto.getProductName()%></p>
					<span><%=dto.getProductPrice()%>원</span>
				</div>
		</a></li>

	</ul>

	<%
	}
	%>
	<!-- dto for end -->

</body>
</html>