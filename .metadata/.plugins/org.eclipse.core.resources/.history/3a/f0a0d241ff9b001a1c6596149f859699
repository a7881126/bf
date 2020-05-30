package org.boot.az.service;

import java.util.List;

import javax.annotation.Resource;

import org.boot.az.mapper.AreaMapper;
import org.boot.az.pojo.Area;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午9:13:48 

* 类说明 

*/
@Service
public class AreaServiceImpl implements IAreaService{

	@Resource
	private AreaMapper areaMapper;
	
	@Override
	public Area getAreaInfoById(String id) {
		Area area = areaMapper.getAreaInfoById(id);
		return area;
	}

	@Override
	public List<Area> getAreaInfoByRegionId(String regionId) {
		List<Area> areas = areaMapper.getAreaInfoByRegionId(regionId);
		return areas;
	}

	
}
