package com.sm.dao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.Employee;

@Name("employeeHome")
public class EmployeeHome extends EntityHome<Employee>
{

	public void setEmployeeId(Long id)
	{
		setId(id);
	}

	public Long getEmployeeId()
	{
		return (Long) getId();
	}

	@Override
	protected Employee createInstance()
	{
		Employee employee = new Employee();
		return employee;
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

	public Employee getDefinedInstance()
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
