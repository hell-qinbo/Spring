package com.qinbo.test;

import com.qinbo.entity.Employee;
import com.qinbo.entity.Role;
import com.qinbo.service.employee.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/5.
 */

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "file:E:\\Spring\\web-ssm\\target\\classes\\spring-mvc.xml", "file:E:\\Spring\\web-ssm\\target\\classes\\spring-mybatis.xml" })
public class TestEmployee
{

	@Resource
	private EmployeeServiceImpl service;

	//insert
	@Test
	public void insertEmployee()
	{
		Map<String, Object> map = new HashMap<>();

		String username = "testNamedsadsad";
		map.put("loginname", "test12");
		map.put("loginpassword", "12345");
		map.put("username", username);
		map.put("sex", 1);
		map.put("email", "115@qq.com");
		map.put("telphone", "18629916381");
		map.put("idcaid", "12388549975");
		map.put("address", "朝阳");
		map.put("state", 2);
		map.put("photo", "hidhasi.jpg");
		map.put("role_id", "1");

		service.insert(map);
		if (username != "testName111")
		{
			service.insert(map);
		}
		else
		{
			throw new RuntimeException();
		}

		System.out.println(map.get("id"));

	}

	//delete
	@Test
	public void deleteEmployeeById()
	{
		Object id = "b8092a93-349b-11e7-a68c-408d5c1df864";
		int count = (int) service.deleteById(id);
		System.out.println(count);
	}

	@Test
	public void deleteEmployeeByIds()
	{

		List<Object> ids = new ArrayList<>();
		ids.add("b8092a93-349b-11e7-a68c-408d5c1df864");
		ids.add("4981987f-34b0-11e7-a68c-408d5c1df864");
		ids.add("fb52d117-349b-11e7-a68c-408d5c1df864");
		Object count = service.deleteByIds(ids);
		System.out.println(count);

	}

	//update
	@Test
	public void updateEmployeeById()
	{
		Map<String, Object> map = new HashMap<>();
		map.put("id", "b8092a93-349b-11e7-a68c-408d5c1df864");
		map.put("loginname", "modifyy1");
		map.put("username", "modifyname");
		Object count = service.updateById(map);
		System.out.println(count);
	}

	@Test
	public void updateEmployeeByIds()
	{
		Map<String, Object> map = new HashMap<>();
		List<String> ids = new ArrayList<>();
		ids.add("b8092a93-349b-11e7-a68c-408d5c1df864");
		ids.add("4981987f-34b0-11e7-a68c-408d5c1df864");
		ids.add("fb52d117-349b-11e7-a68c-408d5c1df864");
		map.put("loginname", "modifyy1");
		map.put("username", "modifyname");
		map.put("state", 0);
		map.put("list", ids);
		Object count = service.updateByIds(map);
		System.out.println(count);
	}

	//query
	@Test
	public void getEmployeeById()
	{
		Object id = "b8092a93-349b-11e7-a68c-408d5c1df864";
		Employee employee = service.selectById(id);
		System.out.println(employee);

	}

	@Test
	public void getEmployeeByIds()
	{
		List<Object> ids = new ArrayList<>();
		ids.add("b8092a93-349b-11e7-a68c-408d5c1df864");
		ids.add("4981987f-34b0-11e7-a68c-408d5c1df864");
		ids.add("fb52d117-349b-11e7-a68c-408d5c1df864");
		List<Employee> employees = service.selectByIds(ids);
		System.out.println(employees.size());
	}

	@Test
	public void getEmployeeByCon()
	{

		Map<String, Object> map = new HashMap<>();

		List<Employee> employees = service.selectByCon(map);

		for (Employee employee : employees)
		{
			System.out.println(employee.getUsername() + ":");
			List<Role> roles = employee.getRoles();
			for (Role role : roles)
			{
				System.out.println(role.getRoleName());
			}

		}

	}

}
