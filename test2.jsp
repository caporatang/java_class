<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var count = 1;
	function add() {
		var $num = document.getElementById("num");
		count++;
		var count2 = parseInt(count);
		$num.value = count2;
	}
	function minus() {
		var $num = document.getElementById("num");
		count--;
		var count2 = parseInt(count);
		$num.value = count2;
	}
</script>

</head>
<body>
	<div class="length">
	<input type="number" id="num" min="1" value="1" >
	 <a href="#a" id = "ad" onclick="add()">증가</a>
	 <a href="#a" id = "mi" onclick="minus()">감소</a>
	</div>
	
</body>
</html>