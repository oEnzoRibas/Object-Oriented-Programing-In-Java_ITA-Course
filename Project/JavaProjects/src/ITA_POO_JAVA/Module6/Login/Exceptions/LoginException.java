/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Module6.Login.Exceptions;

public class LoginException extends RuntimeException {

    private String username;

    public LoginException(String message, String username) {
        super(message);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
