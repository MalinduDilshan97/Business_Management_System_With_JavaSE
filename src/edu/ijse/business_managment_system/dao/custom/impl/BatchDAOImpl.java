/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.BatchDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.BatchDTO;
import edu.ijse.business_managment_system.dto.CustomerOrderDetailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class BatchDAOImpl implements BatchDAO{
    
     private Connection connection;
    
    public BatchDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(BatchDTO batchDTO) throws Exception {
        String sql = "INSERT INTO Batch VALUES (?,?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, batchDTO.getBatchId());
        pstm.setString(2, batchDTO.getGrnId());
        pstm.setString(3, batchDTO.getiCode());
        pstm.setDouble(4, batchDTO.getBuyingPrice());
        pstm.setDouble(5, batchDTO.getUnitPrice());
        pstm.setInt(6, batchDTO.getQtyOnHand());
        pstm.setString(7, batchDTO.getDate());
       
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(BatchDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Batch WHERE BatchID ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public BatchDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Batch WHERE BatchID = '" + key + "'";
        
        BatchDTO batch = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            batch = new BatchDTO(rst.getString("BatchID"),
                    rst.getString("GRNID"),
                    rst.getString("ICode"),
                    rst.getDouble("BuyingPrice"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"),
                    rst.getString("AddedDate"));
        }
        return batch;
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Batch";
        
        ArrayList<BatchDTO> allBatch = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allBatch == null){
                allBatch = new ArrayList<>();
            }
            BatchDTO dto = new BatchDTO(
                    rst.getString("BatchID"),
                    rst.getString("GRNID"),
                    rst.getString("ICode"),
                    rst.getDouble("BuyingPrice"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"),
                    rst.getString("AddedDate"));
            allBatch.add(dto);
        }
        return allBatch;
    }

    @Override
    public boolean updateBatchQty(CustomerOrderDetailDTO allCustomerOrderDetail) {
         try {
             String sql="UPDATE Batch SET QtyOnHand=QtyOnHand-? WHERE BatchID=?";
             PreparedStatement pstm = connection.prepareStatement(sql);
             
             pstm.setInt(1, allCustomerOrderDetail.getOrderQty());
             pstm.setString(2, allCustomerOrderDetail.getBatchId());
             
             int result = pstm.executeUpdate();
             
             return (result > 0);
         } catch (SQLException ex) {
             Logger.getLogger(BatchDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    }
    
}
