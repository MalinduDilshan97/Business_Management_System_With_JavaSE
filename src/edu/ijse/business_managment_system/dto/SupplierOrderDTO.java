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
public class SupplierOrderDTO extends SuperDTO implements Serializable{
    
    private String soid;
    private String sid;
    private String date;

    public SupplierOrderDTO() {
    }

    public SupplierOrderDTO(String soid, String sid, String date) {
        this.soid = soid;
        this.sid = sid;
        this.date = date;
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
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
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
