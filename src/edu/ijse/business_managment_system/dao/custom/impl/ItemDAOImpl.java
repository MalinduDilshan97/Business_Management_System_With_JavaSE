/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.ItemDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.CustomerOrderDetailDTO;
import edu.ijse.business_managment_system.dto.ItemDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class ItemDAOImpl implements ItemDAO{
    
    private Connection connection;
    
    public ItemDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
         String sql = "INSERT INTO Item VALUES (?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, itemDTO.getICode());
        pstm.setString(2, itemDTO.getCategory());
        pstm.setString(3, itemDTO.getBrand());
         pstm.setString(4, itemDTO.getModel());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(ItemDTO itemDTO) throws Exception {
         String sql = "UPDATE Item SET CatID=?, BrandID=?, Model=? WHERE ICode =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, itemDTO.getCategory());
        pstm.setString(2, itemDTO.getBrand());
         pstm.setString(3, itemDTO.getModel());
         pstm.setString(4, itemDTO.getICode());
        
        int result = pstm.executeUpdate();
        
        return (result > 0); 
    }

    @Override
    public boolean delete(String key) throws Exception {
       String sql = "DELETE FROM Item WHERE ICode ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public ItemDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Item WHERE ICode = '" + key + "'";
        
        ItemDTO item = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            item = new ItemDTO(rst.getString("ICode"),
                    rst.getString("CatID"),
                    rst.getString("BrandID"),
                    rst.getString("Model"));
        }
        return item;
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Item";
        
        ArrayList<ItemDTO> allItem = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allItem == null){
                allItem = new ArrayList<>();
            }
            ItemDTO dto = new ItemDTO(
                    rst.getString("ICode"),
                    rst.getString("CatID"),
                    rst.getString("BrandID"),
                    rst.getString("Model"));
            allItem.add(dto);
        }
        return allItem;
    }

   
    
    
   

   
}
