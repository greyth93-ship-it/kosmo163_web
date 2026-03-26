<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>나라 등록 페이지</h3>
	
	<form action="/country/create" method="post">
		<div>
			<label>COUNTRY_ID</label>
			<input type="text" name="countryId">
		</div>
		
		<div>
			<label>COUNTRY_NAME</label>
			<input type="text" name="countryName">
		</div>
		
		<div>
		<label>REGION_ID</label>
		<input type="text" name="regionId">
		</div>
		<button>create</button>
	
	</form>
	
</body>
</html>