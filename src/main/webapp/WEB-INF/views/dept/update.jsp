<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서 정보 수정</h2>
	<form action="./update" method="post">
		<input type="hidden" name="departmentId" value="${dto.departmentId}">
		<div>
			<label>DEPARTMENT_NAME</label>
			<!-- 꺼내서 DAO로 보낸다 보낼 때 DTO에 담아서 보낸 
				DTO의 setter의 이름과 동일하게 -->
			<input type="text" value="${dto.departmentName}" placeholder= "부서명" name="departmentName">
		</div>
		
		<div>
			<label>MANAGER_ID</label>
			<input type="text" value="${dto.managerId}" placeholder="숫자만 입력" name="managerId">
		</div>
		
		<div>
			<label>LOCATION_ID</label>
			<input type="text" value="${dto.locationId}" name="locationId">
		</div>
		
		<button type="submit">button</button>
		<input type="submit" value="UPDATE">		
		<input type="button" value="등록">
		<input type="reset" value="reset">
	</form>
</body>
</html>