package org.boot.az.pojo;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年2月22日 下午2:38:40
 * 
 *          类说明
 * 
 */
public class DealerShop {

	/**
	 * 经销店Id
	 */
	private String id;

	/**
	 * 经销店编码
	 */
	private String dealerShopCode;
	/**
	 * 经销店名称
	 */
	private String dealerShopName;
	/**
	 * 业务员名称
	 */
	private String person;

	/**
	 * 业务负责人电话
	 */
	private String mobile;

	/**
	 * 收货人电话
	 */
	private String phone;

	/**
	 * 传真
	 */
	private String fax;

	/**
	 * 门店地址
	 */
	private String storeAddress;

	/**
	 * 公司地址
	 */
	private String cmpAddress;

	/**
	 * 订单前缀
	 */
	private String orderPre;

	/**
	 * 物流收货地址
	 */
	private String logDeliveryAdd;

	/**
	 * 快递收货地址
	 */
	private String expressDeliveryAdd;

	/**
	 * 收货人
	 */
	private String consignee;

	/**
	 * 邮编
	 */
	private String post;

	/**
	 * 门店销售系统
	 */
	private String salesSystem;

	/**
	 * 级别
	 */
	private String dealerShopLevel;

	/**
	 * 面积
	 */
	private String dealerShopArea;

	/**
	 * 上样套数
	 */
	private String sampleNumber;

	/**
	 * 开业时间
	 */
	private Date openedTime;

	/**
	 * 是否已签合同 1是
	 */
	private String isContract;

	/**
	 * 应缴纳保证金
	 */
	private String preMoney;

	/**
	 * 实际缴纳保证金
	 */
	private String actualMoney;

	/**
	 * 加盟时间
	 */
	private Date joinTime;

	/**
	 * 是否为生活馆 1是
	 */
	private String isLivingMuseum;

	/**
	 * 经销商性质
	 */
	private String nature;

	/**
	 * 与电器合作情况
	 */
	private String cooperation;

	/**
	 * 业务创建人
	 */
	private String businessCreator;

	/**
	 * 订单创建人
	 */
	private String orderCreator;

	/**
	 * 线索来源
	 */
	private String clueSource;

	/**
	 * 业务服务类型
	 */
	private String businessServiceType;

	/**
	 * 订单服务类型
	 */
	private String orderServiceType;

	/**
	 * 客户所属于行业
	 */
	private String customerIndustry;

	/**
	 * 客户渠道类型
	 */
	private String customerChannelType;

	/**
	 * 不知道的字段
	 */
	private String businessContact;

	/**
	 * 订单QQ
	 */
	private String qrderQQ;

	/**
	 * 微信号
	 */
	private String webChatNo;

	/**
	 * 最后下单时间
	 */
	private Date lastOrderCreateDateTime;

	/**
	 * 备注1
	 */
	private String remark1;

	/**
	 * 备注2
	 */
	private String remark2;

	/**
	 * 创建人
	 */
	private String handler;

	/**
	 * 导购
	 */
	private String logistics;

	/**
	 * 合伙人
	 */
	private String logisticsTel;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	/**
	 * 账户金额
	 */
	private String amount;

	/**
	 * 是否冻结 1是
	 */
	private String isDeleted;

	/**
	 * 创建时间
	 */
	private Date createdTime;

	/**
	 * 创建时间
	 */
	private String timestamp;

	/**
	 * 
	 */
	private String isSent;

	private Date SentTime1;
	private Date SentTime2;
	private Date SentTime3;
	private Date SentTime4;
	private Date SentTime5;
	private String IsSynced;
	private Date SyncTime1;
	private Date SyncTime2;
	private Date SyncTime3;
	private Date SyncTime4;
	private Date SyncTime5;

	/**
	 * 经销商Id
	 */
	private String dealerId;

	/**
	 * 折扣Id
	 */
	private String discount_Id;

	private String DealerUserDiscount;
	private String DealerUserDiscount2;
	private String DealerUserDiscount3;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDealerShopCode() {
		return dealerShopCode;
	}

	public void setDealerShopCode(String dealerShopCode) {
		this.dealerShopCode = dealerShopCode;
	}

	public String getDealerShopName() {
		return dealerShopName;
	}

