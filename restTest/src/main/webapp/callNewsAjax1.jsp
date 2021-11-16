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
	$('#b1').click(function name() {
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.thesportstimes.co.kr%2Frss%2FS1N4.xml&api_key=c1bls1njcom6b4ne8rhqy4av0uiq1bvihizwth8m",
			data :{
			url : "http://www.thesportstimes.co.kr/rss/S1N4.xml",
			api_key : "c1bls1njcom6b4ne8rhqy4av0uiq1bvihizwth8m",
			count : 20
			},			
			success: function(doc) {
				alert(doc)
				// items목록을 가지고 와서, 개수 프린트
				// 반복문으로 전체를 프린트
				list = doc.items
				console.log("개수는" + list.length)
			
				
				 $(list).each(function(index, item) {
					 
				/* $('div').append("기사 제목: " + item.title + "<br>")
				$('div').append("날짜 : " + item.pubDate + "<br>")
				newsLink = "<a href=" + item.link + ">" + item.title + "</a>"
				$('div').append(newsLink + "<br>") */
				
				title = list[index].title
				link = list[index].link
				date = list[index].pubDate
				$.ajax({
					url : "newsGo",
					data : {
						title,
						link,
						date
					},
					success : function() {
						console.log("insert완료")
					}
				})
				
				}) 
		
			}
		}) // ajax end	
	})
}) // anonymous펑션 end
</script>
</head>
<body>
	<button id="b1">해축 뉴스를 가지고 오자 ~</button>
	<hr bgcolor="red">
	<div style="background: orange; font-size: 20;"></div>


</body>
</html>