<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
productDAO dao = new productDAO();
String id = request.getParameter("id");
ArrayList<ProductDTO> list = dao.read(id);
%>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- icon Style -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <!-- swiper Style -->
    <link rel="stylesheet"href="https://unpkg.com/swiper/swiper-bundle.min.css"/>
    <!-- common Style -->
    <link rel="stylesheet" href="css/style.css">
    <Link rel="stylesheet" href="css/default.css">
	<Link rel="stylesheet" href="css/infoStyle.css">
    <!-- jquery CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/index.js"></script>
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
		<script type="text/javascript">
		$(function(){
		
			function change_href() {
				var count = $('#num').val();
				var address= "basket.jsp?id=<%=list.get(0).getProductNum()%>&name=<%=list.get(0).getProductName()%>&price=<%=list.get(0).getProductPrice()%>&count="+count;
				console.log(address);
				$('.btns>a').attr("href", address);
			}
			
			$('#ad').click(function(e){
				e.preventDefault();
				change_href();
			});
			
			$('#mi').click(function(e){
				e.preventDefault();
				change_href();
			});
		
		})
		</script>
				
		<title><%=list.get(0).getProductName()%></title>
</head>
<body>
    <div id="wrap">
    	<!-- header 건들지마시오 -->
        <jsp:include page="header.jsp"></jsp:include>
        <div id="contents">
			<div class="container">
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
										<a href="#" id="ad" onclick="add()">증가</a>
										<a href="#" id="mi" onclick="minus()">감소</a>
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
						<a href="" class="btn1" onclick="addBasket()">장바구니</a>
						<a href="#a" class="btn2">구매하기</a>
					</div>
				</div>
			</div>
        </div>
        <!-- footer 건들지마시오 -->
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</body>
</html>


