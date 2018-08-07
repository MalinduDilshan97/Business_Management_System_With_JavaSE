/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.dao.custom.impl;

import edu.ijse.business_managment_system.dao.custom.DailySellsDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.DailySellsDTO;
import java.sql.Connection;
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
public class DailySellsDAOImpl implements DailySellsDAO{
    
    private Connection connection;
    
    public DailySellsDAOImpl() {
        connection = ConnectionFactory.getInstance().getConnection();
    }

    @Override
    public boolean add(DailySellsDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(DailySellsDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DailySellsDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<DailySellsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public ArrayList<DailySellsDTO> getAll(String date) {
        
        try {
             String SQL = "select o.OID,i.Model,(co.UnitPrice-Discount) as SellingPrice,b.BuyingPrice,((co.UnitPrice-Discount)-b.BuyingPrice) as Profit from CustomerOrder o,"
                     + "CustomerOrderDetail co, Item i, Batch b where o.OID=co.OID and co.ICode=i.ICode and co.BatchID=b.BatchID and o.Date = '"+date+"'";
          
             ArrayList<DailySellsDTO> allReport = null;
             
             Statement stm = connection.createStatement();
             ResultSet rst = stm.executeQuery(SQL);
             while(rst.next()){
                 if (allReport == null){
                     allReport = new ArrayList<>();
                 }
                 DailySellsDTO dto = new DailySellsDTO(
                         rst.getString("OID"),
                         rst.getString("Model"),
                         rst.getDouble("SellingPrice"),
                         rst.getDouble("BuyingPrice"),
                         rst.getDouble("Profit"));
                 
                 allReport.add(dto);
             }
             return allReport;
         } catch (SQLException ex) {
             Logger.getLogger(DailySellsDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
}
