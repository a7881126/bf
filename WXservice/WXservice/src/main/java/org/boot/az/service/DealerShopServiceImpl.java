package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.DealerShopMapper;
import org.boot.az.pojo.DealerShop;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午8:18:44 

* 类说明 

*/
@Service
public class DealerShopServiceImpl implements IDealerShopService{

	@Resource
	private DealerShopMapper dealerShopMapper;

	@Override
	public List<DealerShop> getDealerShopInfoByIds(List<String> ids) {
		return dealerShopMapper.getDealerShopInfoByIds(ids);
	}

	@Override
	public List<DealerShop> getDealerShopInfoByDealerId(String dealerId) {
		return dealerShopMapper.getDealerShopInfoByDealerId(dealerId);
	}

	@Override
	public DealerShop getDealerShopInfoById(String id) {
		return dealerShopMapper.getDealerShopInfoById(id);
	}
	
	

}
