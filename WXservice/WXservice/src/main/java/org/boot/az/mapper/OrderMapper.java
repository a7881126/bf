package org.boot.az.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.boot.az.pojo.Order;
import org.boot.az.service.OrderServiceImpl;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月20日 下午5:49:19 

* 类说明 

*/
public interface OrderMapper {

	@Select("SELECT * FROM T_SalesOrder WHERE OpenId = #{OpenId} ORDER BY SalesOrderId DESC")
	List<Order> getOrderInfoByOpenId( String openId);
	
	
	@SelectProvider(type=DealGetOrderInfoByDealerShopId.class,method="getOrderInfoByDealerShopId")
	List<Order> getOrderInfoByDealerShopId(List<String> dealerShopIds,String orderBy,Integer offset,Integer count);
	class DealGetOrderInfoByDealerShopId{
		//方法中的关键字是区分大小写的  SQL SELECT WHERE
	    //该方法会根据传递过来的map中的参数内容  动态构建sql语句
	    public String getOrderInfoByDealerShopId(Map map) {
	    	List<String> dealerShopIds  = (List<String>)map.get("dealerShopIds");
	    	String orderBy = (String) map.get("orderBy");
	    	Integer offset = (Integer) map.get("offset");
	    	Integer count = (Integer) map.get("count");
	    	StringBuilder sb = new StringBuilder();
	    	for(String dealerShopId : dealerShopIds) {
	    		sb.append("'");
	    		sb.append(dealerShopId);
	    		sb.append("',");
	    	}
	    	String str = sb.toString();
	    	str = str.substring(0,str.length()-1);	    	
	    	SQL sql = new SQL().SELECT("*").FROM("T_SalesOrder").WHERE("DealerShop_Id in ("+str+")").ORDER_BY(orderBy+" offset "+offset+" rows fetch next "+count+" rows only");
	    	System.out.println(sql.toString());
	    	return sql.toString();
   
	    }
	}
	
	
	
	@Select("SELECT * FROM T_SalesOrder WHERE SalesOrderId = #{SalesOrderId}")
	Order getOrderInfoBySalesOrderId(String SalesOrderId);
	
	
	
	@SelectProvider(type=DealGetOrdersCountByDealerShopId.class,method="getOrdersCountByDealerShopId")
	Integer getOrdersCountByDealerShopId(@Param("dealerShopIds") List<String> dealerShopIds);
	class DealGetOrdersCountByDealerShopId{
		public String getOrdersCountByDealerShopId(Map map) {
			System.out.println(map);
			List<String> dealerShopIds  = (List<String>)map.get("dealerShopIds");
			StringBuilder sb = new StringBuilder();
			for(String dealerShopId : dealerShopIds) {
	    		sb.append("'");
	    		sb.append(dealerShopId);
	    		sb.append("',");
	    	}
			String str = sb.toString();
	    	str = str.substring(0,str.length()-1);	 
	    	SQL sql = new SQL().SELECT("count(1)").FROM("T_SalesOrder").WHERE("DealerShop_Id in ("+str+")");
	    	System.out.println(sql.toString());
	    	return sql.toString();
		}
	}
	
	
	@Select("SELECT count(1) FROM T_SalesOrder WHERE openId = #{openId}")
	Integer getOrdersCountByOpenId(String openId);
	
	
	
	
	
	
	
	
	
	
	
	
//	@Select({"<script>",
//	    "SELECT * FROM tbl_order",
//	    "WHERE 1=1",
//	    "<when test='title!=null'>",
//	    "AND mydate = #{mydate}",
//	    "</when>",
//	    "</script>"})
	
	
	
	
//	   @Insert("INSERT INTO t_user(gmt_create, gmt_modified, user_name) values(now(), now(), #{userName})")
//	    public int insert(@Param("userName") String userName);
//	    
//	　　
//	　  @Select("SELECT * FROM t_user WHERE id = #{id}")
//	    public UserDO selectByUserId(@Param("id") Long id) ;
//	    
//
//	    @Update("UPDATE t_user SET gmt_modified = now(), user_name = #{userName} WHERE id = #{id}")
//	    public int udpateById(@Param("userName") String userName, @Param("id") Long id) ;
//
//	    @Delete("DELETE  FROM t_user WHERE id = #{id}")
//	    public int udpateById(@Param("id") Long id) ;
	
}
