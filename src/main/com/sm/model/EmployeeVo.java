package com.sm.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sm.model.enums.Gender;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class EmployeeVo extends MemberVO
{

	private String employeeNo;
	private String middleName;
	private Gender gender;
	private Date joinDate;
	private String jobTitle;
	private String qualification;
	private String experienceDetail;
	private ContactDetail employeeContactDetail;

	@Column(name = "employee_no")
	public String getEmployeeNo()
	{
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo)
	{
		this.employeeNo = employeeNo;
	}

	@Column(name = "middle_name")
	public String getMiddleName()
	{
		return middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "join_date")
	public Date getJoinDate()
	{
		return joinDate;
	}

	public void setJoinDate(Date joinDate)
	{
		this.joinDate = joinDate;
	}

	@Column(name = "job_title")
	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	@Column(name = "qualification")
	public String getQualification()
	{
		return qualification;
	}

	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}

	@Column(name = "experience_detail")
	public String getExperienceDetail()
	{
		return experienceDetail;
	}

	public void setExperienceDetail(String experienceDetail)
	{
		this.experienceDetail = experienceDetail;
	}

	@AttributeOverrides({ @AttributeOverride(name = "addressLine1", column = @Column(name = "employee_address1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "employee_address2")),
			@AttributeOverride(name = "email", column = @Column(name = "employee_email")),
			@AttributeOverride(name = "phone", column = @Column(name = "employee_phone")) })
	public ContactDetail getEmployeeContactDetail()
	{
		return employeeContactDetail;
	}

	public void setEmployeeContactDetail(ContactDetail employeeContactDetail)
	{
		this.employeeContactDetail = employeeContactDetail;
	}

}
