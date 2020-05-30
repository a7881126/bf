package org.boot.az.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.boot.az.pojo.DealerShop;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午8:19:02 

* 类说明 

*/
public interface IDealerShopService {


	/**
	 * 
	 * @Description 通过id获取经销店信息
	 * @author Administrator
	 * @date 2019年3月2日
	 * @param ids
	 * @return  
	 * @throws
	 */
	DealerShop getDealerShopInfoById(String id);
	
	
	/**
	 * 
	 * @Description 获取多个
	 * @author Administrator
	 * @date 2019年3月2日
	 * @param ids
	 * @return  
	 * @throws
	 */
	List<DealerShop> getDealerShopInfoByIds(List<String> ids);
	
	
	
	
	
	
	/**
	 * 
	 * @Description 通过经销商Id获取旗下门店信息
	 * @author Administrator
	 * @date 2019年3月2日
	 * @param dealerId
	 * @return  
	 * @throws
	 */
	List<DealerShop>  getDealerShopInfoByDealerId(String dealerId);
	
	
	
	
}
