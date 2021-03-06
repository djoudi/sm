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
@Table(name = "student", uniqueConstraints = { @UniqueConstraint(columnNames = "addmission_no") })
public class Student extends StudentVO
{

	@Transient
	public String getFullName()
	{
		return getFirstname() + " " + getLastname();
	}

}
