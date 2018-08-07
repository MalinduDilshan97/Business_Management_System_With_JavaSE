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
public class SupplierOrderDetailDTO extends SuperDTO implements Serializable{
    
    private String soid;
    private String icode;
    private int qty;

    public SupplierOrderDetailDTO() {
    }

    public SupplierOrderDetailDTO(String soid, String icode, int qty) {
        this.soid = soid;
        this.icode = icode;
        this.qty = qty;
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
     * @return the icode
     */
    public String getIcode() {
        return icode;
    }

    /**
     * @param icode the icode to set
     */
    public void setIcode(String icode) {
        this.icode = icode;
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
    
    
    
}
