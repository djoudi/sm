package com.sm.model;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class GeneralSettingsVO extends PO
{

	private String schoolName;
	private String schoolAddress;
	private String schoolPhone;
	private byte[] schoolImage;

	@Column(name = "school_name")
	public String getSchoolName()
	{
		return schoolName;
	}

	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;

	}

	@Column(name = "school_address")
	public String getSchoolAddress()
	{
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress)
	{
		this.schoolAddress = schoolAddress;
	}

	@Column(name = "school_phone")
	public String getSchoolPhone()
	{
		return schoolPhone;
	}

	public void setSchoolPhone(String schoolPhone)
	{
		this.schoolPhone = schoolPhone;
	}

	@Lob
	@Column(name = "school_image")
	public byte[] getSchoolImage()
	{
		return schoolImage;
	}

	public void setSchoolImage(byte[] schoolImage)
	{
		this.schoolImage = schoolImage;
	}

}
