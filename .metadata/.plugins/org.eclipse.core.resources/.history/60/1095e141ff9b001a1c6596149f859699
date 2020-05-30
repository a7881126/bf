package org.boot.az.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.boot.az.pojo.DealerShop;
import org.boot.az.pojo.DealerShopAccountDetail;
import org.boot.az.pojo.InformationStatistics;
import org.boot.az.pojo.Order;
import org.boot.az.pojo.User;
import org.boot.az.service.DealerShopAccountDetailServiceImpl;
import org.boot.az.service.IDealerShopService;
import org.boot.az.service.IDealerShopWithUserService;
import org.boot.az.service.IInformationStatisticsService;
import org.boot.az.service.IOrderService;
import org.boot.az.service.IUserService;
import org.boot.az.util.UserInfoUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月20日 下午1:02:41 

* 类说明 

*/
@Controller
public class MenuController {
	
	
	
	
	@Resource
	private IUserService iUserService;
	

	@Resource
	private UserInfoUtil userInfoUtil;
	
	
	@Resource
	private IDealerShopWithUserService iDealerShopWithUserService;
	
	
	@Resource
	private IOrderService iOrderService;
	
	@Resource
	private IDealerShopService iDealerShopService;

	@Resource
	private IInformationStatisticsService iInformationStatisticsService;
	
	
	@Resource
	private  DealerShopAccountDetailServiceImpl dealerShopAccountDetailServiceImpl;
	
	/**
	 * 
	* @Title: orderInquiry
	* @Description: 订单查询
	* @param @param code
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */

	@RequestMapping("order_inquiry.do")
	public String orderInquiry(String salesOrderId,String code,ModelMap modelMap) {
	
		User user = null;
		Order order = null;
		List<Order> ordersList = null;
		if(code != null) {
//			获取当前进入的openId
			Map<String,String> map = userInfoUtil.getOpenIdByCode(code);
			String openId = map.get("openid");
//			客户订单信息获取
			ordersList = iOrderService.getOrderInfoByOpenId(openId);
			modelMap.put("openId",openId);
			modelMap.put("ordersList",ordersList);
			return "order_inquiry";
		}else if(salesOrderId != null &&(salesOrderId == "" || salesOrderId.length() !=10)) {
			System.out.println("订单号输入有误");
			if(salesOrderId == "") {
				modelMap.put("error","订单号不能为空");
				return "order_inquiry";
			}
			modelMap.put("error","订单号输入有误");
			return "order_inquiry";
		}else if(salesOrderId != null && salesOrderId !="" ) {
			salesOrderId = salesOrderId.toUpperCase();
			System.out.println(salesOrderId+"订单号");
			order = iOrderService.getOrderInfoBySalesOrderId(salesOrderId);
			if(order != null) {
				System.out.println(order);
				modelMap.put("order",order);
			}else{
				System.out.println("未查到此单号");
			modelMap.put("error","未查到此单号");
			}
			return "order_inquiry";
		}
		
	
		return "order_inquiry";
	}
	
