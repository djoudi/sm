package com.sm.dao;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.sm.model.Student;
import com.sm.model.Student;

@Name("studentList")
public class StudentList extends EntityQuery<Student>
{

	private static final String EJBQL = "select student from Student student";

	private static final String[] RESTRICTIONS = { "lower(student.firstName) like lower(concat('%',#{studentList.student.firstName},'%'))", };

	private Student student = new Student();

	public StudentList()
	{
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Student getStudent()
	{
		return student;
	}

}
