/**
 * @FileName DealerShopAccountDetailMapper.java
 * @Desciption TODO
 * @author Administrator
 * @date 2019年3月4日
 */

package org.boot.az.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.DealerShopAccountDetail;

/**
 * @Description 账户日志
 * @author Administrator
 * @date 2019年3月4日
 */

public interface DealerShopAccountDetailMapper {

	@Select("SELECT\r\n" + 
			"  SalesOrderId ,\r\n" + 
			"  Amount,\r\n" + 
			"  CreatedTime,\r\n" + 
			"  PayType ,\r\n" + 
			"  Remark \r\n" + 
			"  FROM \r\n" + 
			"  T_DealerShopAccountDetail  \r\n" + 
			"  WHERE \r\n" + 
			"  DealerShop_Id = #{dealerShop_Id}")
	List<DealerShopAccountDetail> getDealerShopAccountDetailByDealShaopId(String dealShaopId);
}
