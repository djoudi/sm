package com.sm.dao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.Guardian;

@Name("guardianHome")
public class GuardianHome extends EntityHome<Guardian>
{

	public void setGuardianId(Long id)
	{
		setId(id);
	}

	public Long getGuardianId()
	{
		return (Long) getId();
	}

	@Override
	protected Guardian createInstance()
	{
		Guardian guardian = new Guardian();
		return guardian;
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

	public Guardian getDefinedInstance()
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
