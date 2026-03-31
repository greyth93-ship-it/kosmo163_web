<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> login </h2>
	
	<form action="./login" method="post">
		<div>
			<label>ID</label>
			<input type="text" placeholder= "ID를 입력하세요" name="employeeId">
		</div>
		<div>
			<label>PW</label>
			<input type="password" placeholder="PW를 입력하세요" name="password">
		</div>
		<div>
			<button type="submit">LOGIN</button>
		</div>
	</form>
</body>
</html>