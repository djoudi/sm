package com.sm.model.enums;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
public enum MaritalStatus
{

	Single("Single"), Married("Married"), Divorced("Divorced");

	private MaritalStatus(String label)
	{
		this.label = label;
	}

	private String label;

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

}
