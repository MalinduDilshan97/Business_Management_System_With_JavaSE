/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.CustomerOrderDetailDAO;
import edu.ijse.business_managment_system.dao.custom.SupplierOrderDetailDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.CustomerOrderDetailDTO;
import edu.ijse.business_managment_system.dto.SupplierOrderDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerOrderDetailDAOImpl implements CustomerOrderDetailDAO{
    
     private Connection connection;
    
    public CustomerOrderDetailDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(CustomerOrderDetailDTO customerOrderDetailDTO) throws Exception {
         String sql = "INSERT INTO CustomerOrderDetail VALUES (?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, customerOrderDetailDTO.getOid());
        pstm.setString(2, customerOrderDetailDTO.getiCode());
        pstm.setString(3, customerOrderDetailDTO.getBatchId());
        pstm.setDouble(4, customerOrderDetailDTO.getUnitPrice());
        pstm.setDouble(5, customerOrderDetailDTO.getDiscount());
        pstm.setInt(6, customerOrderDetailDTO.getOrderQty());
       
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(CustomerOrderDetailDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDetailDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderDetailDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     

  
    
}
