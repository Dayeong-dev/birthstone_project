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
		<form class="main-form flex" action="/birthstone/search" method="post">
			<div class="main-form-item">
				<label for="name">이름</label>
				<input type="text" name="name">
			</div>
			<div class="main-form-item">
				<label for="month">태어난 달</label>
				<select name="month">
			        <option value=1>1</option>
			        <option value=2>2</option>
			        <option value=3>3</option>
			        <option value=4>4</option>
			        <option value=5>5</option>
			        <option value=6>6</option>
			        <option value=7>7</option>
			        <option value=8>8</option>
			        <option value=9>9</option>
			        <option value=10>10</option>
			        <option value=11>11</option>
			        <option value=12>12</option>
			    </select>
			</div>
			
			<button type="submit">확인</button>
		</form>
	</div>
	
	<a class="list-button" href="/birthstone/all">탄생석 목록</a>
</body>	
</html>