package com.qinbo.entity;

import java.util.List;

/**
 * Created by admin on 2017/5/8.
 */
public class Role
{
	private String id;

	private String createDate;

	private String roleName;

	private int state;

	private List<Employee> employees;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(String createDate)
	{
		this.createDate = createDate;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	public int getState()
	{
		return state;
	}

	public void setState(int state)
	{
		this.state = state;
	}

	public List<Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployees(List<Employee> employees)
	{
		this.employees = employees;
	}

	@Override
	public String toString()
	{
		return "Role:" + "roleName:" + roleName;
	}
}
