<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
productDAO dao = new productDAO();
ArrayList<ProductDTO> list = dao.read("M4178");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일상미소 차돌박이(냉동)</title>
<Link rel="stylesheet" href="css/default.css">
<Link rel="stylesheet" href="css/infoStyle.css">
<link rel="stylesheet" href="css/reset.css">
<script type="text/javascript">
	var count = 1;

	function add() {
		num = document.getElementById("num");
		count++;
		count2 = parseInt(count);
		num.value = count2;

		if (num.value > 9) {
			result = '1회 구매갯수 제한은 9개입니다'
			num.value = 9
			alert(result)
		}
	}
	function minus() {
		num = document.getElementById("num");
		count--;
		count2 = parseInt(count);
		num.value = count2;

		if (num.value <= 0) {
			result = '1개 이상부터 구매 가능합니다'
			num.value = 1
			alert(result)
		}
	}
	
	
	function addBasket() {
		alert('장바구니에 물건을 담았습니다.')
	}
</script>
</head>
<body class="container">
	<div class="product_view">
		<h2><%=list.get(0).getProductName()%></h2>
		<table>
			<%-- <tr>
				<td rowspan="6"><img width="500px" height="500px"
					src="img/<%=list.get(0).getProductPic()%>"></td>
			</tr> --%>
			<tr>
				<th>상품번호</th>
				<td><%=list.get(0).getProductNum()%></td>
			</tr>
			<tr>
				<th>가격</th>
				<td class="price"><%=list.get(0).getProductPrice()%>원</td>
			</tr>
			<tr>
				<th>제품 중량</th>
				<td><%=list.get(0).getProductWeight()%></td>
			</tr>
			<tr>
				<th>원산지</th>
				<td><%=list.get(0).getProductOrigin()%></td>
			</tr>
			<tr>
				<th>구매수량</th>
				<td>
					<div class="length">
						<input type="number" id="num" min="1" value="1"> 
							<a href="#a" id="ad" onclick="add()">증가</a>
							<a href="#a" id="mi" onclick="minus()">감소</a>
					</div>
				</td>
			</tr>
			<tr>
				<th>결제 금액</th>
				<td class="total">9500원</td>
			</tr>
		</table>
		<div class="img">
			<img src="img/<%=list.get(0).getProductPic()%>">
		</div>
		<div class="btns">
			<a href="#a" class="btn1" onclick="addBasket()">장바구니</a>
			<a href="#a" class="btn2">구매하기</a>
		</div>
	</div>
</body>
</html>