	/**
	 * 
	* @Title: check_order_list
	* @Description: 查看订单列表
	* @param @param code
	* @param @return    参数
	* @return String    返回类型
	* @throws @RequestParam(value="page", required=false)
	 */
	@RequestMapping("check_order_list.do")
	public String checkOrderList(String openId,String code,Integer page,Integer currPageCode ,ModelMap modelMap) {
		
		// 声明需要转发的数据
		//订单列表一页数据数据
		List<Order> ordersList;
		//订单总数
		Integer ordersCount;
		//总页数
		Integer pages;
		//每页显示数量
		Integer countPerPage;
		//显示页数列表区间
		Integer begin;
		//显示页数列表区间
		Integer end;
		
		
		
		
		
		//全局参数
		User user = null;
		// 判断参数
		if (page == null || page < 1) {
			page = 1;
		}
//		
//		openId = "oEZXLjusePAKp0bBw5rbb_brgkOU";
//		openId =  "oEZXLjnWUJs1WWwEweACvtpRDL7g";
		
		// 设置每页显示多少条订单
		iOrderService.setCountPerPage(IOrderService.COUNT_PER_PAGE);
		// 获取每页显示的订单数量
		countPerPage = iOrderService.getCountPerPage();
		
		
		
		if(code == null) {
			//通过当前进入的openId识别当前用户
			user =  iUserService.getUserInfoByOpenId(openId);
		}else {
			//获取当前进入的openId
			Map<String,String> map = userInfoUtil.getOpenIdByCode(code);
			openId = map.get("openid");
			//通过当前进入的openId识别当前用户
			user =  iUserService.getUserInfoByOpenId(openId);
		}
		
	
		
		//判断当前用户是否是经销商
		if(user != null && ("7".equals(user.getRoleId()) || "4011".equals(user.getRoleId())
				|| "3008".equals(user.getRoleId())|| "4010".equals(user.getRoleId())
				|| "3".equals(user.getRoleId())|| "1".equals(user.getRoleId()))) {
			//通过当前用户获取当前用户下有多少经销商店
			List<String> dealerShopIds =  iDealerShopWithUserService.getDealerShopIdByUserId(user.getId());
			//获取经销商有多少订单数量
			ordersCount = iOrderService.getOrdersCountByDealerShopId(dealerShopIds);
			// 计算总页数
			pages = ordersCount / countPerPage;
			pages += ordersCount % countPerPage == 0 ? 0 : 1;
		
			if(page >= pages) {
				page = pages;
			}
			end = page+2;
			begin = page-2;
			if(begin < 1) {
				begin = 1;
			}
			if(end >= pages) {
				end = pages;
			}
			// 获取数据 
			ordersList = iOrderService.getOrderInfoByDealerShopId(dealerShopIds,page);
			//modelMap.addAttribute(); 不可以传空值	
			modelMap.put("ordersList",ordersList);
			modelMap.put("pages",pages);
			modelMap.put("ordersCount",ordersCount);
			modelMap.put("countPerPage",countPerPage);
			modelMap.put("openId",openId);
			modelMap.put("page",page);	
			modelMap.put("end",end);	
			modelMap.put("begin",begin);	
			return "check_order_list";
		}
		
		
		
		//客户订单信息获取
		ordersList = iOrderService.getOrderInfoByOpenId(openId);
		System.out.println(ordersList);
		if(ordersList.size() > 0) {
			
			//微信绑定多少订单数量
			ordersCount = iOrderService.getOrdersCountByOpenId(openId);
			pages = ordersCount / countPerPage;
			pages += ordersCount % countPerPage == 0 ? 0 : 1;
			if(page >= pages) {
				page = pages;
			}
			end = page+2;
			begin = page-2;
			if(begin < 1) {
				begin = 1;
			}
			if(end >= pages) {
				end = pages;
			}
			modelMap.put("end",end);	
			modelMap.put("begin",begin);
			modelMap.put("ordersList",ordersList);
			modelMap.put("ordersCount",ordersCount);
			modelMap.put("pages",pages);
			modelMap.put("countPerPage",countPerPage);
			modelMap. put("openId",openId);
			modelMap.put("page",page);
			return "check_order_list";
		}else {
			modelMap.put("message","微信号未绑定订单，跳转订单查询");
			System.out.println("微信号未绑定订单，跳转订单查询");
			return "order_inquiry";
		}
	
	}
	

