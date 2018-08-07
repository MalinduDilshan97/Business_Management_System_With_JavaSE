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
public class ItemDTO extends SuperDTO implements Serializable{
    
        private String icode;
	private String category;
	private String brand;
	private String model;
        
	public ItemDTO(){}
        
	public ItemDTO(String icode, String category,String brand,String model){
		this.icode=icode;
		this.category=category;
		this.brand=brand;
		this.model=model;
	}
        
	public void setICode(String icode){
		this.icode=icode;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setModel(String model){
		this.model=model;
	}
	
	public String getICode(){
		return icode;
	}
	public String getCategory (){
		return category;
	}
	public String getBrand (){
		return brand;
	}
	public String getModel (){
		return model;
	}
	
    
}
