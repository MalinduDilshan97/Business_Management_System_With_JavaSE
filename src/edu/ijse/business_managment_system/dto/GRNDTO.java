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
public class GRNDTO extends SuperDTO implements Serializable{
    
    private String grnId;
    private String soid;
    private String date;

    public GRNDTO() {
    }

    public GRNDTO(String grnId, String soid, String date) {
        this.grnId = grnId;
        this.soid = soid;
        this.date = date;
    }

    /**
     * @return the grnId
     */
    public String getGrnId() {
        return grnId;
    }

    /**
     * @param grnId the grnId to set
     */
    public void setGrnId(String grnId) {
        this.grnId = grnId;
    }

    /**
     * @return the soid
     */
    public String getSoid() {
        return soid;
    }

    /**
     * @param soid the soid to set
     */
    public void setSoid(String soid) {
        this.soid = soid;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
