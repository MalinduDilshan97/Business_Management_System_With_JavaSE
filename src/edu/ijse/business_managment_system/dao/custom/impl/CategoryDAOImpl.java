/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.CategoryDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.CategoryDTO;
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
public class CategoryDAOImpl implements CategoryDAO{
    
    private Connection connection;
    
    public CategoryDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(CategoryDTO categoryDTO) throws Exception {
        
      
        String sql = "INSERT INTO Category VALUES (?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, categoryDTO.getCategoryId());
        pstm.setString(2, categoryDTO.getCategoryName());
        int result = pstm.executeUpdate();
        
        return (result > 0); 
    }

    @Override
    public boolean update(CategoryDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Category WHERE CatID = '" + key + "'";
        
        CategoryDTO category = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            category = new CategoryDTO(rst.getString("CatID"),
                    rst.getString("catName"));
                   
        }
        return category;
    }
    

    @Override
    public ArrayList<CategoryDTO> getAll() throws Exception {
      String sql = "SELECT * FROM Category";
        
        ArrayList<CategoryDTO> allCategory = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allCategory == null){
                allCategory = new ArrayList<>();
            }
            CategoryDTO dto = new CategoryDTO(
                    rst.getString("CatID"),
                    rst.getString("CatName"));
                   
            allCategory.add(dto);
        }
        return allCategory;
    }

   
    
    
    
}
