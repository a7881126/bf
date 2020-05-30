package org.boot.az.service;

import org.boot.az.pojo.User;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月21日 下午4:56:12 

* 类说明 

*/
public interface IUserService {

	
	
	/**
	 * 
	* @Title: getUserInfoByOpenId
	* @Description: 通过微信ID获取用户信息
	* @param @param openId
	* @param @return    参数
	* @return User    返回类型
	* @throws
	 */
	User getUserInfoByOpenId(String openId);
	
}
