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
public class CustomerDTO extends SuperDTO implements Serializable{
    
    private String cid;
	private String firstName;
	private String lastName;
	private String nic;
	private String contact;
	private String email;
	private String address;

	public CustomerDTO(){}

	public CustomerDTO(String cid,String firstName,String lastName,String nic,String contact,String email, String address){
		this.cid=cid;
		this.firstName=firstName;
		this.lastName=lastName;
		this.nic=nic;
		this.contact=contact;
		this.email=email;
		this.address=address;
	}

	
	public void setCid(String cid){
		this.cid=cid;
	}

	public void setFisrtName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public void setNic(String nic){
		this.nic=nic;
	}
	
	public void setContact(String contact){
		this.contact=contact;
	}
	
	public void setEmail(String email){
		this.email=email;
	}

	public void setAddress(String address){
		this.address=address;
	}
	
	public String getCid(){
		return cid;
	}
	
	public String getFisrtName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getNic(){
		return nic;
	}
	
	public String getContact(){
		return contact;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getAddress(){
		return address;
	}
    
}
