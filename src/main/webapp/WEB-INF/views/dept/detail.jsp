<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
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
				<span class="text-gradient d-inline">부서 상세</span>
			</h1>
		</div>
		<div class="row gx-5 justify-content-center">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>DEPARTMENT_ID</th>
						<th>DEPARTMENT_NAME</th>
						<th>MANAGER_ID</th>
						<th>LOCATION_ID</th>
					</tr>
				</thead>
				<tbody>
					
						<tr>
							<td>${detail.departmentId}</td>
							<td>${detail.departmentName}</td>
							<td>${detail.managerId}</td>
							<td>${detail.locationId}</td>
						</tr>
					
				</tbody>
			</table>
		</div>

		<a class="btn btn-primary" role="button" href="./update?departmentId=${detail.departmentId}">수정</a> 
		<a class="btn btn-danger" role="button" href="./delete?departmentId=${detail.departmentId}">삭제</a>

		<!--  
		<form action="./delete" method="get">
			<input type="hidden" name="departmentId" value="${detail.departmentId}">
			<button>DELETE</button>
		</form>
		-->

	</div>
</body>
</html>