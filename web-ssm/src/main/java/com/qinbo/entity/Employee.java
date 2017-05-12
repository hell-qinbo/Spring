package com.qinbo.entity;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by admin on 2017/5/8.
 */
@Component
public class Employee
{
	private String id;

	private String createDate;

	private String loginname;

	private String loginpassword;

	private String username;

	private int sex;

	private String email;

	private String telphone;

	private String idcaid;

	private String address;

	private int state;

	private String photo;

	private String role_id;

	private List<Role> roles;

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

	public String getLoginpassword()
	{
		return loginpassword;
	}

	public void setLoginpassword(String loginpassword)
	{
		this.loginpassword = loginpassword;
	}

	public String getLoginname()
	{
		return loginname;
	}

	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getSex()
	{
		return sex;
	}

	public void setSex(int sex)
	{
		this.sex = sex;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getTelphone()
	{
		return telphone;
	}

	public void setTelphone(String telphone)
	{
		this.telphone = telphone;
	}

	public String getIdcaid()
	{
		return idcaid;
	}

	public void setIdcaid(String idcaid)
	{
		this.idcaid = idcaid;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public int getState()
	{
		return state;
	}

	public void setState(int state)
	{
		this.state = state;
	}

	public String getPhoto()
	{
		return photo;
	}

	public void setPhoto(String photo)
	{
		this.photo = photo;
	}

	public String getRole_id()
	{
		return role_id;
	}

	public void setRole_id(String role_id)
	{
		this.role_id = role_id;
	}

	public List<Role> getRoles()
	{
		return roles;
	}

	public void setRoles(List<Role> roles)
	{
		this.roles = roles;
	}

	@Override
	public String toString()
	{
		return "Employee:" + "loginnmae:" + loginname;
	}
}
