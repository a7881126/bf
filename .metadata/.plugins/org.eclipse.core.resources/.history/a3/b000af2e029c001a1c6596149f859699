<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8">
<title>销售信息</title>
<link rel="stylesheet" href="/WXservice/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div>
			<img src="/WXservice/images/header/logo.png"
				class="img-responsive img-circle" alt="Cinque Terre" alt="logo" />
		</div>
	<h3 class="text-center">${InformationStatisticss[0].compname}</h3>
		<div class="table-responsive">
		
			<!-- 设置自动匹配设备 -->
			<table class="table table-hover">
				<thead>
					<tr>
						<th>年</th>
						<th>月</th>
						<th>订单数</th>
						<th>销售金额</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${InformationStatisticss}"
						var="InformationStatistics">
						<tr>
							<td>${InformationStatistics.year}</td>
							<td>${InformationStatistics.month}</td>
							<td>${InformationStatistics.count}</td>
							<td>${InformationStatistics.factrorySettlementPrice}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>


	</div>

	<script src="/WXservice/jquery/jquery.min.js"></script>
</body>
</html>