	/**
	 * 
	 * @Description 查看单个订单信息
	 * @author Administrator
	 * @date 2019年3月2日
	 * @param openId
	 * @param salesOrderId
	 * @param modelMap
	 * @return  
	 * @throws
	 */
	@RequestMapping("check_order_info.do")
	public String checkOrderInfo(String openId,String salesOrderId,ModelMap modelMap ) {
		User user = null;
		user =  iUserService.getUserInfoByOpenId(openId);
		if(user != null && ("7".equals(user.getRoleId()) || "4011".equals(user.getRoleId())
				|| "3008".equals(user.getRoleId())|| "4010".equals(user.getRoleId())
				|| "3".equals(user.getRoleId())|| "1".equals(user.getRoleId()))) {
			Order dealerOrder = iOrderService.getOrderInfoBySalesOrderId(salesOrderId);
			modelMap.put("dealerOrder",dealerOrder);
		}else {
			Order customerOrder = iOrderService.getOrderInfoBySalesOrderId(salesOrderId);
			modelMap.put("customerorder",customerOrder);
		}
		return "check_order_info";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	* @Title: salesInquire
	* @Description: 销量查询
	* @param @param code
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	@RequestMapping("sales_inquire.do")
	public String salesInquire(String code,String id,ModelMap modelMap ) {
		User user = null;       
		
		if(id != null) {
			List<InformationStatistics> InformationStatisticss = iInformationStatisticsService.getInformationStatisticsByDealerShopId(id);
			modelMap.put("InformationStatisticss",InformationStatisticss);
			return "sales_inquire";
		}
		if(code != null) {
			Map<String,String> map = userInfoUtil.getOpenIdByCode(code);
			String openId = map.get("openid");
			user =  iUserService.getUserInfoByOpenId(openId);
			if(user != null && ("7".equals(user.getRoleId()) || "4011".equals(user.getRoleId())
					|| "3008".equals(user.getRoleId())|| "4010".equals(user.getRoleId())
					|| "3".equals(user.getRoleId())|| "1".equals(user.getRoleId()))) {
				//通过当前用户获取当前用户下有多少经销商店
				List<String> dealerShopIds =  iDealerShopWithUserService.getDealerShopIdByUserId(user.getId());
				if(dealerShopIds.size() > 1) {
					List<DealerShop> dealerShops  = iDealerShopService.getDealerShopInfoByIds(dealerShopIds);
					modelMap.put("dealerShops",dealerShops);
					return "store_list";
				}else if(dealerShopIds.size() == 1) {
					String dealerShopId = dealerShopIds.get(0);
					List<InformationStatistics> InformationStatisticss = iInformationStatisticsService.getInformationStatisticsByDealerShopId(dealerShopId);
					System.out.println(InformationStatisticss);
					modelMap.put("InformationStatisticss",InformationStatisticss);
					return "sales_inquire";
				}
				
			}
		}
		return "not_dealer";
	
	}
	
	



//	/**
//	 * 
//	* @Title: billingDetails
//	* @Description: 账单明细
//	* @param @param code
//	* @param @return    参数
//	* @return String    返回类型
//	* @throws
//	 */
//	@RequestMapping("billing_details.do")
//	public String billingDetails(String code,String id,ModelMap modelMap) {
//		User user = null;
//		if(id != null) {
//			List<DealerShopAccountDetail> dealerShopAccountDetail =  dealerShopAccountDetailServiceImpl.getDealerShopAccountDetailByDealShaopId(id);
//			modelMap.put("dealerShopAccountDetail",dealerShopAccountDetail);
//			return "billing_details";
//		}
//		
//		
//		if(code != null) {
//			Map<String,String> map = userInfoUtil.getOpenIdByCode(code);
//			String openId = map.get("openid");
//			user =  iUserService.getUserInfoByOpenId(openId);
//			if(user != null && ("7".equals(user.getRoleId()) || "4011".equals(user.getRoleId())
//					|| "3008".equals(user.getRoleId())|| "4010".equals(user.getRoleId())
//					|| "3".equals(user.getRoleId())|| "1".equals(user.getRoleId()))) {
//				//通过当前用户获取当前用户下有多少经销商店
//				List<String> dealerShopIds =  iDealerShopWithUserService.getDealerShopIdByUserId(user.getId());
//				if(dealerShopIds.size() > 1) {
//					List<DealerShop> dealerShops  = iDealerShopService.getDealerShopInfoByIds(dealerShopIds);
//					modelMap.put("dealerShops",dealerShops);
//					return "store_list2";
//				}else if(dealerShopIds.size() == 1) {
//					List<DealerShopAccountDetail> dealerShopAccountDetail =  dealerShopAccountDetailServiceImpl.getDealerShopAccountDetailByDealShaopId(id);
//					modelMap.put("dealerShopAccountDetail",dealerShopAccountDetail);
//					return "billing_details";
//				}
//				
//			}
//		}
//		
//		return "not_dealer";
//	}
	
	
	/**
	 * 
	* @Title: balanceEnquiry
	* @Description: 店面信息
	* @param @param code
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	@RequestMapping("store_information.do")
	public String balanceEnquiry(String code,String id,ModelMap modelMap) {
		
		User user = null;
		if(id != null) {
			DealerShop dealerShop  = iDealerShopService.getDealerShopInfoById(id);
			modelMap.put("dealerShop",dealerShop);
			return "store_information";
		}
		
		
		if(code != null) {
			Map<String,String> map = userInfoUtil.getOpenIdByCode(code);
			String openId = map.get("openid");
			user =  iUserService.getUserInfoByOpenId(openId);
			if(user != null && ("7".equals(user.getRoleId()) || "4011".equals(user.getRoleId())
					|| "3008".equals(user.getRoleId())|| "4010".equals(user.getRoleId())
					|| "3".equals(user.getRoleId())|| "1".equals(user.getRoleId()))) {
				//通过当前用户获取当前用户下有多少经销商店
				List<String> dealerShopIds =  iDealerShopWithUserService.getDealerShopIdByUserId(user.getId());
				if(dealerShopIds.size() > 1) {
					List<DealerShop> dealerShops  = iDealerShopService.getDealerShopInfoByIds(dealerShopIds);
					modelMap.put("dealerShops",dealerShops);
					return "store_list3";
				}else if(dealerShopIds.size() == 1) {
					String dealerShopId = dealerShopIds.get(0);
					DealerShop dealerShop  = iDealerShopService.getDealerShopInfoById(dealerShopId);
					modelMap.put("dealerShop",dealerShop);
					return "store_information";
				}
				
			}
		}
		
		return "not_dealer";
	}
	
	
	
	
	
		
}
