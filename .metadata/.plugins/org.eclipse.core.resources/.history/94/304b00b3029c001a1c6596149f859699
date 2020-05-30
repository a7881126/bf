package org.boot.az.mapper;

import java.util.List;
import org.apache.ibatis.annotations.SelectProvider;
import org.boot.az.pojo.InformationStatistics;

public interface InformationStatisticsMapper {
	/** 
	
	* @author 作者 : 阿铮
	
	* @version 创建时间：2019年2月26日 上午9:10:46 
	
	* 类说明 
	
	*/

	@SelectProvider(type=DealGetInformationStatisticsByDealerShopId.class,method="getInformationStatisticsByDealerShopId")
	List<InformationStatistics> getInformationStatisticsByDealerShopId(String dealerShopId);
	class DealGetInformationStatisticsByDealerShopId{
		public String getInformationStatisticsByDealerShopId(String dealerShopId) {
			
			String sql = "select \r\n" + 
					"a.Compname  ,year(a.TrackDate6) as  year,month(a.TrackDate6) as month,count(*) as count,\r\n" + 
					"round(sum(a.FactrorySettlementPrice),0) as FactrorySettlementPrice\r\n" + 
					"from \r\n" + 
					"T_SalesOrder a \r\n" + 
					"where  \r\n" + 
					"a.TrackDate6 is not null and a.DealerShop_Id = "+dealerShopId+"  and year(a.TrackDate6) = year(GETDATE())\r\n" + 
					"group by month(a.TrackDate6),year(a.TrackDate6),Compname\r\n" + 
					"order by year desc,month ";
	
			
			return sql;
		}

	}
	
}
