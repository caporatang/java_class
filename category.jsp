<%@page import="Product.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Product.productDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
productDAO dao = new productDAO();
String id = request.getParameter("id");
ArrayList<ProductDTO> list = dao.category(id);
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
    <Link rel="stylesheet" href="css/productMain.css">
    <!-- jquery CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="js/index.js"></script>
    <title>막컬리::매일매일 신선한 장보기</title>
</head>
<body>
    <div id="wrap">
    	<!-- header 건들지마시오 -->
        <jsp:include page="header.jsp"></jsp:include>
        <div id="contents">
			<div class="container row">
				<ul class="pList">
				<%
				for (int i = 0; i < list.size(); i++) {
					ProductDTO dto = list.get(i);
				%>
					<li class="list">
						<a href="kMeetInfo0.jsp?id=<%= dto.getProductNum()%>"><img width="250px" height="250px"
						src="img/<%=dto.getProductPic()%>" alt=""></a>
						
						<div class="text_box">
							<p><%=dto.getProductName()%></p>
							<span><%=dto.getProductPrice()%>원</span>
						</div>
					</li>
				<%}%>
				</ul>
				<!-- dto for end -->
			
			</div>
        </div>
        <!-- footer 건들지마시오 -->
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</body>
</html>


