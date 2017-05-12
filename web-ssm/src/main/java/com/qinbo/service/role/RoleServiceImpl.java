package com.qinbo.service.role;

import com.qinbo.dao.role.RoleDao;
import com.qinbo.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/12.
 */
@Service
public class RoleServiceImpl implements RoleService
{
	@Autowired
	private RoleDao dao;

	@Override
	public Object insert(Map<String, Object> map)
	{
		return null;
	}

	@Override
	public Role selectById(Object id)
	{
		return dao.selectById(id);
	}

	@Override
	public List<Role> selectByIds(List<Object> ids)
	{
		return null;
	}

	@Override
	public List<Role> selectByCon(Map<String, Object> map)
	{
		return null;
	}

	@Override
	public Object deleteById(Object id)
	{
		return null;
	}

	@Override
	public Object deleteByIds(List<Object> ids)
	{
		return null;
	}

	@Override
	public Object updateById(Map<String, Object> map)
	{
		return null;
	}
}
