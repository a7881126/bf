package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.OrderMapper;
import org.boot.az.pojo.Order;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月25日 下午6:32:49 

* 类说明 

*/
@Service
public class OrderServiceImpl implements IOrderService{

	
	
	
	
	@Resource
	private OrderMapper orderMapper;
	
	
	

	private Integer countPerPage = COUNT_PER_PAGE;

	public void setCountPerPage(int countPerPage) {
		if (countPerPage >= 5 
				&& countPerPage <= 30) {
			this.countPerPage = countPerPage;
		}
	}
	
	public Integer getCountPerPage() {
		return this.countPerPage;
	}

	
	
	
	@Override
	public List<Order> getOrderInfoByOpenId(String openId) {

		return orderMapper.getOrderInfoByOpenId(openId);
	}

	@Override
	public List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds,String orderBy,Integer offset,Integer count) {

		return orderMapper.getOrderInfoByDealerShopId(dealerShopIds,  orderBy, offset, count);
	}
	
	@Override
	public List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds,Integer offset,Integer count) {

		return orderMapper.getOrderInfoByDealerShopId(dealerShopIds, ORDER_BY_DEFAULT, offset, getCountPerPage());
	}
	@Override
	public List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds, Integer page) {
		System.out.println((page-1)*getCountPerPage());
		return orderMapper.getOrderInfoByDealerShopId(dealerShopIds, ORDER_BY_DEFAULT,(page-1)*getCountPerPage(), getCountPerPage());
	}

	@Override
	public List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds) {
		
		return orderMapper.getOrderInfoByDealerShopId(dealerShopIds, ORDER_BY_DEFAULT, 0, getCountPerPage());
	}


	@Override
	public Order getOrderInfoBySalesOrderId(String SalesOrderId) {
		
		return orderMapper.getOrderInfoBySalesOrderId(SalesOrderId);
	}

	@Override
	public Integer getOrdersCountByDealerShopId(List<String> dealerShopIds) {
		
		return orderMapper.getOrdersCountByDealerShopId(dealerShopIds);
	}

	@Override
	public Integer getOrdersCountByOpenId(String openId) {
	
		return orderMapper.getOrdersCountByOpenId(openId);
	}

	



	
}
