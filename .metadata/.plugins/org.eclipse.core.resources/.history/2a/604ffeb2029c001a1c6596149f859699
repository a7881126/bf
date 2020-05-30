package org.boot.az.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.Area;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午9:10:46 

* 类说明 

*/
public interface AreaMapper {

	@Select("SELECT * FROM T_Area WHERE Id = #{Id}")
	Area getAreaInfoById(String id);
	

	@Select("SELECT * FROM T_Area WHERE Region_Id = #{Region_Id}")
	List<Area> getAreaInfoByRegionId(String regionId);
}
