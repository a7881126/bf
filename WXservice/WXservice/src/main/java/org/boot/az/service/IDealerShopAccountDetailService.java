/**
 * @FileName IDealerShopAccountDetailService.java
 * @Desciption TODO
 * @author Administrator
 * @date 2019年3月4日
 */

package org.boot.az.service;

import java.util.List;

import org.boot.az.pojo.DealerShopAccountDetail;

/**
 * @Description TODO
 * @author Administrator
 * @date 2019年3月4日
 */

public interface IDealerShopAccountDetailService {

	
	/**
	 * 
	 * @Description 获取账户日志信息
	 * @author Administrator
	 * @date 2019年3月4日
	 * @param dealShaopId
	 * @return  
	 * @throws
	 */
	List<DealerShopAccountDetail> getDealerShopAccountDetailByDealShaopId(String dealShaopId);
}
