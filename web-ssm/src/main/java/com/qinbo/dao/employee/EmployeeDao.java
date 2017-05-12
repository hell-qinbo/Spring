package com.qinbo.dao.employee;

import com.qinbo.entity.Employee;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/8.
 */
@Repository
public class EmployeeDao implements IEmployee
{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public Employee selectById(Object id)
	{
		Employee employee = sqlSessionTemplate.selectOne("selectById", id);

		return employee;
	}

	@Override
	public List<Employee> selectByIds(List<Object> ids)
	{
		List<Employee> employees = sqlSessionTemplate.selectList("selectByIds", ids);
		return employees;
	}

	@Override
	public List<Employee> selectByCon(Map<String, Object> map)
	{

		List<Employee> employees = sqlSessionTemplate.selectList("selectByCon", map);

		return employees;
	}

	@Override
	public Object insert(Map<String, Object> map)
	{
		return sqlSessionTemplate.insert("insert", map);
	}

	@Override
	public Object deleteById(Object id)
	{
		return sqlSessionTemplate.delete("deleteById", id);
	}

	@Override
	public Object deleteByIds(List<Object> ids)
	{
		return sqlSessionTemplate.delete("deleteByIds", ids);
	}

	@Override
	public Object updateById(Map<String, Object> map)
	{
		return sqlSessionTemplate.update("updateById", map);
	}

	@Override
	public Object updateByIds(Map<String, Object> map)
	{
		return sqlSessionTemplate.update("updateByIds", map);
	}
}
