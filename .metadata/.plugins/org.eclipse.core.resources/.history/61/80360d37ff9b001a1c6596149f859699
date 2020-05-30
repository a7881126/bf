<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"
	charset="UTF-8">
<title>查看订单</title>
<link rel="stylesheet" href="/WXservice/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div>
			<img src="/WXservice/images/header/logo.png"
				class="img-responsive img-circle" alt="Cinque Terre" alt="logo" />
		</div>
		<table class="table table-hover">
			<tbody>
				<c:if test="${empty customerorder}">
					<tr>
						<td>订单号</td>
						<td>${dealerOrder.salesOrderId}</td>
					</tr>
					<tr>
						<td>客户</td>
						<td>${dealerOrder.contact}</td>
					</tr>
					<tr>
						<td>客户地址</td>
						<td>${dealerOrder.address}</td>
					</tr>
					<tr>
						<td>客户电话</td>
						<td>${dealerOrder.tel}</td>
					</tr>
					<tr>
						<td>经销商</td>
						<td>${dealerOrder.compname}</td>
					</tr>
					<tr>
						<td>下单时间</td>
						<td><fmt:formatDate value="${dealerOrder.orderdate}"
								pattern="yyyy/MM/dd HH.mm" /></td>
					</tr>
					<tr>
						<td>付款时间</td>
						<td><fmt:formatDate value="${dealerOrder.paydate}"
								pattern="yyyy/MM/dd HH.mm" /></td>
					</tr>
					<tr>
						<td>交货日期</td>
						<td><fmt:formatDate value="${dealerOrder.secondDeliveryDate}"
								pattern="yyyy/MM/dd HH.mm" /></td>
					</tr>
					<tr>
						<td>付款人</td>
						<td>${dealerOrder.payman}</td>
					</tr>
					<tr>
						<td>付款金额</td>
						<td>${dealerOrder.payTotal}</td>
					</tr>
					<tr>
						<td>付款人联系方式</td>
						<td>${dealerOrder.paymanTel}</td>
					</tr>
					<tr>
						<td>设计师名字</td>
						<td>${dealerOrder.designer}</td>
					</tr>
					<tr>
						<td>设计师电话</td>
						<td>${dealerOrder.designTel}</td>
					</tr>
					<tr>
						<td>备注</td>
						<td>${dealerOrder.remark}</td>
					</tr>
					<tr>
						<td>产品名称</td>
						<td>${dealerOrder.quotationType}</td>
					</tr>
					<tr>
						<td>门板颜色</td>
						<td>${dealerOrder.consignee}</td>
					</tr>
					<tr>
						<td>柜体颜色</td>
						<td>${dealerOrder.kitchenLayout}</td>
					</tr>
					<tr>
						<td>当前状态</td>
						<td>${dealerOrder.workflowNodeName}</td>
					</tr>
					<tr>
						<td>出厂总价</td>
						<td>${dealerOrder.totalSumPrice}</td>
					</tr>
					<tr>
						<td>加收费</td>
						<td>${dealerOrder.differencePrice}</td>
					</tr>
					<tr>
						<td>是否加急</td>
						<td><c:if test="${dealerOrder.isUrgent ==1}">
									是
								</c:if> 否</td>
					</tr>
					<tr>
						<td>导购</td>
						<td>${dealerOrder.logistics}</td>
					</tr>
					<tr>
						<td>物流方式</td>
						<td>${dealerOrder.logisticsSingle}</td>
					</tr>
					<tr>
						<td>业务负责人</td>
						<td>${dealerOrder.salesman}</td>
					</tr>
					<tr>
						<td>收款方式</td>
						<td>${dealerOrder.payType}</td>
					</tr>
					<tr>
						<td>成本折扣</td>
						<td>${dealerOrder.costDiscount}</td>
					</tr>
					<tr>
						<td>拆单人</td>
						<td>${dealerOrder.decompose}</td>
					</tr>

				</c:if>
				<c:if test="${empty dealerOrder}">
					<tr>
						<td>订单号</td>
						<td>${customerorder.salesOrderId}</td>
					</tr>
					<tr>
						<td>客户</td>
						<td>${customerorder.contact}</td>
					</tr>
					<tr>
						<td>经销商</td>
						<td>${customerorder.compname}</td>
					</tr>
					<tr>
						<td>下单时间</td>
						<td><fmt:formatDate value="${customerorder.orderdate}"
								pattern="yyyy/MM/dd HH.mm" /></td>
					</tr>
					<tr>
						<td>付款时间</td>
						<td><fmt:formatDate value="${customerorder.paydate}"
								pattern="yyyy/MM/dd HH.mm" /></td>
					</tr>
					<tr>
						<td>交货日期</td>
						<td><fmt:formatDate
								value="${customerorder.secondDeliveryDate}"
								pattern="yyyy/MM/dd HH.mm" /></td>
					</tr>
					<tr>
						<td>付款人</td>
						<td>${customerorder.payman}</td>
					</tr>
					<tr>
						<td>付款金额</td>
						<td>${customerorder.payTotal}</td>
					</tr>
					<tr>
						<td>设计师名字</td>
						<td>${customerorder.designer}</td>
					</tr>
					<tr>
						<td>设计师电话</td>
						<td>${customerorder.designTel}</td>
					</tr>
					<tr>
						<td>备注</td>
						<td>${customerorder.remark}</td>
					</tr>
					<tr>
						<td>产品名称</td>
						<td>${customerorder.quotationType}</td>
					</tr>
					<tr>
						<td>门板颜色</td>
						<td>${customerorder.consignee}</td>
					</tr>
					<tr>
						<td>柜体颜色</td>
						<td>${customerorder.kitchenLayout}</td>
					</tr>
					<tr>
						<td>当前状态</td>
						<td>${customerorder.workflowNodeName}</td>
					</tr>
					<tr>
						<td>是否加急</td>
						<td><c:if test="${customerorder.isUrgent ==1}">
									是
								</c:if> 否</td>
					</tr>
					<tr>
						<td>导购</td>
						<td>${customerorder.logistics}</td>
					</tr>
					<tr>
						<td>物流方式</td>
						<td>${customerorder.logisticsSingle}</td>
					</tr>
					<tr>
						<td>业务负责人</td>
						<td>${customerorder.salesman}</td>
					</tr>
					<tr>
						<td>付款方式</td>
						<td>${customerorder.payType}</td>
					</tr>
				</c:if>
			</tbody>
		</table>



	</div>

	<script src="/WXservice/jquery/jquery.min.js"></script>
</body>
</html>