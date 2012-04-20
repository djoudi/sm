package com.sm.service;

import javax.persistence.NoResultException;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.Transactional;
import org.jboss.seam.annotations.Unwrap;
import org.jboss.seam.framework.EntityController;

import com.sm.model.GeneralSettings;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@Name("generalSettingsService")
@Scope(ScopeType.STATELESS)
@AutoCreate
public class GeneralSettingsService extends EntityController
{

	@Unwrap
	@Transactional
	public GeneralSettings getGeneralSettings()

	{
		try
		{
			return (GeneralSettings) getEntityManager().createNamedQuery(GeneralSettings.FIND_GENERAL_SETTINGS)
					.getSingleResult();
		}
		catch (NoResultException nre)
		{
			return new GeneralSettings();
		}
	}

}
