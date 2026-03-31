<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Login </h2>
	<form action="./login" method="post">
		<div>
			<label>ID</label>
			<input type="text" placeholder="ID를 입력하세요" name="id">
		</div>
		<div>
			<label>PW</label>
			<input type="password" placeholder="PW를 입력하세요" name="pw">
		</div>
		<div>
			<button>LOGIN</button>
		</div>
</body>
</html>