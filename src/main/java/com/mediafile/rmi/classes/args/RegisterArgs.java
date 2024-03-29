/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.rmi.classes.args;

import java.io.Serializable;

/**
 *
 * @author Dego
 */
public class RegisterArgs implements Serializable {
    
    private final String id;
    private final String fullname;
    private final String email;
    private final String password;
    
    public RegisterArgs(
        String id,
        String fullname,
        String email,
        String password
    ) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    
    public String getFullname() {
        return this.fullname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
    
}
