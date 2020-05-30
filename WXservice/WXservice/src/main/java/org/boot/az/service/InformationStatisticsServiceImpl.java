/**
 * @FileName InformationStatisticsServiceImpl.java
 * @Desciption TODO
 * @author Administrator
 * @date 2019年3月4日
 */

package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.InformationStatisticsMapper;
import org.boot.az.pojo.InformationStatistics;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author Administrator
 * @date 2019年3月4日
 */

@Service
public class InformationStatisticsServiceImpl implements IInformationStatisticsService{


	@Resource
	private InformationStatisticsMapper informationStatisticsMapper;
	
	@Override
	public List<InformationStatistics> getInformationStatisticsByDealerShopId(String dealerShopId) {
		
		return informationStatisticsMapper.getInformationStatisticsByDealerShopId(dealerShopId);
	}

	
	
}
