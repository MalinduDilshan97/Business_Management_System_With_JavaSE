/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.SupplierDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.SupplierDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierDAOImpl implements SupplierDAO{
    
     private Connection connection;
    
    public SupplierDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SupplierDTO supplierDTO) throws Exception {
        String sql = "INSERT INTO Supplier VALUES (?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, supplierDTO.getSid());
        pstm.setString(2, supplierDTO.getName());
        pstm.setString(3, supplierDTO.getContact());
        pstm.setString(4, supplierDTO.getFax());
        pstm.setString(5, supplierDTO.getEmail());
        pstm.setString(6, supplierDTO.getAddress());
       
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(SupplierDTO supplierDTO) throws Exception {
        String sql = "UPDATE Supplier SET SupName=?, Contact=?, Fax=?, Email=?, SupAddress=? WHERE SID =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, supplierDTO.getName());
        pstm.setString(2, supplierDTO.getContact());
        pstm.setString(3, supplierDTO.getFax());
        pstm.setString(4, supplierDTO.getEmail());
        pstm.setString(5, supplierDTO.getAddress());
        pstm.setString(6, supplierDTO.getSid());
       
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
        
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Supplier WHERE SID ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public SupplierDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Supplier WHERE SID = '" + key + "'";
        
        SupplierDTO supplier = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            supplier = new SupplierDTO(rst.getString("SID"),
                    rst.getString("SupName"),
                    rst.getString("Contact"),
                    rst.getString("Fax"),
                    rst.getString("Email"),
                    rst.getString("SupAddress"));
        }
        return supplier;
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Supplier";
        
        ArrayList<SupplierDTO> allSupplier = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allSupplier == null){
                allSupplier = new ArrayList<>();
            }
            SupplierDTO dto = new SupplierDTO(
                    rst.getString("SID"),
                    rst.getString("SupName"),
                    rst.getString("Contact"),
                    rst.getString("Fax"),
                    rst.getString("Email"),
                    rst.getString("SupAddress"));
            allSupplier.add(dto);
        }
        return allSupplier;
    }
    
    
}
