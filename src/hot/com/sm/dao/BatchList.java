package com.sm.dao;

import java.util.Arrays;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;

import com.sm.model.Batch;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@Name("batchList")
public class BatchList extends EntityQuery<Batch>
{

	private static final String EJBQL = "select batch from Batch batch";

	private static final String[] RESTRICTIONS = { "lower(batch.name) like lower(concat('%',#{batchList.batch.name},'%'))", };

	private Batch batch = new Batch();

	public BatchList()
	{
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Batch getBatch()
	{
		return batch;
	}

}
