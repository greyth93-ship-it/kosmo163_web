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
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<!-- nav -->
		<c:import url="/WEB-INF/views/temp/nav.jsp">
		</c:import>
		<section class="py-5">
			<div class="container px-5 mb-5">
				<div class="text-center mb-5">
					<h1 class="display-5 fw-bolder mb-0">
						<span class="text-gradient d-inline">부서 리스트</span>
					</h1>
				</div>

				<div class="row gx-5 justify-content-center">
					<div>
						<table class="table table-bordered">
							<thead>
								<tr>
									<th>DEPARTMENT_ID</th>
									<th>DEPARTMENT_NAME</th>
									<!--  
									<th>MANAGER_ID</th>
									<th>LOCATION_ID</th>
									-->
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${requestScope.list}" var="d">
									<tr>
										<td><a href="./detail?departmentId=${d.departmentId}">${pageScope.d.departmentId}</a></td>
										<td>${d.departmentName}</td>
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
					
					<a class="btn btn-primary" href="./create" role="button">부서 등록 하기</a>
				</div>
			</div>
		</section>
	</main>
	<!-- footer -->
	<c:import url="/WEB-INF/views/temp/footer.jsp">
	</c:import>
</body>
</html>