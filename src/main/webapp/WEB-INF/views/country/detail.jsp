<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body>
	<div class="container px-5 mb-5">
		<div class="text-center mb-5">
			<h1 class="display-5 fw-bolder mb-0">
				<span class="text-gradient d-inline">국가 상세</span>
			</h1>
		</div>
		<div class="row gx-5 justify-content-center">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>COUNTRY_ID</th>
							<th>COUNTRY_NAME</th>
							<th>REGION_ID</th>
						</tr>
					</thead>
					<tbody>
						
							<tr>
								<td>${detail.countryId}</td>
								<td>${detail.countryName}</td>
								<td>${detail.regionId}</td>
							</tr>
						
					</tbody>
				</table>
			</div>
	
	
			<form action="/country/delete" method="get">
				<input type="hidden" name="countryId" value="${detail.countryId}">
				<button class="btn btn-danger">DELETE</button>
			</form>
	</div>
</body>
</html>