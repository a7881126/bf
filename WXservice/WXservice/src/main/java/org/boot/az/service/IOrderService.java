package org.boot.az.service;

import java.util.List;

import org.boot.az.pojo.Order;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月25日 下午6:33:27 

* 类说明 

*/
public interface IOrderService  {
	
	/**
	 * 查询订单列表默认排序
	 */
	String ORDER_BY_DEFAULT = "SalesOrderId DESC";
	/**
	 * 正序
	 */
	String ORDER_BY_PRICE_ASC = "SalesOrderId ASC";
	/**
	 * 倒序
	 */
	String ORDER_BY_PRICE_DESC = "SalesOrderId DESC";
	
	/**
	 * 排序方案
	 */
	String[] ORDER_BY = {
			ORDER_BY_DEFAULT,
			ORDER_BY_PRICE_ASC, 
			ORDER_BY_PRICE_DESC
	};
	
	/**
	 * 每页显示多少条数据
	 */
	Integer COUNT_PER_PAGE = 12;
	
	
	
	
	/**
	 * 
	 * @Description 通过微信Id获取绑定了多少订单
	 * @author Administrator
	 * @date 2019年3月1日
	 * @param openId
	 * @return  
	 * @throws
	 */
	Integer getOrdersCountByOpenId(String openId);
	
	
	/**
	 * 获取经销商订单数量
	 * @param categoryId 分类的id
	 * @return 商店Id
	 */
	Integer getOrdersCountByDealerShopId(List<String> dealerShopIds);

	
	/**
	 * 设置每页显示的订单数量
	 * @param countPerPage 每页显示的订单数量
	 */
	void setCountPerPage(int countPerPage);
	
	/**
	 * 获取每页显示的订单数量
	 * @return 每页显示的订单数量
	 */
	Integer getCountPerPage();
	
	
	
	
	
	
	/**
	 * 
	* @Title: getOrderInfoByOpenId
	* @Description: 通过微信Id获取订单信息
	* @param @param openId
	* @param @return    参数
	* @return List<Order>    返回类型
	* @throws
	 */
	List<Order> getOrderInfoByOpenId( String openId);
	

	
	
	/**
	 * 
	* @Title: getOrderInfoBySalesOrderId
	* @Description: 通过订单号获取订单信息
	* @param @param SalesOrderId
	* @param @return    参数
	* @return Order    返回类型
	* @throws
	 */
	Order getOrderInfoBySalesOrderId(String SalesOrderId);

	
	
	
	
	/**
	 * 
	* @Title: getOrderInfoByDealerShopId
	* @Description: 获取经销商店下所有订单信息(支持多店)
	* @param @param dealerShop_Id
	* @param @return    参数
	* @return List<Order>    返回类型
	* @throws
	 */
	List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds, String orderBy, Integer offset, Integer count);
	List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds, Integer offset, Integer count);
	List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds);
	
	/**
	 * 
	* @Title: getOrderInfoByDealerShopId
	* @Description: 点击页数来获取信息
	* @param @param dealerShop_Id
	* @param @return    参数
	* @return List<Order>    返回类型
	* @throws
	 */
	List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds, Integer page);












}

