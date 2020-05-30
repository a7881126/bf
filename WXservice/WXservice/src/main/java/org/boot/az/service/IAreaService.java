package org.boot.az.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.Area;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午9:14:01 

* 类说明 

*/
public interface IAreaService {

	/**
	 * 
	* @Title: getAreaInfoById
	* @Description: 通过Id获取区域信息
	* @param @param id
	* @param @return    参数
	* @return Area    返回类型
	* @throws
	 */
	Area getAreaInfoById(String id);
	

	/**
	 * 
	* @Title: getAreaInfoByRegionId
	* @Description: 通过大区Id获取区域信息
	* @param @param regionId
	* @param @return    参数
	* @return List<Area>    返回类型
	* @throws
	 */
	List<Area> getAreaInfoByRegionId(String regionId);
}
