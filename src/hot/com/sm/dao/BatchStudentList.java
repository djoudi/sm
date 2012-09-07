package com.sm.dao;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.sm.model.BatchStudent;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
@Name("batchStudentList")
public class BatchStudentList extends EntityQuery<BatchStudent>
{

	private static final String EJBQL = "select bs from BatchStudent bs";

	private static final String[] RESTRICTIONS = {  };
	
	private BatchStudent bacthStudent = new BatchStudent();

	public BatchStudentList()
	{
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));	
	}

	public BatchStudent getBacthStudent()
	{
		return bacthStudent;
	}
	

	
	
	
}
