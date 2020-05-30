/**
 * @FileName DealerShopAccountDetailServiceImpl.java
 * @Desciption TODO
 * @author Administrator
 * @date 2019年3月4日
 */

package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.DealerShopAccountDetailMapper;
import org.boot.az.pojo.DealerShopAccountDetail;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author Administrator
 * @date 2019年3月4日
 */
@Service
public class DealerShopAccountDetailServiceImpl  implements IDealerShopAccountDetailService{



	
	@Resource
	private DealerShopAccountDetailMapper dealerShopAccountDetailMapper;
	
	@Override
	public List<DealerShopAccountDetail> getDealerShopAccountDetailByDealShaopId(String dealShaopId) {
		return dealerShopAccountDetailMapper.getDealerShopAccountDetailByDealShaopId(dealShaopId);
	}

}
