package com.qinbo.service.employee;

import com.qinbo.entity.Employee;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/8.
 */
public interface EmployeeService
{
	Object insert(Map<String, Object> map);

	Employee selectById(Object id);

	List<Employee> selectByIds(List<Object> ids);

	List<Employee> selectByCon(Map<String, Object> map);

	Object deleteById(Object id);

	Object deleteByIds(List<Object> ids);

	Object updateById(Map<String, Object> map);

	Object updateByIds(Map<String, Object> map);
}
