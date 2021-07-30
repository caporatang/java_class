<%@page import="Product.productDAO"%>
<%@page import="java.awt.FileDialog"%>
<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%
productDAO dao = new productDAO();

ArrayList<ProductDTO> list = dao.read();


//ArrayList<ProductDTO> list = dao.read("M4578");

//String productNum = list.get(0).getProductNum();
//String productPic = list.get(0).getProductPic();
//String productName = list.get(0).getProductName();
//int productPrice = list.get(0).getProductPrice();
//String productWeight = list.get(0).getProductWeight();
//String productOrigin = list.get(0).getProductOrigin();

//ArrayList<ProductDTO> list2 = dao.read("M1578");

//String productNum2 = list.get(0).getProductNum();
//String productPic2 = list.get(0).getProductPic();
//String productName2 = list.get(0).getProductName();
//int productPrice2 = list.get(0).getProductPrice();
//String productWeight2 = list.get(0).getProductWeight();
//String productOrigin2 = list.get(0).getProductOrigin();

%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="css/productMain.css"> -->
</head>
<body>
<%-- 	
	<tr>
	<td rowspan="6"><img width="300px" height="300px"
		src="img/<%=list2.get(0).getProductPic()%>"></td>
	<td>상품번호 : <%=productNum2%></td>
	<td><%=productName2%></td>
	<td><%=productPrice2%></td>
	</tr>

</table> --%>


<%
for (int i = 0; i<list.size(); i++){
	ProductDTO dto = list.get(i);
	

%>

<%=dto.getProductNum() %> <br>
<a href = "http://localhost:8889/project1st/kMeetInfo1.jsp?productNum=<%=dto.getProductNum() %>">
<img width="300px" height="300px"
		src="img/<%=dto.getProductPic()%>"></a><br>
<%=dto.getProductName() %><br>
<%=dto.getProductPrice() %><br>
<%=dto.getProductWeight() %><br>
<%=dto.getProductOrigin() %><br>
<% }%>




</body>
</html>