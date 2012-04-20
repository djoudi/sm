package com.sm.dao;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

import com.sm.model.Batch;

@Name("batchHome")
public class BatchHome extends EntityHome<Batch>
{
	
	public void setBatchId(Long id)
	{
		setId(id);
	}

	public Long getBatchId()
	{
		return (Long) getId();
	}

	@Override
	protected Batch createInstance()
	{
		Batch batch = new Batch();
		return batch;
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

	public Batch getDefinedInstance()
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
