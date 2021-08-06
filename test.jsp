<%@page import="java.util.ArrayList"%>
<%@page import="main.ListUpDTO"%>
<%@page import="main.ListUpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    	ListUpDAO dao = new ListUpDAO();
        ListUpDTO dto = new ListUpDTO();
        
        ArrayList<ListUpDTO> list = dao.read("FB0029");
       /*  dao.read("F000011"); */

        String productNum = list.get(0).getProductNum();
        String productPic =  list.get(0).getProductPic();
        String productName =  list.get(0).getProductName();
        int productPrice =  list.get(0).getProductPrice();
        String productWeight =  list.get(0).getProductWeight();
        String productOrigin =  list.get(0).getProductOrigin();
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><%= productNum %></li>
		<li>
			<img alt="" src="<%= productPic %>">
		</li>
		<li><%= productName %></li>
		<li><%= productPrice %></li>
		<li><%= productWeight %></li>
		<li><%= productOrigin %></li>
	</ul>w
</body>
</html>