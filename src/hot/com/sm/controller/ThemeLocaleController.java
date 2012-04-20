package com.sm.controller;

import java.io.Serializable;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.international.LocaleSelector;
import org.jboss.seam.log.Log;
import org.jboss.seam.theme.ThemeSelector;

import com.sm.util.SchoolConstants;

/**
 * @author omid pourhadi : omidpourhadi AT gmail DOT com
 * @version 1.0
 * 
 */
@Scope(ScopeType.SESSION)
@Name("themeLocaleController")
public class ThemeLocaleController implements Serializable
{

	@In(value = "org.jboss.seam.international.localeSelector")
	LocaleSelector localeSelector;

	@In(value = "org.jboss.seam.theme.themeSelector")
	ThemeSelector themeSelector;

	@Logger
	private Log log;

	@Observer(value = SchoolConstants.THEME_LOCALE_CHANGER)
	public void changeThemeByLocale()
	{
		log.info("Changing Theme For " + localeSelector.getLocaleString() + " Locale");
		localeSelector.select();
		if (localeSelector.getLocaleString().equalsIgnoreCase("fa"))
		{
			themeSelector.setTheme("persian_theme");
		}
		else
		{
			themeSelector.setTheme("default_theme");
		}
		themeSelector.select();
	}

}