/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.BrandDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.BrandDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class BrandDAOImpl implements BrandDAO{
    
     private Connection connection;
    
    public BrandDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(BrandDTO brandDTO) throws Exception {
         String sql = "INSERT INTO Brand VALUES (?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, brandDTO.getBrandId());
        pstm.setString(2, brandDTO.getBrandName());
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(BrandDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO search(String key) throws Exception {
         String sql = "SELECT * FROM Brand WHERE BrandID = '" + key + "'";
        
        BrandDTO brand = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            brand = new BrandDTO(rst.getString("BrandID"),
                    rst.getString("BrandName"));
                    
        }
        return brand;
    }

    @Override
    public ArrayList<BrandDTO> getAll() throws Exception {
          String sql = "SELECT * FROM Brand";
        
        ArrayList<BrandDTO> allBrand = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allBrand == null){
                allBrand = new ArrayList<>();
            }
            BrandDTO dto = new BrandDTO(
                    rst.getString("BrandID"),
                    rst.getString("BrandName"));
                   
            allBrand.add(dto);
        }
        return allBrand;
        
    }
    
}
