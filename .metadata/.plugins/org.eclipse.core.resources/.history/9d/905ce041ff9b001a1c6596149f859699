package org.boot.az.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.boot.az.mapper.OrderMapper.DealGetOrderInfoByDealerShopId;
import org.boot.az.pojo.DealerShop;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月22日 下午2:58:44 

* 类说明 

*/

public interface DealerShopMapper {

	/**
	 * 
	 * @Description  通过经销店Id获取经销店信息
	 * @author Administrator
	 * @date 2019年3月4日
	 * @param id
	 * @return  
	 * @throws
	 */
	@Select("SELECT * FROM T_DealerShop where Id = #{id}")
	DealerShop getDealerShopInfoById(String id);
	
	
	
	/**
	 * 
	 * @Description 通过经销店多个Id获取多个经销店信息
	 * @author Administrator
	 * @date 2019年3月4日
	 * @param ids
	 * @return  
	 * @throws
	 */
	@SelectProvider(type=DealDetDealerShopInfoByIds.class,method="getDealerShopInfoByIds")
	List<DealerShop> getDealerShopInfoByIds(@Param("ids") List<String> ids);
	class DealDetDealerShopInfoByIds{
		public String getDealerShopInfoByIds(Map map) {
			System.out.println(map);
			List<String> ids  = (List<String>)map.get("ids");
			StringBuilder sb = new StringBuilder();
			for(String id : ids) {
	    		sb.append("'");
	    		sb.append(id);
	    		sb.append("',");
	    	}
			String str = sb.toString();
	    	str = str.substring(0,str.length()-1);	 
	    	SQL sql = new SQL().SELECT("*").FROM("T_DealerShop").WHERE("Id in ("+str+")");
	    	System.out.println(sql.toString());
	    	return sql.toString();
		}
	}
	
	
	/**
	 * 
	 * @Description 获取经销店信息通过经销商Id
	 * @author Administrator
	 * @date 2019年3月4日
	 * @param dealerId
	 * @return  
	 * @throws
	 */
	@Select("SELECT * FROM T_DealerShop where Dealer_Id = #{Dealer_Id}")
	List<DealerShop> getDealerShopInfoByDealerId(String dealerId);
	
	

	
}
