package com.sm.dao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.BatchStudent;
import com.sm.model.Student;
import com.sm.util.SchoolConstants;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@Name("batchStudentHome")
public class BatchStudentHome extends EntityHome<BatchStudent>
{

	public void setBatchStudentId(Long id)
	{
		setId(id);
	}

	public Long getBatchStudentId()
	{
		return (Long) getId();
	}

	@Override
	protected BatchStudent createInstance()
	{
		BatchStudent batchStudent = new BatchStudent();
		return batchStudent;
	}

	public void load()
	{
		if (isIdDefined())
		{
			wire();
		}
	}

	public void wire()
	{
		getInstance();

	}

	public boolean isWired()
	{
		return true;
	}

	public BatchStudent getDefinedInstance()
	{
		return isIdDefined() ? getInstance() : null;
	}

	@Override
	public String update()
	{
		wire();
		return super.update();
	}

	@Override
	public String persist()
	{
		wire();
		return super.persist();
	}

	// TODO : catch exception
	@Observer(value = SchoolConstants.ADD_STUDENT_TO_BATCH)
	public void addStudentToBatch(Student student)
	{
		if (student != null)
		{
			getInstance().setStudent(student);
		}
		persist();
	}

}
