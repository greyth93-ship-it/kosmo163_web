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
						<span class="text-gradient d-inline">국가 리스트</span>
					</h1>
				</div>

				<div class="row gx-5 justify-content-center">
					<table class="table table-bordered">
						<thead>
							<tr>
								<th>COUNTY_ID</th>
								<th>COUNTY_NAME</th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="d">
								<tr>
									<td><a href="/country/detail?countryId=${d.countryId}">${d.countryId}</td>
									<td>${d.countryName}</a></td>
			
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</section>
	</main>
	<!-- footer -->
	<c:import url="/WEB-INF/views/temp/footer.jsp">
	</c:import>
</body>
</html>