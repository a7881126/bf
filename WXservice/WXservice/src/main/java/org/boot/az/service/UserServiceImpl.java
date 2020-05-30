package org.boot.az.service;

import javax.annotation.Resource;

import org.boot.az.mapper.UserMapper;
import org.boot.az.pojo.User;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月21日 下午4:54:25 

* 类说明 

*/
@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserInfoByOpenId(String openId) {
		User user = userMapper.getUserInfoByOpenId(openId);
		return user;
	}
	
	
	
	
}
