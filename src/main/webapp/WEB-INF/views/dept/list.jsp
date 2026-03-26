<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서 리스트</h2>
	
	<div>
		<a href="./create">부서등록</a>
	</div>
	
	<div>
		<table>
			<thead>
				<tr>
					<th>DEPARTMENT_ID</th>
					<th>DEPARTMENT_NAME</th>
					<th>MANAGER_ID</th>
					<th>LOCATION_ID</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d">
					<tr>
						<td>${d.departmentId}</td>
						<td><a href="./detail?departmentId=${d.departmentId}">${d.departmentName}</a></td>
						
					</tr>
					<!-- 
					getter의 이름 : getter 메서드에서
					get을 빼고 () 빼고 
					나온 결과물의 첫 글자를 소문자로 바꾼 
					ex) getName () => name
					-->  
				
					
						
					
			
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</body>
</html>