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
public class SupplierPaymentReportDTO extends SuperDTO implements Serializable{
    
    private String soid;
     private String grnid;
    private String spid;
    private double amount;
    private String date;

    public SupplierPaymentReportDTO() {
    }

    public SupplierPaymentReportDTO(String soid, String grnid, String spid, double amount, String date) {
        this.soid = soid;
        this.grnid = grnid;
        this.spid = spid;
        this.amount = amount;
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
     * @return the grnid
     */
    public String getGrnid() {
        return grnid;
    }

    /**
     * @param grnid the grnid to set
     */
    public void setGrnid(String grnid) {
        this.grnid = grnid;
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
