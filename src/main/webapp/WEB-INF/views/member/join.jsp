<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Join </h2>
	<form action="./join" method="post">
		<div>
			<label>ID</label>
			<input type="text" placeholder="ID를 입력하세요" name="id">
		</div>
		<div>
			<label>PW</label>
			<input type="password" placeholder="PW를 입력하세요" name="pw">
		</div>
		<div>
			<label>NAME</label>
			<input type="text" placeholder="이름을 입력하세요" name="name">
		</div>
		<div>
			<label>EMAIL</label>
			<input type="email" placeholder="이메일을 입력하세요" name="email">
		</div>
		<div>
			<button>Join complete</button>
		</div>
</body>
</html>