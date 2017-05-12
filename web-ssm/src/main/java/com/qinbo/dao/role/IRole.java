package com.qinbo.dao.role;

import com.qinbo.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/5.
 */
public interface IRole
{

	Object insert(Map<String, Object> map);

	Role selectById(Object id);

	List<Role> selectByIds(List<Object> ids);

	List<Role> selectByCon(Map<String, Object> map);

	Object deleteById(Object id);

	Object deleteByIds(List<Object> ids);

	Object updateById(Map<String, Object> map);

}
