package com.qinbo.service.employee;

import com.qinbo.dao.employee.EmployeeDao;
import com.qinbo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/8.
 */

@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	private EmployeeDao dao;

	@Override
	public Object insert(Map<String, Object> map)
	{
		return dao.insert(map);
	}

	@Override
	public Employee selectById(Object id)
	{
		return dao.selectById(id);
	}

	@Override
	public List<Employee> selectByIds(List<Object> ids)
	{
		return dao.selectByIds(ids);
	}

	@Override
	public List<Employee> selectByCon(Map<String, Object> map)
	{
		return dao.selectByCon(map);
	}

	@Override
	public Object deleteById(Object id)
	{
		return dao.deleteById(id);
	}

	@Override
	public Object deleteByIds(List<Object> ids)
	{
		return dao.deleteByIds(ids);
	}

	@Override
	public Object updateById(Map<String, Object> map)
	{
		return dao.updateById(map);
	}

	@Override
	public Object updateByIds(Map<String, Object> map)
	{
		return dao.updateByIds(map);
	}
}
