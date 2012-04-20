package com.sm.action;

import java.util.List;

import javax.ejb.Stateless;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.RaiseEvent;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;
import org.jboss.seam.security.management.IdentityManager;
import org.jboss.seam.security.management.JpaIdentityStore;

import com.sm.util.SchoolConstants;

/**
 * @author Omid Pourhadi 
 * omidpourhadi [AT] gmail [DOT] com
 */
@Stateless
@Name("authenticator")
public class AuthenticatorBean implements Authenticator
{
	@Logger
	private Log log;

	@In
	Identity identity;
	@In
	Credentials credentials;

	@In
	JpaIdentityStore identityStore;
	
	@In
	IdentityManager identityManager;

	@RaiseEvent(SchoolConstants.THEME_LOCALE_CHANGER)
	public boolean authenticate()
	{
		log.info("authenticating {0}", credentials.getUsername());
		if (identityManager.authenticate(credentials.getUsername(), credentials.getPassword()))
		{
			List<String> roles = identityManager.getGrantedRoles(credentials.getUsername());
			if (roles.size() > 0)
			{
				for (String roleName : roles)
				{
					log.info("role assignee : " + roleName);
					identity.addRole(roleName);
				}
			}
			else
			{
				identity.addRole(SchoolConstants.ROLE_ANON);
			}

			return true;
		}
		else
		{
			return false;
		}

	}
	
	 public void createUser()
	 {
	 identityStore.createUser("omidbiz", "omidbiz", null, null);
	 identityStore.createUser("omidp", "omidp", null, null);
	 }

}
