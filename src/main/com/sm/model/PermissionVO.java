package com.sm.model;

import javax.persistence.MappedSuperclass;

import org.jboss.seam.annotations.security.permission.PermissionAction;
import org.jboss.seam.annotations.security.permission.PermissionDiscriminator;
import org.jboss.seam.annotations.security.permission.PermissionRole;
import org.jboss.seam.annotations.security.permission.PermissionTarget;
import org.jboss.seam.annotations.security.permission.PermissionUser;

@MappedSuperclass
public abstract class PermissionVO extends PO
{

	private String recipient;
	private String target;
	private String action;
	private String discriminator;

	@PermissionUser
	@PermissionRole
	public String getRecipient()
	{
		return recipient;
	}

	public void setRecipient(String recipient)
	{
		this.recipient = recipient;
	}

	@PermissionTarget
	public String getTarget()
	{
		return target;
	}

	public void setTarget(String target)
	{
		this.target = target;
	}

	@PermissionAction
	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	@PermissionDiscriminator
	public String getDiscriminator()
	{
		return discriminator;
	}

	public void setDiscriminator(String discriminator)
	{
		this.discriminator = discriminator;
	}

}
