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
	<h2>나라 리스트</h2>
	<div>
		<table>
			<thead>
				<tr>
					<td>COUNTY_ID</td>
					<td>COUNTY_NAME</td>
					<td>REGION_ID</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d" >
					<tr>
						<td>${d.countryId}</td>
						<td>${d.countryName}</td>
						<td>${d.regionId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>