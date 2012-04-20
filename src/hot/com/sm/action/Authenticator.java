package com.sm.action;

import javax.ejb.Local;

@Local
public interface Authenticator {

    boolean authenticate();
    public void createUser();

}
