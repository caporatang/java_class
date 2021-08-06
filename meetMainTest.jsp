<%@page import="java.awt.FileDialog"%>
<%@page import="Product.productDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@page import="Product.ProductDTO"%>
<%@page import="javax.swing.JOptionPane"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
        
      
            
            
    
        	
        	
        %>
    
    
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="total">
		<div id="top">
			
			
		</div>
		<div id="top2">
		


		</div>
		<div id="center">
			<form action="test2.jsp">
				상품번호: <input name="productNum"><br> 
				사진: <input type = "file" name ="kmeet2.png"><br>
				상품명: <input name="productName"><br> 
				금액: <input name="productPrice"><br>
				상품 중량: <input name="productWeight"><br>
				원산지: <input name="productOrigin"><br>
				<button>insert 처리</button>
			</form>
			
			
			<form action="meetAll.jsp">
			<button> 정육 계란 모두 보기 </button>			
			</form>
			<br>
			<form action="kmeet.jsp">
				<button>국내산 소고기</button>
			<!-- file : <input type ="file" name= -->
			</form>
			<br>
				<form action="iMeet.jsp">
				<button>수입산 소고기</button>
			<!-- file : <input type ="file" name= -->
			</form>
			<br>
	<form action="pMeet.jsp">
				<button>돼지고기</button>
			<!-- file : <input type ="file" name= -->
			</form> 
		</div>
	</div>


</body>
</html>