package org.boot.az.mapper;

import javax.swing.plaf.synth.Region;

import org.apache.ibatis.annotations.Select;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午9:28:19 

* 类说明 

*/
public interface RegionMapper {

	@Select("SELECT * FROM T_Region WHERE Id = #{Id}")
	Region getRegionInfoById(String id);
}
