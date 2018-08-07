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
public class BrandDTO extends SuperDTO implements Serializable{
    
    private String brandId;
    private String brandName;

    public BrandDTO() {
    }

    public BrandDTO(String brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    /**
     * @return the brandId
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * @param brandId the brandId to set
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    
    
}
