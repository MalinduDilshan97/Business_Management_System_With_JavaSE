/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.ViewItemDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.ViewItemDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class ViewItemDAOImpl implements ViewItemDAO{
    
    private Connection connection;
    
    public ViewItemDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ViewItemDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewItemDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewItemDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewItemDTO> getAll() throws Exception {
        String sql = "select ICode,BrandName,CatName,Model\n"
                + "from Item i,Brand b,Category c\n"
                + "where i.BrandID=b.BrandID and i.catID=c.catID ";
        
        ArrayList<ViewItemDTO> allitem = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allitem == null){
                allitem = new ArrayList<>();
            }
            ViewItemDTO dto = new ViewItemDTO(
                    rst.getString("ICode"),
                    rst.getString("CatName"),
                    rst.getString("BrandName"),
                    rst.getString("Model"));
                   
            allitem.add(dto);
        }
        return allitem;
    }
    
}
