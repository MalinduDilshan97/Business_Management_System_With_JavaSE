/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.UserDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.UserDTO;
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
public class UserDAOImpl implements UserDAO{
    
     private Connection connection;
    
    public UserDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(UserDTO userDTO) throws Exception {
         String sql = "INSERT INTO User VALUES (?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, userDTO.getUid());
        pstm.setString(2, userDTO.getUserName());
        pstm.setString(3, userDTO.getPassword());
       
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(UserDTO userDTO) throws Exception {
        
         String sql = "UPDATE User SET UserName=?, Password=? WHERE UID =?";
       
       PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, userDTO.getUserName());
        pstm.setString(2, userDTO.getPassword());
        pstm.setString(3, userDTO.getUid());
       
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
      
       String sql = "DELETE FROM User WHERE UID ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0); 
    }

    @Override
    public UserDTO search(String key) throws Exception {
        String sql = "SELECT * FROM User WHERE UID = '" + key + "'";
        
        UserDTO user = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            user = new UserDTO(rst.getString("UID"),
                    rst.getString("UserName"),
                    rst.getString("Password"));
                    
        }
        return user;
    }
    

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
       String sql = "SELECT * FROM User";
        
        ArrayList<UserDTO> allUser = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allUser == null){
                allUser = new ArrayList<>();
            }
            UserDTO dto = new UserDTO(
                    rst.getString("UID"),
                    rst.getString("UserName"),
                    rst.getString("Password"));
            allUser.add(dto);
        }
        return allUser;
    }

    @Override
    public UserDTO searchForLogin(String userName) {
         
         
         try {
             String sql = "SELECT * FROM User WHERE UserName = '" + userName + "'";
             
             UserDTO user = null;
             
             Statement stm = connection.createStatement();
             ResultSet rst = stm.executeQuery(sql);
             if (rst.next()){
                 user = new UserDTO(rst.getString("UID"),
                         rst.getString("UserName"),
                         rst.getString("Password"));
                 
             }
             return user;
         } catch (SQLException ex) {
             Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
         
        
        
    }
    
    
}
