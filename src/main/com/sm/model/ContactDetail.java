package com.sm.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ContactDetail implements Serializable
{

	private String addressLine1;
	private String addressLine2;
	private String phone;
	private String email;

	public String getAddressLine1()
	{
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2()
	{
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactDetail other = (ContactDetail) obj;
		if (addressLine1 == null)
		{
			if (other.addressLine1 != null)
				return false;
		}
		else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null)
		{
			if (other.addressLine2 != null)
				return false;
		}
		else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (email == null)
		{
			if (other.email != null)
				return false;
		}
		else if (!email.equals(other.email))
			return false;
		if (phone == null)
		{
			if (other.phone != null)
				return false;
		}
		else if (!phone.equals(other.phone))
			return false;
		return true;
	}

}
