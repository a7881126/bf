package org.boot.az.service;

import javax.annotation.Resource;

import org.boot.az.mapper.RoleMapper;
import org.boot.az.pojo.Role;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午8:53:12 

* 类说明 

*/
@Service
public class RoleServiceImpl implements IRoleService{

	@Resource
	private RoleMapper roleMapper;
	
	
	@Override
	public Role getRoleInfoById(String id) {
		Role role = roleMapper.getRoleInfoById(id);
		return role;
	}

	
}
