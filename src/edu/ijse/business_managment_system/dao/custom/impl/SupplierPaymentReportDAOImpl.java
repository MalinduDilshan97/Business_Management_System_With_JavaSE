/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.SupplierPaymentReportDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.SupplierPaymentReportDTO;
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
public class SupplierPaymentReportDAOImpl implements SupplierPaymentReportDAO{
    
    private Connection connection;
    
    public SupplierPaymentReportDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public ArrayList<SupplierPaymentReportDTO> getAll(String sid) {
       try {
             String SQL = "select o.SOID,g.GRNID,SPID,Amount,p.Date from GRN g,"
                     + "SupplierOrder o, SupplierPayment p where g.GRNID=p.GRNID and o.SOID=g.SOID and o.SID = '"+sid+"'";
          
             ArrayList<SupplierPaymentReportDTO> allPayment = null;
             
             Statement stm = connection.createStatement();
             ResultSet rst = stm.executeQuery(SQL);
             while(rst.next()){
                 if (allPayment == null){
                     allPayment = new ArrayList<>();
                 }
                 SupplierPaymentReportDTO dto = new SupplierPaymentReportDTO(
                         rst.getString("SOID"),
                         rst.getString("GRNID"),
                         rst.getString("SPID"),
                         rst.getDouble("Amount"),
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
    public boolean add(SupplierPaymentReportDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SupplierPaymentReportDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierPaymentReportDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentReportDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
