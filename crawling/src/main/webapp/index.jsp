<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>주식 정보 시스템입니다.</h1>
<hr>
<form action="crawl.do">
code: <input type="text" name="code"><br>
<button>code로 네이버에서 크롤링하여 db에 저장</button>
</form>




<hr>
<form action="create.do">
code : <input type="text" name="code"><br>
company : <input type="text" name="company"><br>
today : <input type="text" name="today"><br>
yesterday : <input type="text" name="yesterday"><br>
high : <input type="text" name="high"><br>
<button>주식정보</button>
</form>


</body>
</html>