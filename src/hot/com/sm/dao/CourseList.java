package com.sm.dao;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.sm.model.Course;

@Name("courseList")
public class CourseList extends EntityQuery<Course>
{

	private static final String EJBQL = "select course from Course course";

	private static final String[] RESTRICTIONS = { "lower(course.name) like lower(concat('%',#{courseList.course.name},'%'))", };

	private Course course = new Course();

	public CourseList()
	{
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Course getCourse()
	{
		return course;
	}

}
