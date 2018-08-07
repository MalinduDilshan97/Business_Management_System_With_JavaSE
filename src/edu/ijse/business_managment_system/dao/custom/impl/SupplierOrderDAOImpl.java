/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.SupplierOrderDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.SupplierOrderDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierOrderDAOImpl implements SupplierOrderDAO{
    
     private Connection connection;
    
    public SupplierOrderDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(SupplierOrderDTO supplierOrderDTO) throws Exception {
        String sql = "INSERT INTO SupplierOrder VALUES (?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, supplierOrderDTO.getSoid());
        pstm.setString(2, supplierOrderDTO.getSid());
        pstm.setString(3, supplierOrderDTO.getDate());
       
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(SupplierOrderDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderDTO> getAll() throws Exception {
        String sql = "SELECT * FROM SupplierOrder";
        
        ArrayList<SupplierOrderDTO> allSupplierOrder = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allSupplierOrder == null){
                allSupplierOrder = new ArrayList<>();
            }
            SupplierOrderDTO dto = new SupplierOrderDTO(
                    rst.getString("SOID"),
                    rst.getString("SID"),
                    rst.getString("Date"));
                    
            allSupplierOrder.add(dto);
        }
        return allSupplierOrder;
    }
    
}
