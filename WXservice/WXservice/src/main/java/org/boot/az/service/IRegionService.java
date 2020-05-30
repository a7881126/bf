package org.boot.az.service;

import javax.swing.plaf.synth.Region;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午9:30:00 

* 类说明 

*/
public interface IRegionService {

	/**
	 * 
	* @Title: getRegionInfoById
	* @Description: 通过Id获取大区信息
	* @param @param id
	* @param @return    参数
	* @return Region    返回类型
	* @throws
	 */
	Region getRegionInfoById(String id);
}
