/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mediafile.rmi.classes;

import java.io.Serializable;

/**
 *
 * @author Dego
 * @param <T>
 */
public class Response<T> implements Serializable {
    
    private final String[] errors;
    private final boolean success;
    private final T data;

    /**
     *  Consturctor for set all response attributes
     * @param errors
     * @param success
     * @param data
     */
    public Response(String[] errors, boolean success, T data) {
        this.errors = errors;
        this.success = success;
        this.data = data;
    }
    
    /**
     *  Constructor for 'ok' response
     * @param data
     */
    public Response(T data) {
        this.errors = new String[]{};
        this.success = true;
        this.data = data;
    }
    
    /**
     *  Constructor for 'error' response
     * @param errors
     */
    public Response(String[] errors) {
        this.errors = errors;
        this.success = false;
        this.data = null;
    }

    public String[] getErrors() {
        return errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }
    
}
