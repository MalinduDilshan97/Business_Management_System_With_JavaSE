/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dto;

import java.io.Serializable;

/**
 *
 * @author Happy Go Lucky
 */
public class UserDTO extends SuperDTO implements Serializable{
    
     private String uid;
	private String username;
	private String password;
	public UserDTO(){}
	public UserDTO(String uid, String username,String password){
		this.uid=uid;
		this.username=username;
		this.password=password;
	}
	public void setUid(String uid){
		this.uid=uid;
	}
	public void setUserName(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getUid(){
		return uid;
	}
	public String getUserName (){
		return username;
	}
	public String getPassword (){
		return password;
	}
	
    
}
