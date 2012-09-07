package com.sm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class ExamVO extends PO
{

	private Date startTime;
	private Date endTime;
	private BigDecimal minimumMarks;
	private BigDecimal maximumMarks;

	@Column(name = "start_time")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}

	
	@Column(name = "end_time")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Date endTime)
	{
		this.endTime = endTime;
	}

	@Column(name = "minimum_marks")
	public BigDecimal getMinimumMarks()
	{
		return minimumMarks;
	}

	public void setMinimumMarks(BigDecimal minimumMarks)
	{
		this.minimumMarks = minimumMarks;
	}

	@Column(name = "maximum_marks")
	public BigDecimal getMaximumMarks()
	{
		return maximumMarks;
	}

	public void setMaximumMarks(BigDecimal maximumMarks)
	{
		this.maximumMarks = maximumMarks;
	}

}
