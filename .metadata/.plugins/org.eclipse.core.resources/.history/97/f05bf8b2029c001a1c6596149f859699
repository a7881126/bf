package org.boot.az.service;

import javax.annotation.Resource;
import javax.swing.plaf.synth.Region;

import org.boot.az.mapper.RegionMapper;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午9:29:43 

* 类说明 

*/
@Service
public class RegionServiceImpl implements IRegionService{

	@Resource
	private RegionMapper regionMapper;
	
	@Override
	public Region getRegionInfoById(String id) {
		Region region = regionMapper.getRegionInfoById(id);
		return region;
	}

}
