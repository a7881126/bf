package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.DealerMapper;
import org.boot.az.pojo.Dealer;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午8:16:45 

* 类说明 

*/
@Service
public class DealerServiceImpl implements IDealerService{

	@Resource
	private DealerMapper dealerMapper;
	
	@Override
	public Dealer getDealerInfoById(String id) {
		Dealer dealer = dealerMapper.getDealerInfoById(id);
		return dealer;
	}

	@Override
	public List<Dealer> getDealerInfoAreaId(String aredId) {
		List<Dealer> dealers= dealerMapper.getDealerInfoAreaId(aredId);
		return dealers;
	}

}
