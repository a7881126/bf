package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.DealerShopWithUserMapper;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月25日 下午6:40:35 

* 类说明 

*/
@Service
public class DealerShopWithUserServiceImpl implements IDealerShopWithUserService {

	@Resource
	private DealerShopWithUserMapper dealerShopWithUserMapper;
	
	
	@Override
	public String getUserIdByDealerShopId(String dealerShopId) {
		String userId = dealerShopWithUserMapper.getUserIdByDealerShopId(dealerShopId);
		return userId;
	}

	@Override
	public List<String> getDealerShopIdByUserId(String userId) {
		List<String> dealerShopIds = dealerShopWithUserMapper.getDealerShopIdByUserId(userId);
		return dealerShopIds;
	}
	
	
	

}
