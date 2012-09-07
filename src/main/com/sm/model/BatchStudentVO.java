package com.sm.model;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class BatchStudentVO extends PO
{

	private Student student;
	private Batch batch;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	@ManyToOne(fetch = FetchType.LAZY)
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
