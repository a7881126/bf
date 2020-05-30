package org.boot.az.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月22日 下午2:50:33 

* 类说明   经销商店和用户中间表

*/

public interface DealerShopWithUserMapper {

	
	@Select("SELECT UserId FROM T_DealerShop_User WHERE DealerShopId = #{DealerShopId} ")
	String getUserIdByDealerShopId(String dealerShopId);
	
	@Select("SELECT DealerShopId FROM T_DealerShop_User WHERE UserId = #{UserId} ")
	List<String> getDealerShopIdByUserId(String userId);
}
