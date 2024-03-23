/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mediafile.rmi.interfaces;

import com.mediafile.rmi.classes.Response;
import com.mediafile.rmi.classes.User;
import com.mediafile.rmi.classes.args.LoginArgs;
import com.mediafile.rmi.classes.args.RegisterArgs;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dego
 */
public interface IAuthProvider extends Remote {
    
    /**
     *  Given a token check if the token is valid
     * @param token
     * @return 
     * @throws RemoteException
     */
    public Response<Boolean> Auth(String token) throws RemoteException;
    
    /**
     *  Get user with the userId
     * @param userId
     * @return response user
     * @throws RemoteException
     */
    public Response<User> GetUser(String userId) throws RemoteException;
    
    /**
     *  Login with email and password
     * @param loginArgs
     * @return response jwt
     * @throws RemoteException
     */
    public Response<String> Login(LoginArgs loginArgs) throws RemoteException;
    
    /**
     *  Register with username, fullname, email and password
     * @param registerArgs
     * @return response jwt
     * @throws RemoteException
     */
    public Response<String> Register(RegisterArgs registerArgs) throws RemoteException;
    
}
