<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stone Detail</title>
</head>
<body>
	<h1>${name} 님의 탄생석은?</h1>
	<div class="desc-box flex">
		<img src="${birthstone.imageURL}" />
		<div class="desc-item flex">
			<strong>${birthstone.imageURL}</strong>
			<p>${birthstone.description}</p>
		</div>
				
	</div>
</body>
</html>