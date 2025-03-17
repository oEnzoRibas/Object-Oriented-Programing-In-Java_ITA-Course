/*
 * Copyright (c) 2025. By Enzo Ribas.
 */

package ITA_POO_JAVA.Modules.Module6.Login.Project;

import ITA_POO_JAVA.Modules.Module6.Login.Exceptions.LoginException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void SuccessfulLogin(){
        Auth a = new Auth();
        User u = a.login("enzo","enzosenha");

        assertEquals("enzo", u.getUsername());
    }

    @Test
    void unsuccessfulLogin() {
        Auth auth = new Auth();

        assertThrows(LoginException.class, () -> {
            User user = auth.login("enzo", "naoenzosenha");
        });
    }

    @Test
    void errorInfo(){
        Auth a = new Auth();
        try{
        User u = a.login("enzo","naoenzosenha");
        fail();
        } catch (LoginException e){
            assertEquals("enzo", e.getUsername());
        }
    }
}