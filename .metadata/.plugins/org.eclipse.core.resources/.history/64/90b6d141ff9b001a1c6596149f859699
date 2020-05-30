package org.boot.az.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.Dealer;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午8:17:19 

* 类说明 

*/
public interface IDealerService {

	/**
	 * 
	* @Title: getDealerInfoById
	* @Description: 通过Id获取经销商信息
	* @param @param id
	* @param @return    参数
	* @return Dealer    返回类型
	* @throws
	 */
	Dealer getDealerInfoById(String id);
	
	
	/**
	 * 
	* @Title: getDealerInfoAreaId
	* @Description: 通过区域Id获取此区域的所有经销商信息
	* @param @param aredId
	* @param @return    参数
	* @return List<Dealer>    返回类型
	* @throws
	 */
	List<Dealer> getDealerInfoAreaId(String aredId);
}
