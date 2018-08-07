/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.ViewStockDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.ViewStockDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class ViewStockDAOImpl implements ViewStockDAO{
    
    private Connection connection;
    
    public ViewStockDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(ViewStockDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewStockDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewStockDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewStockDTO> getAll() throws Exception {
         String sql = "select BatchID,i.ICode,Model,BuyingPrice,UnitPrice,QtyOnHand,AddedDate\n"
                + "from Item i,Batch b\n"
                + "where b.ICode=i.ICode ";
        
        ArrayList<ViewStockDTO> allitem = null;
        
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next()){
            if (allitem == null){
                allitem = new ArrayList<>();
            }
            ViewStockDTO dto = new ViewStockDTO(
                    rst.getString("BatchID"),
                    rst.getString("ICode"),
                    rst.getString("Model"),
                    rst.getDouble("BuyingPrice"),
                    rst.getDouble("UnitPrice"),
                    rst.getInt("QtyOnHand"),
                    rst.getString("AddedDate"));
                   
            allitem.add(dto);
        }
        return allitem;
    }
    
    
}
