/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.CustomerDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.CustomerDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerDAOImpl implements CustomerDAO{
    
    private Connection connection;
    
    public CustomerDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
         String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, customerDTO.getCid());
        pstm.setString(2, customerDTO.getFisrtName());
        pstm.setString(3, customerDTO.getLastName());
        pstm.setString(4, customerDTO.getNic());
        pstm.setString(5, customerDTO.getContact());
        pstm.setString(6, customerDTO.getEmail());
        pstm.setString(7, customerDTO.getAddress());
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean update(CustomerDTO customerDTO) throws Exception {
         String sql = "UPDATE Customer SET FirstName=?, LastName=?, NIC=?, Contact=?, Email=?, Address=? WHERE CID =?";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, customerDTO.getFisrtName());
        pstm.setString(2, customerDTO.getLastName());
        pstm.setString(3, customerDTO.getNic());
        pstm.setString(4, customerDTO.getContact());
        pstm.setString(5, customerDTO.getEmail());
        pstm.setString(6, customerDTO.getAddress());
        pstm.setString(7, customerDTO.getCid());        
        
        int result = pstm.executeUpdate();
        
        return (result > 0);
    }

    @Override
    public boolean delete(String key) throws Exception {
        String sql = "DELETE FROM Customer WHERE CID ='" + key + "'";
        
        Statement stm = connection.createStatement();
        int affectedRows = stm.executeUpdate(sql);

        return (affectedRows > 0);
    }

    @Override
    public CustomerDTO search(String key) throws Exception {
        String sql = "SELECT * FROM Customer WHERE CID = '" + key + "'";
        
        CustomerDTO customer = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()){
            customer = new CustomerDTO(rst.getString("CID"),
                    rst.getString("FirstName"),
                    rst.getString("LastName"),
                    rst.getString("NIC"),
                    rst.getString("Contact"),
                    rst.getString("Email"),
                    rst.getString("Address"));
        }
        return customer;
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        String sql = "SELECT * FROM Customer";
        
        ArrayList<CustomerDTO> allCustomer = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allCustomer == null){
                allCustomer = new ArrayList<>();
            }
            CustomerDTO dto = new CustomerDTO(
                    rst.getString("CID"),
                    rst.getString("FirstName"),
                    rst.getString("LastName"),
                    rst.getString("NIC"),
                    rst.getString("Contact"),
                    rst.getString("Email"),
                    rst.getString("Address"));
            allCustomer.add(dto);
        }
        return allCustomer;
    }
    
}
