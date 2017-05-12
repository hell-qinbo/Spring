package com.qinbo.test;

import com.qinbo.entity.Role;
import com.qinbo.service.role.RoleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/5/12.
 */

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "file:E:\\Spring\\web-ssm\\target\\classes\\spring-mvc.xml", "file:E:\\Spring\\web-ssm\\target\\classes\\spring-mybatis.xml" })
public class TestRole
{
	@Resource
	private RoleServiceImpl service;

	@Test
	public void getRoleById()
	{
		Object id = "";
		Role role = service.selectById(id);
		System.out.println(role);
	}

}
