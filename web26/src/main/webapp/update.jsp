<%@page import="shop.db.회원DAO"%>
<%@page import="shop.dto.회원bag2"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
    
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    
    
    회원bag2 bag = new 회원bag2();
    bag.setId(id);
    bag.setName(name);
    bag.setTel(tel);
    
    
    회원DAO da = new 회원DAO();
    da.update(bag);
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
업데이트 완료.
</body>
</html>