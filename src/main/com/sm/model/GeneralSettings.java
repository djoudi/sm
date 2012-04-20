package com.sm.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
@NamedQueries({@NamedQuery(name=GeneralSettings.FIND_GENERAL_SETTINGS,query="from GeneralSettings gs")})
@Entity
@Table(name = "general_settings")
public class GeneralSettings extends GeneralSettingsVO
{

	public static final String FIND_GENERAL_SETTINGS = "generalSettings.find";
	
}
