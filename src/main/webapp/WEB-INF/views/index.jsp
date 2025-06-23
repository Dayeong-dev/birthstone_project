<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
<link rel="stylesheet" href="/css/style.css">
<script src="https://cdn.jsdelivr.net/npm/particles.js"></script>
</head>
<body>
	<div id="particles-js" style="position:fixed; top:0; left:0; width:100%; height:100%; z-index:-1;"></div>
	<script src="/js/particle.js"></script>
	<div class="inner main-inner">
		<h1>Birth Stone</h1>
		<form class="main-form flex" action="" method="post">
			<div class="main-form-item">
				<label for="name">이름</label>
				<input type="text" name="name">
			</div>
			<div class="main-form-item">
				<label for="name">이름</label>
				<input type="text" name="name">
			</div>
			
			<button type="submit">확인</button>
		</form>
	</div>
</body>	
</html>