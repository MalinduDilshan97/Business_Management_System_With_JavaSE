/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.SupplierPaymentDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.SupplierPaymentDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierPaymentDAOImpl implements SupplierPaymentDAO{
    
    private Connection connection;
    
    public SupplierPaymentDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SupplierPaymentDTO supplierPaymentDTO) throws Exception {
        String sql = "INSERT INTO SupplierPayment VALUES (?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, supplierPaymentDTO.getSpid());
        pstm.setString(2, supplierPaymentDTO.getGrnID());
        pstm.setDouble(3, supplierPaymentDTO.getAmount());
        pstm.setString(4, supplierPaymentDTO.getCheckid());
        pstm.setString(5, supplierPaymentDTO.getDate());
       
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(SupplierPaymentDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierPaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
