package com.sm.dao;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.sm.model.Employee;

@Name("employeeList")
public class EmployeeList extends EntityQuery<Employee>
{

	private static final String EJBQL = "select emp from Employee emp";

	private static final String[] RESTRICTIONS = { "lower(emp.firstname) like lower(concat('%',#{employeeList.employee.firstname},'%'))", };

	Employee employee = new Employee();

	public EmployeeList()
	{
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Employee getEmployee()
	{
		return employee;
	}
	
	
	
	
	
	
}
