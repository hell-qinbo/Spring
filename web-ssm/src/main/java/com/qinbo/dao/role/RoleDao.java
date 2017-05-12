package com.qinbo.dao.role;

import com.qinbo.entity.Role;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/12.
 */
@Repository
public class RoleDao implements IRole
{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public Object insert(Map<String, Object> map)
	{
		return sqlSessionTemplate.insert("insert", map);
	}

	@Override
	public Role selectById(Object id)
	{
		Role role = sqlSessionTemplate.selectOne("selectById", id);

		return role;
	}

	@Override
	public List<Role> selectByIds(List<Object> ids)
	{
		List<Role> roles = sqlSessionTemplate.selectList("selectByIds", ids);
		return roles;
	}

	@Override
	public List<Role> selectByCon(Map<String, Object> map)
	{
		List<Role> roles = sqlSessionTemplate.selectList("selectByCon", map);
		return roles;
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
}
