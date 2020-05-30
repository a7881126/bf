<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8">
<title>订单列表</title>
<link rel="stylesheet" href="/WXservice/css/bootstrap.min.css" />

<script type="text/javascript">
	
</script>



</head>
<body>






	<div class="container">
		<div>
			<img src="/WXservice/images/header/logo.png"
				class="img-responsive img-circle" alt="Cinque Terre" alt="logo" />
		</div>
		<div class="table-responsive">
			<!-- 设置自动匹配设备 -->
			<table class="table table-hover">
				<thead>
					<tr>
						<th>订单号</th>
						<th>创建时间</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ordersList}"
						var="order">
						<tr>
							<td><a href="check_order_info.do?salesOrderId=${order.salesOrderId}&openId=${openId}">${order.salesOrderId}</a></td>
							<td>
								<a href="check_order_info.do?salesOrderId=${order.salesOrderId}&openId=${openId}"><fmt:formatDate value="${order.orderdate}"
								pattern="yyyy/MM/dd HH.mm" /></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<!-- 分页 -->
		<div>
			<ul class="pagination">
				<li><a href="?openId=${openId}&page=1">首页</a></li>
				<li><a href="?openId=${openId}&page= ${page-1}">&laquo;</a></li>
				<c:forEach var="i" begin="${begin}" end="${end}">
					<li><a href="?openId=${openId}&page=${i}">${i}</a></li>
				</c:forEach>
				<li><a href="?openId=${openId}&page=${page+1}">&raquo;</a></li>
				<li><a href="?openId=${openId}&page=${pages}">尾页</a></li>
			</ul>
		</div>
		<span>当前在 ${page}页 共${ordersCount}个订单，共${pages }页</span>
	</div>
	<script src="/WXservice/jquery/jquery.min.js"></script>
</body>
</html>