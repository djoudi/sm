package com.sm.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class CourseVO extends PO
{

	private String name;
	private String code;
	private Batch batch;

	@Column(name = "name")
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "code")
	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@ManyToOne
	@JoinColumn(name = "batch_id")
	public Batch getBatch()
	{
		return batch;
	}

	public void setBatch(Batch batch)
	{
		this.batch = batch;
	}

}
