<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
<script src="https://cdn.jsdelivr.net/npm/particles.js"></script>
</head>
<body>
	<div id="particles-js" style="position:fixed; top:0; left:0; width:100%; height:100%; z-index:-1;"></div>
	<div class="inner list-inner">
		<h1>탄생석 목록</h1>
		<div class="stone-wrap">
			<c:forEach var="stone" items="${birthstoneList}" varStatus="status">
		        <div class="stoneItem-box flex" onclick="stoneDetail(${stone.month})">
		            <img src="${stone.imageURL}" alt="탄생석 이미지">
		            <strong>${stone.month}월, ${stone.name}</strong>
		        </div>
		    </c:forEach>
		</div>
	</div>
	<a class="list-button" href="/">메인화면</a>
	<script src="/js/particle.js"></script>
	<script>
	function stoneDetail(month){
		location.href="/birthstone/detail?month=" + month;
	}
	</script>
</body>
</html>