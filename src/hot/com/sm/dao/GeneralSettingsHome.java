package com.sm.dao;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.GeneralSettings;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@Name("generalSettingsHome")
@Scope(ScopeType.CONVERSATION)
public class GeneralSettingsHome extends EntityHome<GeneralSettings>
{

	@In(value = "#{generalSettingsService}")
	GeneralSettings generalSettings;

	@Override
	protected GeneralSettings createInstance()
	{
		return generalSettings;
	}

	public void load()
	{
		if (isIdDefined())
		{
			wire();
		}
	}

	public void wire()
	{
		getInstance();

	}

	public boolean isWired()
	{
		return true;
	}

	public GeneralSettings getDefinedInstance()
	{
		return isIdDefined() ? getInstance() : null;
	}

	@Override
	public String update()
	{
		wire();
		return super.update();
	}

	@Override
	public String persist()
	{
		wire();
		return super.persist();
	}

}
