package org.boot.az.mapper;

import org.apache.ibatis.annotations.Select;
import org.boot.az.pojo.Role;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月22日 下午2:16:07 

* 类说明 

*/
public interface RoleMapper {

	@Select("SELECT * FROM T_Region where Id = #{Id}")
	Role getRoleInfoById(String id);
}
