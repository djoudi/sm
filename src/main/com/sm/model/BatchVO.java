package com.sm.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class BatchVO extends PO
{
	private String name;
	private Date startDate;
	private Date endDate;
	private Set<Course> courses = new HashSet<Course>(0);

	@Column(name="name")
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name="start_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	@Column(name="end_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "batch")
	public Set<Course> getCourses()
	{
		return courses;
	}

	public void setCourses(Set<Course> courses)
	{
		this.courses = courses;
	}
	
	

}
