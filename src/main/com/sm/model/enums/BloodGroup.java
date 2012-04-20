package com.sm.model.enums;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
public enum BloodGroup
{

	A("A"), B("B"), O("O"), AB("AB");

	private BloodGroup(String label)
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
