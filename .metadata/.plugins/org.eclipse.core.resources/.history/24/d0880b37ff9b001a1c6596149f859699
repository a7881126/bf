<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8">
<title>店面信息</title>
<link rel="stylesheet" href="/WXservice/css/bootstrap.min.css" />	
</head>

<body>

	<div class="container">
		<div>
			<img src="/WXservice/images/header/logo.png"
				class="img-responsive img-circle" alt="Cinque Terre" alt="logo" />
		</div>
		<table class="table table-hover">
			<thead>
					<tr>
						<th>店面列表</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${dealerShops}" var="dealerShop">
						<tr>
							<td><a
								href="store_information.do?id=${dealerShop.id}">${dealerShop.dealerShopName}
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
		</table>

	</div>
	<script src="/WXservice/jquery/jquery.min.js"></script>
</body>
</html>