<%@page import="main.MemberDAO"%>
<%@page import="main.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String email = request.getParameter("email");
    	String tel = request.getParameter("tel");
    	String address = request.getParameter("address");
    	String birthday = request.getParameter("birthday");
    	String gender = request.getParameter("gender");
    	
    	MemberDTO dto = new MemberDTO();
    	dto.setId(id);
    	dto.setPw(pw);
    	dto.setName(name);
    	dto.setEmail(email);
    	dto.setTel(tel);
    	dto.setAddress(address);
    	dto.setBirthday(birthday);
    	dto.setGender(gender);
    	
    	MemberDAO dao = new MemberDAO();
    	dao.create(dto);
    	
   	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 가입 완료</h3>
	<hr>
	<p><%= id %>님의 가입이 완료되었습니다.</p>
</body>
</html>