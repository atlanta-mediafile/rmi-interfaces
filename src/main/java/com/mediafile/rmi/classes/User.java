/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.rmi.classes;

import java.io.Serializable;

/**
 *
 * @author Dego
 */
public class User implements Serializable {
    
    private final String id;
    private final String fullName;
    private final String email;

    public User(String id, String fullname, String email) {
        this.id = id;
        this.fullName = fullname;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
    
}
