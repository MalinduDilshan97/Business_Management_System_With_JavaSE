/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.CustomerPaymentReportDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.CustomerPaymentReportDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerPaymentReportDAOImpl implements CustomerPaymentReportDAO{
    
     private Connection connection;
    
    public CustomerPaymentReportDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public ArrayList<CustomerPaymentReportDTO> getAll(String cid) {
         try {
             String SQL = "select o.OID,CPID,Payment,p.Date from CustomerOrder o,"
                     + "CustomerPayment p where o.OID=p.OID and o.CID = '"+cid+"'";
          
             ArrayList<CustomerPaymentReportDTO> allPayment = null;
             
             Statement stm = connection.createStatement();
             ResultSet rst = stm.executeQuery(SQL);
             while(rst.next()){
                 if (allPayment == null){
                     allPayment = new ArrayList<>();
                 }
                 CustomerPaymentReportDTO dto = new CustomerPaymentReportDTO(
                         rst.getString("OID"),
                         rst.getString("CPID"),
                         rst.getDouble("Payment"),
                         rst.getString("Date"));
                 
                 allPayment.add(dto);
             }
             return allPayment;
         } catch (SQLException ex) {
             Logger.getLogger(CustomerPaymentReportDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    
    }

    @Override
    public boolean add(CustomerPaymentReportDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomerPaymentReportDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerPaymentReportDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerPaymentReportDTO> getAll() throws Exception {
         return null;
       
    }
    
}
