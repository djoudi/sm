package com.sm.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
@Entity
@Table(name = "employee", uniqueConstraints = { @UniqueConstraint(columnNames = "employee_no") })
public class Employee extends EmployeeVo
{

	@Transient
	public String getFullName()
	{
		return getFirstname() + " " + getLastname();
	}
	
}
