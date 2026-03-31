<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Index Page YJ</h1>
		<a href="/comm/list">전달사항 리스트</a>
		
		
		<c:if test="${empty dto}">
		<a href="/member/join">Join</a>
		<a href="/member/login">Login</a>
		</c:if>
		
		
		<c:if test="${not empty dto}">
		<a href="/member/logout">Logout</a>
		<a href="/member/mypage">Mypage</a>
		
		</c:if>
		
	</body>
</html>

