package com.tan.mybatis.mapper;

import com.tan.mybatis.bean.User;

public interface UserMapper {
	
	User selectById(String id);

}
