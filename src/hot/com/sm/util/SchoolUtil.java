package com.sm.util;

import java.io.Serializable;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.international.LocaleSelector;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@Name("schoolUtil")
@Scope(ScopeType.EVENT)
public class SchoolUtil implements Serializable
{

	@In(value = "org.jboss.seam.international.localeSelector")
	LocaleSelector localeSelector;

	public String getDatePattern()
	{
		return SchoolConstants.DATE_PATTERN;
	}

	public boolean isRtl()
	{
		return localeSelector.getLocaleString().equals("fa") || localeSelector.getLocaleString().equals("ar");
	}

}
