/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dto;

import java.io.Serializable;
import javax.print.DocFlavor;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerPaymentReportDTO extends SuperDTO implements Serializable{
    
    private String oid;
    private String cpid;
    private double payment;
    private String date;

    public CustomerPaymentReportDTO() {
    }

    public CustomerPaymentReportDTO(String oid, String cpid, double payment, String date) {
        this.oid = oid;
        this.cpid = cpid;
        this.payment = payment;
        this.date = date;
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
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
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
