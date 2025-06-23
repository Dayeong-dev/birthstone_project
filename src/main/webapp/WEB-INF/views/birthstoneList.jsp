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
	<div class="inner main-inner">
		<h1>birthstone List</h1>
		<div class="stone-wrap">
			<c:forEach var="stone" items="${topFiveAmount}" varStatus="status">
		        <div class="stoneItem-box" onclick="stoneDetail(${book.book_id})">
		            <img src="${book.image_url}" alt="책이미지">
		            <strong>${book.title}</strong>
		            <p>${book.writer}</p>
		        </div>
		    </c:forEach>
		</div>
	</div>
	<script src="/js/particle.js"></script>
</body>
</html>