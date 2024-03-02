/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.rmi.classes;

/**
 *
 * @author Dego
 */
public class User {
    
    private final String username;
    private final String fullName;
    private final String email;

    public User(String username, String fullname, String email) {
        this.username = username;
        this.fullName = fullname;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
    
}
