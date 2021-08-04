<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
//글자수 체크
alert('tern project')
function idCheck() {
	// 1.id에 입력한 값 가지고 와야함
	// 1-1 id가"id"인 input 태그를 먼저 찾아야한다.
	idTag = document.getElementById("id") //<input name="id" id="id" value="test"> 
	// 1-2 그 태그내에 value값을 가지고 오면 된다.
	idValue = idTag.value; // value="test" 추출하기
	alert('id is ' + idValue)
	
	
	// 2. 값의 글자수를 세야한다.
	alert('id 길이>> ' + idValue.length)
	// 3. 5글자 이상이 아닌 경우, 메시지를 보여주어야 한다.
	result = "";
	if (idValue.length>= 5){
		result = "5글자 이상입니다. 유효합니다"
	}else {
		result = "5글자 미만입니다. 재입력해주세요 ."
	}
	divTag=document.getElementById("result"); // <div id ="result"></div>
	divTag.innerHTML = result; // tag , text 둘다 넣을수있다.
	
}
function pwCheck() {
	pw1Tag = document.getElementById("pw1") // pw1태그 갖고오기 pw1 = id 
	pw2Tag = document.getElementById("pw2") // pw2태그 갖고오기 pw2 = id
	
	pw1Value = pw1Tag.value; 
	pw2Value = pw1Tag.value; 
	
	result = "불일치<img src = img/no.jpeg>"
	if (pw1Value == pw2Value){
		result ="일치 <img src=img/ok.jpeg>"
	}
	resultTag = document.getElementById("result")
	resultTag.innerHTML =result;

	pw1Tag.value = ""
	pw2Tag.value = ""
}
</script>
</head>
<body>
<h3>자바 스크립트 테스트</h3>
<hr>
아이디:  <input name="id" id="id" value="test"> <button onclick="idCheck()" id="b1" style="color:blue; background:pink; width:100px; height:20px">글자수 체크</button><br>
패스워드 :  <input name="pw1" id="pw1" value="pass" > <br>
패스워드2 :  <input name="pw2" id="pw2"> <button onclick = "pwCheck()" id="b3" style="color:white; background:blue; width:100px; height:20px">패스워드 동일 여부 체크</button><br>
<div id="result" style="color:red; background:yellow; width:500px; height:50px; font-size:30px"></div>



</body>
</html>