package com.sm.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sm.model.enums.BloodGroup;
import com.sm.model.enums.Gender;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class StudentVO extends PO
{

	private String firstName;
	private String middleName;
	private String lastName;
	private Batch batch;
	private Date birthDate;
	private Gender gender;
	private BloodGroup bloodGroup;
	private String birthPlace;
	private String motherTongue;
	private String religion;
	private ContactDetail studentContactDetail;
	private byte[] image;
	private Date addmissionDate;
	private String addmissionNo;
	private Set<Guardian> guardian = new HashSet<Guardian>(0);

	@Column(name = "first_name")
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
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

	@Column(name = "last_name")
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@ManyToOne
	@JoinColumn(name = "bacth_id")
	public Batch getBatch()
	{
		return batch;
	}

	public void setBatch(Batch batch)
	{
		this.batch = batch;
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

	@Column(name = "blood_group")
	@Enumerated(EnumType.STRING)
	public BloodGroup getBloodGroup()
	{
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup)
	{
		this.bloodGroup = bloodGroup;
	}

	@Column(name = "birth_place")
	public String getBirthPlace()
	{
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace)
	{
		this.birthPlace = birthPlace;
	}

	@Column(name = "mother_tongue")
	public String getMotherTongue()
	{
		return motherTongue;
	}

	public void setMotherTongue(String motherTongue)
	{
		this.motherTongue = motherTongue;
	}

	@Column(name = "religion")
	public String getReligion()
	{
		return religion;
	}

	public void setReligion(String religion)
	{
		this.religion = religion;
	}

	@AttributeOverrides({ @AttributeOverride(name = "addressLine1", column = @Column(name = "student_address1")),
			@AttributeOverride(name = "addressLine2", column = @Column(name = "student_address2")),
			@AttributeOverride(name = "email", column = @Column(name = "student_email")),
			@AttributeOverride(name = "phone", column = @Column(name = "student_phone")) })
	public ContactDetail getStudentContactDetail()
	{
		return studentContactDetail;
	}

	public void setStudentContactDetail(ContactDetail studentContactDetail)
	{
		this.studentContactDetail = studentContactDetail;
	}

	@Lob
	@Column(name = "student_image")
	public byte[] getImage()
	{
		return image;
	}

	public void setImage(byte[] image)
	{
		this.image = image;
	}

	@Column(name = "addmission_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getAddmissionDate()
	{
		return addmissionDate;
	}

	public void setAddmissionDate(Date addmissionDate)
	{
		this.addmissionDate = addmissionDate;
	}

	@Column(name = "addmission_no")
	public String getAddmissionNo()
	{
		return addmissionNo;
	}

	public void setAddmissionNo(String addmissionNo)
	{
		this.addmissionNo = addmissionNo;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="student")
	public Set<Guardian> getGuardian()
	{
		return guardian;
	}

	public void setGuardian(Set<Guardian> guardian)
	{
		this.guardian = guardian;
	}
	
	

}
