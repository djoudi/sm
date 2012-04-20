package com.sm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class GuardianVO extends PO
{

	private Student student;
	private String firstName;
	private String lastName;
	private String relationShip;
	private Date birthDate;
	private String education;
	private String occupation;
	private BigDecimal income;
	private ContactDetail guardianContactDetail;

	@ManyToOne
	@JoinColumn(name = "student_id")
	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	@Column(name = "first_name")
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	@Column(name = "last_name")
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Column(name = "relationship")
	public String getRelationShip()
	{
		return relationShip;
	}

	public void setRelationShip(String relationShip)
	{
		this.relationShip = relationShip;
	}

	@Column(name = "birth_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	@Column(name = "education")
	public String getEducation()
	{
		return education;
	}

	public void setEducation(String education)
	{
		this.education = education;
	}

	@Column(name = "occupation")
	public String getOccupation()
	{
		return occupation;
	}

	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}

	@Column(name = "income")
	public BigDecimal getIncome()
	{
		return income;
	}

	public void setIncome(BigDecimal income)
	{
		this.income = income;
	}

	@AttributeOverrides({ @AttributeOverride(name = "addressLine1", column = @Column(name = "student_address1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "student_address2")),
			@AttributeOverride(name = "email", column = @Column(name = "student_email")),
			@AttributeOverride(name = "phone", column = @Column(name = "student_phone")) })
	public ContactDetail getGuardianContactDetail()
	{
		return guardianContactDetail;
	}

	public void setGuardianContactDetail(ContactDetail guardianContactDetail)
	{
		this.guardianContactDetail = guardianContactDetail;
	}

}
