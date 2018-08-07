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
public class SupplierPaymentDTO extends SuperDTO implements Serializable{
    
    private String spid;
    private String grnID;
    private double amount;
    private String checkid;
    private String date;

    public SupplierPaymentDTO() {
    }

    public SupplierPaymentDTO(String spid, String grnID, double amount, String checkid, String date) {
        this.spid = spid;
        this.grnID = grnID;
        this.amount = amount;
        this.checkid = checkid;
        this.date = date;
    }

    /**
     * @return the spid
     */
    public String getSpid() {
        return spid;
    }

    /**
     * @param spid the spid to set
     */
    public void setSpid(String spid) {
        this.spid = spid;
    }

    /**
     * @return the grnID
     */
    public String getGrnID() {
        return grnID;
    }

    /**
     * @param grnID the grnID to set
     */
    public void setGrnID(String grnID) {
        this.grnID = grnID;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the checkid
     */
    public String getCheckid() {
        return checkid;
    }

    /**
     * @param checkid the checkid to set
     */
    public void setCheckid(String checkid) {
        this.checkid = checkid;
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
