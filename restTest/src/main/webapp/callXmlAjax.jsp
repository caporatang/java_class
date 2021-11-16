<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(function() {
		$.ajax({
			url : "resources/text/rank.xml",
			success : function(xmlResult) {
				alert(xmlResult)
				list = $(xmlResult).find('rank')
				//alert(list.length + "개" + $(list[0]).find('name').text())

				/* for(var i = 0; i < list.length; i++){
				console.log($(list[i]).find('name').text())
				console.log($(list[i]).find('tel').text())
				} */

				/* $(list).each(function() {
				$('div').append.($(this).find('name').text()+ "<br>")
				$('div').append.($(this).find('tel').text() + "<br>")
				}) */

				$(list).each(function(i, x) {
					//$('div').append($(x).find('name').text() + "<br>")
					//$('div').append($(x).find('tel').text() + "<br>")
					n = $(x).find('name').text()
					t = $(x).find('tel').text()
					$.ajax({
						url : "dbGo",
						data : {
							name : n,
							tel : t
						},
						success : function() {
							console.log("db insert성공")
						}
					}) // ajax end
				})
			}
		}) // ajax end
	}) // anonymous펑션 end
</script>
</head>
<body>
	<div style="background: yellow; color: blue; font-size: 20;">
		divdiv<br>
	</div>
</body>
</html>