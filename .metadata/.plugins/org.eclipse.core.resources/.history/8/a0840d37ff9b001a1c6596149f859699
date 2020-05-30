<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
			<tbody>
				<tr>
					<td>经销店编码</td>
					<td>${dealerShop.dealerShopCode}</td>
				</tr>
				<tr>
					<td>经销店名称</td>
					<td>${dealerShop.dealerShopName}</td>
				</tr>
				<tr>
					<td>业务员名称</td>
					<td>${dealerShop.person}</td>
				</tr>
				<tr>
					<td>业务负责人电话</td>
					<td>${dealerShop.mobile}</td>
				</tr>
				<tr>
					<td>收货人电话</td>
					<td>${dealerShop.phone}</td>
				</tr>
				<tr>
					<td>传真</td>
					<td>${dealerShop.fax}</td>
				</tr>
				<tr>
					<td>门店地址</td>
					<td>${dealerShop.storeAddress}</td>
				</tr>
				<tr>
					<td>公司地址</td>
					<td>${dealerShop.cmpAddress}</td>
				</tr>
				<tr>
					<td>订单前缀</td>
					<td>${dealerShop.orderPre}</td>
				</tr>
				<tr>
					<td>物流收货地址</td>
					<td>${dealerShop.logDeliveryAdd}</td>
				</tr>
				<tr>
					<td>快递收货地址</td>
					<td>${dealerShop.expressDeliveryAdd}</td>
				</tr>
				<tr>
					<td>收货人</td>
					<td>${dealerShop.consignee}</td>
				</tr>
				<tr>
					<td>邮编</td>
					<td>${dealerShop.post}</td>
				</tr>
				<tr>
					<td>门店销售系统</td>
					<td>${dealerShop.salesSystem}</td>
				</tr>
				<tr>
					<td>级别</td>
					<td>${dealerShop.dealerShopLevel}</td>
				</tr>
				<tr>
					<td>面积</td>
					<td>${dealerShop.dealerShopArea}</td>
				</tr>
				<tr>
					<td>上样套数</td>
					<td>${dealerShop.sampleNumber}</td>
				</tr>
				<tr>
					<td>开业时间</td>
					<td><fmt:formatDate value="${dealerShop.openedTime}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>是否已签合同</td>
					<td>${dealerShop.openedTime}</td>
				</tr>
				<tr>
					<td>应缴纳保证金</td>
					<td>${dealerShop.preMoney}</td>
				</tr>
				<tr>
					<td>实际缴纳保证金</td>
					<td>${dealerShop.actualMoney}</td>
				</tr>

				<tr>
					<td>加盟时间</td>
					<td><fmt:formatDate value="${dealerShop.joinTime}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>是否为生活馆</td>
					<td><c:if test="${dealerShop.isLivingMuseum == 1}">
									是
								</c:if> 否</td>
					
				</tr>
				<tr>
					<td>经销商性质</td>
					<td>${dealerShop.nature}</td>
				</tr>
				<tr>
					<td>与电器合作情况</td>
					<td>${dealerShop.cooperation}</td>
				</tr>
				<tr>
					<td>业务创建人</td>
					<td>${dealerShop.businessCreator}</td>
				</tr>
				<tr>
					<td>订单创建人</td>
					<td>${dealerShop.orderCreator}</td>
				</tr>
				<tr>
					<td>线索来源</td>
					<td>${dealerShop.clueSource}</td>
				</tr>
				<tr>
					<td>业务服务类型</td>
					<td>${dealerShop.businessServiceType}</td>
				</tr>
				<tr>
					<td>订单服务类型</td>
					<td>${dealerShop.orderServiceType}</td>
				</tr>
				<tr>
					<td>客户所属于行业</td>
					<td>${dealerShop.customerIndustry}</td>
				</tr>
				<tr>
					<td>客户渠道类型</td>
					<td>${dealerShop.customerChannelType}</td>
				</tr>
				<tr>
					<td>订单QQ</td>
					<td>${dealerShop.qrderQQ}</td>
				</tr>
				<tr>
					<td>微信号</td>
					<td>${dealerShop.webChatNo}</td>
				</tr>

				<tr>
					<td>最后下单时间</td>
					<td><fmt:formatDate
							value="${dealerShop.lastOrderCreateDateTime}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>导购</td>
					<td>${dealerShop.logistics}</td>
				</tr>
				<tr>
					<td>合伙人</td>
					<td>${dealerShop.logisticsTel}</td>
				</tr>

				<tr>
					<td>修改时间</td>
					<td><fmt:formatDate value="${dealerShop.modifyTime}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
				<tr>
					<td>账户金额</td>
					<td>${dealerShop.amount}</td>
				</tr>
				<tr>
					<td>是否冻结</td>
					<td><c:if test="${dealerShop.isDeleted == 1}">
									是
								</c:if> 否</td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td><fmt:formatDate value="${dealerShop.createdTime}"
							pattern="yyyy/MM/dd HH.mm" /></td>
				</tr>
			</tbody>
		</table>



	</div>

	<script src="/WXservice/jquery/jquery.min.js"></script>
</html>