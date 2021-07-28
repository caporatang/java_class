<%@page import="shop.dto.회원bag"%>
<%@page import="shop.db.회원DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String id = request.getParameter("id");
    	// DB처리하는 DAO에게 주면서 탈퇴하는 sql문을 만들어서 전송
	
    	//가방 만들어서 넣자
		회원bag bag = new 회원bag();
    	bag.setId(id);
    	
    	회원DAO da = new 회원DAO();
    	da.delete(bag);
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
delete 수행 완료
</body>
</html>