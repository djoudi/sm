package com.sm.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import org.jboss.seam.annotations.security.management.RoleConditional;
import org.jboss.seam.annotations.security.management.RoleGroups;
import org.jboss.seam.annotations.security.management.RoleName;

/**
 * @author Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
@MappedSuperclass
public abstract class RoleVO extends PO
{

	private String rolename;
	private boolean conditional;
	private Set<Role> groups;


	@RoleName
	@Column(name = "role_name")
	public String getRolename()
	{
		return rolename;
	}

	public void setRolename(String rolename)
	{
		this.rolename = rolename;
	}

	@RoleConditional
	@Column(name = "condition")
	public boolean isConditional()
	{
		return conditional;
	}

	public void setConditional(boolean conditional)
	{
		this.conditional = conditional;
	}

	@RoleGroups
	@ManyToMany(targetEntity = Role.class)
	@JoinTable(name = "Role_Groups", joinColumns = @JoinColumn(name = "Role_Id"), inverseJoinColumns = @JoinColumn(
			name = "Group_Id"))
	public Set<Role> getGroups()
	{
		return groups;
	}

	public void setGroups(Set<Role> groups)
	{
		this.groups = groups;
	}

}
