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
public class CustomerPaymentDTO extends SuperDTO implements Serializable{
    
    private String cpid;
    private String oid;
    private double fullAmount;
    private double paidAmount;
    private String date;

    public CustomerPaymentDTO() {
    }

    public CustomerPaymentDTO(String cpid, String oid, double fullAmount, double paidAmount, String date) {
        this.cpid = cpid;
        this.oid = oid;
        this.fullAmount = fullAmount;
        this.paidAmount = paidAmount;
        this.date = date;
    }

    /**
     * @return the cpid
     */
    public String getCpid() {
        return cpid;
    }

    /**
     * @param cpid the cpid to set
     */
    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    /**
     * @return the oid
     */
    public String getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * @return the fullAmount
     */
    public double getFullAmount() {
        return fullAmount;
    }

    /**
     * @param fullAmount the fullAmount to set
     */
    public void setFullAmount(double fullAmount) {
        this.fullAmount = fullAmount;
    }

    /**
     * @return the paidAmount
     */
    public double getPaidAmount() {
        return paidAmount;
    }

    /**
     * @param paidAmount the paidAmount to set
     */
    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
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
