package com.tan.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tan.mybatis.bean.User;
import com.tan.mybatis.mapper.UserMapper;

public class TestMybatis {

	public static void main(String[] args) throws Exception {
		String url = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(url);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = ssf.openSession();
		
		UserMapper userMapper = session.getMapper(UserMapper.class);
		User user = userMapper.selectById("1");
		
		session.commit();
		System.out.println(user);
		session.close();
		
	}

}
