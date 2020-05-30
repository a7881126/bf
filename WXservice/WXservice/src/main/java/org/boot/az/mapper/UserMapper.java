package org.boot.az.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.User;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月21日 下午4:48:53 

* 类说明 

*/

public interface UserMapper {

	/**
	 * 
	* @Title: getUserID
	* @Description: 通过微信ID获取用户信息
	* @param @return    参数
	* @return Integer    返回类型
	* @throws
	 */
	@Select("SELECT  *  FROM T_User WHERE OpenId = #{OpenId}")
	User getUserInfoByOpenId(String openId);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
