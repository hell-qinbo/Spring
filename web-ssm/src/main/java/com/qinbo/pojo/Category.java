package com.qinbo.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/4/27.
 */
@Component()
public class Category
{

	private int id;

	private String name = "category1";

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
