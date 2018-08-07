/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.GRNDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.GRNDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class GrnDAOImpl implements GRNDAO{
    
     private Connection connection;
    
    public GrnDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(GRNDTO grnDTO) throws Exception {
      String sql = "INSERT INTO GRN VALUES (?,?,?);";
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        
        pstm.setString(1, grnDTO.getGrnId());
        pstm.setString(2, grnDTO.getSoid());
        pstm.setString(3, grnDTO.getDate());
       
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);  
    }

    @Override
    public boolean update(GRNDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GRNDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<GRNDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
