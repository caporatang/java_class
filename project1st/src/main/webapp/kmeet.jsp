<%@page import="Product.productDAO"%>
<%@page import="java.awt.FileDialog"%>
<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%
ProductDTO dto = new ProductDTO();
productDAO dao = new productDAO();

ArrayList<ProductDTO> list = dao.read("M4578");

String productNum = list.get(0).getProductNum();
String productPic = list.get(0).getProductPic();
String productName = list.get(0).getProductName();
int productPrice = list.get(0).getProductPrice();
String productWeight = list.get(0).getProductWeight();
String productOrigin = list.get(0).getProductOrigin();
%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/productMain.css">
</head>
<body>

	
	<%=productNum%>
	<img width="200px" height="200px"
		src="img/<%=list.get(0).getProductPic()%>">
	<%=productName%>
	<%=productPrice%>
	<%=productWeight%>
	<%=productOrigin%>



	<hr>

	<%=productNum%>
	<img width="200px" height="200px"
		src="img/<%=list.get(0).getProductPic()%>">
	<%=productName%>
	<%=productPrice%>
	<%=productWeight%>
	<%=productOrigin%>
</body>
</html>