<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stone Detail</title>
<link rel="stylesheet" href="/css/style.css">
<script src="https://cdn.jsdelivr.net/npm/particles.js"></script>
</head>
<body>
	<div id="particles-js" style="position:fixed; top:0; left:0; width:100%; height:100%; z-index:-1;"></div>
	<div class="inner main-inner">
		<h1>${name} 님의 탄생석은?</h1>
		<div class="desc-box flex">
			<img src="${birthstone.imageURL}"/>
			<div class="desc-item flex">
				<strong>${birth}월, ${birthstone.name}</strong>
				<p>${birthstone.description}</p>
			</div>
		</div>
	</div>
	<a class="list-button" href="/">메인화면</a>
	<script src="/js/particle.js"></script>
	
</body>
</html>