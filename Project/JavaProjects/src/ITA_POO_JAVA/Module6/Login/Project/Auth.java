/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Module6.Login.Project;

import ITA_POO_JAVA.Module6.Login.Exceptions.LoginException;

public class Auth {

    public User login(String username, String password) throws LoginException {
     if (username.equalsIgnoreCase("enzo") && password.equalsIgnoreCase("enzosenha")){
         return new User(username);
     }
     throw new LoginException("User and Password are incorrect", username);
    }
}
