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
public class SupplierDTO extends SuperDTO implements Serializable{
    
        private String sid;
	private String name;
	private String contact;
	private String fax;
	private String email;
	private String address;
	public SupplierDTO(){}
	public SupplierDTO(String sid, String name,String contact,String fax, String email,String address){
		this.sid=sid;
		this.name=name;
		this.contact=contact;
		this.fax=fax;
		this.email=email;
		this.address=address;
	}
	public void setSid(String sid){
		this.sid=sid;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public void setFax(String fax){
		this.fax=fax;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getSid(){
		return sid;
	}
	public String getName (){
		return name;
	}
	public String getContact (){
		return contact;
	}
	public String getFax (){
		return fax;
	}
	public String getEmail(){
		return email;
	}
	public String getAddress(){
		return address;
	}
    
}
