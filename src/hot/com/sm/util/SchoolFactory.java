package com.sm.util;

import java.io.Serializable;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import com.sm.model.enums.BloodGroup;

@Name("schoolFactory")
@Scope(ScopeType.EVENT)
public class SchoolFactory implements Serializable
{
	@Factory("bloodGroupList")
	public BloodGroup[] getBloodGroups(){
		return BloodGroup.values();
	}

}
