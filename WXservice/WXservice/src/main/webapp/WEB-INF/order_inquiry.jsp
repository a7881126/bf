<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8">
<title>订单查询</title>

<link rel="stylesheet" href="/WXservice/css/bootstrap.min.css" />



</head>
<body>

	<div class="container">
		<div>
			<img src="/WXservice/images/header/logo.png"
				class="img-responsive img-circle" alt="Cinque Terre" alt="logo" />
		</div>
		<c:if test="${not empty message}">
		<h4 class="text-center">${message}</h4>
		</c:if>
		<p class="text-center">订单查询</p>
		<form action="order_inquiry.do" method="get">
			<div>
				<input name="salesOrderId" type="text" class="form-control"
					placeholder="请输入订单号">
			</div>
			<button type="submit" class="btn btn-default btn-lg btn-block">提交</button>
		</form>
	</div>
	<c:if test="${not empty error}">
		${error}
	</c:if>


	<c:if test="${not empty ordersList}">
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
					<c:forEach items="${ordersList}" var="order">
						<tr>
							<td><a
								href="check_order_info.do?salesOrderId=${order.salesOrderId}&openId=${openId}">${order.salesOrderId}
							</a></td>
							<td><a
								href="check_order_info.do?salesOrderId=${order.salesOrderId}&openId=${openId}">
									<fmt:formatDate value="${order.createdTime}"
										pattern="yyyy/MM/dd HH.mm" />
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:if>
	<table class="table table-hover">
		<tbody>
			<c:if test="${not empty order}">
				<tr>
					<td>订单号</td>
					<td>${order.salesOrderId}</td>
				</tr>
				<tr>
					<td>客户</td>
					<td>${order.contact}</td>
				</tr>
				<tr>
					<td>经销商</td>
					<td>${order.compname}</td>
				</tr>
				<tr>
					<td>下单时间</td>
					<td><fmt:formatDate value="${order.orderdate}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>付款时间</td>
					<td><fmt:formatDate value="${order.paydate}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>交货日期</td>
					<td><fmt:formatDate value="${order.secondDeliveryDate}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>付款人</td>
					<td>${order.payman}</td>
				</tr>
				<tr>
					<td>付款金额</td>
					<td>${order.payTotal}</td>
				</tr>
				<tr>
					<td>设计师名字</td>
					<td>${order.designer}</td>
				</tr>
				<tr>
					<td>设计师电话</td>
					<td>${order.designTel}</td>
				</tr>
				<tr>
					<td>备注</td>
					<td>${order.remark}</td>
				</tr>
				<tr>
					<td>产品名称</td>
					<td>${order.quotationType}</td>
				</tr>
				<tr>
					<td>门板颜色</td>
					<td>${order.consignee}</td>
				</tr>
				<tr>
					<td>柜体颜色</td>
					<td>${order.kitchenLayout}</td>
				</tr>
				<tr>
					<td>当前状态</td>
					<td>${order.workflowNodeName}</td>
				</tr>
				<tr>
					<td>是否加急</td>
					<td><c:if test="${order.isUrgent ==1}">
									是
								</c:if> 否</td>
				</tr>
				<tr>
					<td>导购</td>
					<td>${order.logistics}</td>
				</tr>
				<tr>
					<td>物流方式</td>
					<td>${order.logisticsSingle}</td>
				</tr>
				<tr>
					<td>业务负责人</td>
					<td>${order.salesman}</td>
				</tr>
				<tr>
					<td>付款方式</td>
					<td>${order.payType}</td>
				</tr>
			</c:if>
		</tbody>
	</table>




	<script src="/WXservice/jquery/jquery.min.js"></script>



<!--   
	<script type="text/javascript">
		function view_order() {

			var salesOrderId = $(".form-control").val();
			var url = "../order_inquiry.do";
			var data = "salesOrderId=" + salesOrderId;

			$.ajax({
				type : 'GET',
				dataType : 'json',
				url : url,
				data : data,
				contentType : "application/json;utf-8",
				success : function(order) {
					if (order === null) {
						alert('订单输入错误');
					}

				}
			});

		}
	</script>
-->		
</body>
</html>