	public void setDealerShopName(String dealerShopName) {
		this.dealerShopName = dealerShopName;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getCmpAddress() {
		return cmpAddress;
	}

	public void setCmpAddress(String cmpAddress) {
		this.cmpAddress = cmpAddress;
	}

	public String getOrderPre() {
		return orderPre;
	}

	public void setOrderPre(String orderPre) {
		this.orderPre = orderPre;
	}

	public String getLogDeliveryAdd() {
		return logDeliveryAdd;
	}

	public void setLogDeliveryAdd(String logDeliveryAdd) {
		this.logDeliveryAdd = logDeliveryAdd;
	}

	public String getExpressDeliveryAdd() {
		return expressDeliveryAdd;
	}

	public void setExpressDeliveryAdd(String expressDeliveryAdd) {
		this.expressDeliveryAdd = expressDeliveryAdd;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalesSystem() {
		return salesSystem;
	}

	public void setSalesSystem(String salesSystem) {
		this.salesSystem = salesSystem;
	}

	public String getDealerShopLevel() {
		return dealerShopLevel;
	}

	public void setDealerShopLevel(String dealerShopLevel) {
		this.dealerShopLevel = dealerShopLevel;
	}

	public String getDealerShopArea() {
		return dealerShopArea;
	}

	public void setDealerShopArea(String dealerShopArea) {
		this.dealerShopArea = dealerShopArea;
	}

	public String getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(String sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

	public Date getOpenedTime() {
		return openedTime;
	}

	public void setOpenedTime(Date openedTime) {
		this.openedTime = openedTime;
	}

	public String getIsContract() {
		return isContract;
	}

	public void setIsContract(String isContract) {
		this.isContract = isContract;
	}

	public String getPreMoney() {
		return preMoney;
	}

	public void setPreMoney(String preMoney) {
		this.preMoney = preMoney;
	}

	public String getActualMoney() {
		return actualMoney;
	}

	public void setActualMoney(String actualMoney) {
		this.actualMoney = actualMoney;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public String getIsLivingMuseum() {
		return isLivingMuseum;
	}

	public void setIsLivingMuseum(String isLivingMuseum) {
		this.isLivingMuseum = isLivingMuseum;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getCooperation() {
		return cooperation;
	}

	public void setCooperation(String cooperation) {
		this.cooperation = cooperation;
	}

	public String getBusinessCreator() {
		return businessCreator;
	}

	public void setBusinessCreator(String businessCreator) {
		this.businessCreator = businessCreator;
	}

	public String getOrderCreator() {
		return orderCreator;
	}

	public void setOrderCreator(String orderCreator) {
		this.orderCreator = orderCreator;
	}

	public String getClueSource() {
		return clueSource;
	}

	public void setClueSource(String clueSource) {
		this.clueSource = clueSource;
	}

	public String getBusinessServiceType() {
		return businessServiceType;
	}

	public void setBusinessServiceType(String businessServiceType) {
		this.businessServiceType = businessServiceType;
	}

	public String getOrderServiceType() {
		return orderServiceType;
	}

	public void setOrderServiceType(String orderServiceType) {
		this.orderServiceType = orderServiceType;
	}

	public String getCustomerIndustry() {
		return customerIndustry;
	}

	public void setCustomerIndustry(String customerIndustry) {
		this.customerIndustry = customerIndustry;
	}

	public String getCustomerChannelType() {
		return customerChannelType;
	}

	public void setCustomerChannelType(String customerChannelType) {
		this.customerChannelType = customerChannelType;
	}

	public String getBusinessContact() {
		return businessContact;
	}

	public void setBusinessContact(String businessContact) {
		this.businessContact = businessContact;
	}

	public String getQrderQQ() {
		return qrderQQ;
	}

	public void setQrderQQ(String qrderQQ) {
		this.qrderQQ = qrderQQ;
	}

	public String getWebChatNo() {
		return webChatNo;
	}

	public void setWebChatNo(String webChatNo) {
		this.webChatNo = webChatNo;
	}

	public Date getLastOrderCreateDateTime() {
		return lastOrderCreateDateTime;
	}

	public void setLastOrderCreateDateTime(Date lastOrderCreateDateTime) {
		this.lastOrderCreateDateTime = lastOrderCreateDateTime;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getHandler() {
		return handler;
	}

	public void setHandler(String handler) {
		this.handler = handler;
	}

	public String getLogistics() {
		return logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public String getLogisticsTel() {
		return logisticsTel;
	}

	public void setLogisticsTel(String logisticsTel) {
		this.logisticsTel = logisticsTel;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getIsSent() {
		return isSent;
	}

	public void setIsSent(String isSent) {
		this.isSent = isSent;
	}

	public Date getSentTime1() {
		return SentTime1;
	}

	public void setSentTime1(Date sentTime1) {
		SentTime1 = sentTime1;
	}

	public Date getSentTime2() {
		return SentTime2;
	}

	public void setSentTime2(Date sentTime2) {
		SentTime2 = sentTime2;
	}

	public Date getSentTime3() {
		return SentTime3;
	}

	public void setSentTime3(Date sentTime3) {
		SentTime3 = sentTime3;
	}

	public Date getSentTime4() {
		return SentTime4;
	}

	public void setSentTime4(Date sentTime4) {
		SentTime4 = sentTime4;
	}

	public Date getSentTime5() {
		return SentTime5;
	}

	public void setSentTime5(Date sentTime5) {
		SentTime5 = sentTime5;
	}

	public String getIsSynced() {
		return IsSynced;
	}

	public void setIsSynced(String isSynced) {
		IsSynced = isSynced;
	}

	public Date getSyncTime1() {
		return SyncTime1;
	}

	public void setSyncTime1(Date syncTime1) {
		SyncTime1 = syncTime1;
	}

	public Date getSyncTime2() {
		return SyncTime2;
	}

	public void setSyncTime2(Date syncTime2) {
		SyncTime2 = syncTime2;
	}

	public Date getSyncTime3() {
		return SyncTime3;
	}

	public void setSyncTime3(Date syncTime3) {
		SyncTime3 = syncTime3;
	}

	public Date getSyncTime4() {
		return SyncTime4;
	}

	public void setSyncTime4(Date syncTime4) {
		SyncTime4 = syncTime4;
	}

	public Date getSyncTime5() {
		return SyncTime5;
	}

	public void setSyncTime5(Date syncTime5) {
		SyncTime5 = syncTime5;
	}

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getDiscount_Id() {
		return discount_Id;
	}

	public void setDiscount_Id(String discount_Id) {
		this.discount_Id = discount_Id;
	}

	public String getDealerUserDiscount() {
		return DealerUserDiscount;
	}

	public void setDealerUserDiscount(String dealerUserDiscount) {
		DealerUserDiscount = dealerUserDiscount;
	}

	public String getDealerUserDiscount2() {
		return DealerUserDiscount2;
	}

	public void setDealerUserDiscount2(String dealerUserDiscount2) {
		DealerUserDiscount2 = dealerUserDiscount2;
	}

	public String getDealerUserDiscount3() {
		return DealerUserDiscount3;
	}

	public void setDealerUserDiscount3(String dealerUserDiscount3) {
		DealerUserDiscount3 = dealerUserDiscount3;
	}

	@Override
	public String toString() {
		return "DealerShop [id=" + id + ", dealerShopCode=" + dealerShopCode + ", dealerShopName=" + dealerShopName
				+ ", person=" + person + ", mobile=" + mobile + ", phone=" + phone + ", fax=" + fax + ", storeAddress="
				+ storeAddress + ", cmpAddress=" + cmpAddress + ", orderPre=" + orderPre + ", logDeliveryAdd="
				+ logDeliveryAdd + ", expressDeliveryAdd=" + expressDeliveryAdd + ", consignee=" + consignee + ", post="
				+ post + ", salesSystem=" + salesSystem + ", dealerShopLevel=" + dealerShopLevel + ", dealerShopArea="
				+ dealerShopArea + ", sampleNumber=" + sampleNumber + ", openedTime=" + openedTime + ", isContract="
				+ isContract + ", preMoney=" + preMoney + ", actualMoney=" + actualMoney + ", joinTime=" + joinTime
				+ ", isLivingMuseum=" + isLivingMuseum + ", nature=" + nature + ", cooperation=" + cooperation
				+ ", businessCreator=" + businessCreator + ", orderCreator=" + orderCreator + ", clueSource="
				+ clueSource + ", businessServiceType=" + businessServiceType + ", orderServiceType=" + orderServiceType
				+ ", customerIndustry=" + customerIndustry + ", customerChannelType=" + customerChannelType
				+ ", businessContact=" + businessContact + ", qrderQQ=" + qrderQQ + ", webChatNo=" + webChatNo
				+ ", lastOrderCreateDateTime=" + lastOrderCreateDateTime + ", remark1=" + remark1 + ", remark2="
				+ remark2 + ", handler=" + handler + ", logistics=" + logistics + ", logisticsTel=" + logisticsTel
				+ ", modifyTime=" + modifyTime + ", amount=" + amount + ", isDeleted=" + isDeleted + ", createdTime="
				+ createdTime + ", timestamp=" + timestamp + ", isSent=" + isSent + ", SentTime1=" + SentTime1
				+ ", SentTime2=" + SentTime2 + ", SentTime3=" + SentTime3 + ", SentTime4=" + SentTime4 + ", SentTime5="
				+ SentTime5 + ", IsSynced=" + IsSynced + ", SyncTime1=" + SyncTime1 + ", SyncTime2=" + SyncTime2
				+ ", SyncTime3=" + SyncTime3 + ", SyncTime4=" + SyncTime4 + ", SyncTime5=" + SyncTime5 + ", dealerId="
				+ dealerId + ", discount_Id=" + discount_Id + ", DealerUserDiscount=" + DealerUserDiscount
				+ ", DealerUserDiscount2=" + DealerUserDiscount2 + ", DealerUserDiscount3=" + DealerUserDiscount3 + "]";
	}

}
