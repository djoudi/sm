package com.sm.dao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.core.Events;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.Student;
import com.sm.util.SchoolConstants;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@Name("studentHome")
public class StudentHome extends EntityHome<Student>
{

	public void setStudentId(Long id)
	{
		setId(id);
	}

	public Long getStudentId()
	{
		return (Long) getId();
	}

	@Override
	protected Student createInstance()
	{
		Student student = new Student();
		return student;
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

	public Student getDefinedInstance()
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
		super.persist();
		Events.instance().raiseEvent(SchoolConstants.ADD_STUDENT_TO_BATCH, getInstance());
		return "persisted";
	}

}
