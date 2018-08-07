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
public class ViewStockDTO extends SuperDTO implements Serializable{
    
    private String batchID;
    private String iCode;
     private String model;
     private double buy;
     private double unit;
     private int qty;
      private String date;

    public ViewStockDTO() {
    }

    public ViewStockDTO(String batchID, String iCode, String model, double buy, double unit, int qty, String date) {
        this.batchID = batchID;
        this.iCode = iCode;
        this.model = model;
        this.buy = buy;
        this.unit = unit;
        this.qty = qty;
        this.date = date;
    }

    /**
     * @return the batchID
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * @param batchID the batchID to set
     */
    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    /**
     * @return the iCode
     */
    public String getiCode() {
        return iCode;
    }

    /**
     * @param iCode the iCode to set
     */
    public void setiCode(String iCode) {
        this.iCode = iCode;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the buy
     */
    public double getBuy() {
        return buy;
    }

    /**
     * @param buy the buy to set
     */
    public void setBuy(double buy) {
        this.buy = buy;
    }

    /**
     * @return the unit
     */
    public double getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(double unit) {
        this.unit = unit;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
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
