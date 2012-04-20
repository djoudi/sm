package com.sm.dao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.Course;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
@Name("courseHome")
public class CourseHome extends EntityHome<Course>
{
	
	public void setCourseId(Long id)
	{
		setId(id);
	}

	public Long getCourseId()
	{
		return (Long) getId();
	}

	@Override
	protected Course createInstance()
	{
		Course course = new Course();
		return course;
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

	public Course getDefinedInstance()
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

}
