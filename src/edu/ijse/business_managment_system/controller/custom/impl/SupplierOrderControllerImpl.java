/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.SupplierOrderController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.SupplierOrderDAO;
import edu.ijse.business_managment_system.dao.custom.SupplierOrderDetailDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.SupplierOrderDTO;
import edu.ijse.business_managment_system.dto.SupplierOrderDetailDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Happy Go Lucky
 */
public class SupplierOrderControllerImpl implements SupplierOrderController{
    
    private SupplierOrderDAO supplierOrderDAO;
    private SupplierOrderDetailDAO supplierOrderDetailDAO;

    public SupplierOrderControllerImpl() {
        supplierOrderDAO = (SupplierOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER_ORDER);
        supplierOrderDetailDAO = (SupplierOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER_ORDER_DETAIL);
    }

   
    
    

   @Override
    public boolean add(SupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SupplierOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierOrderDTO> getAll() throws Exception {
       return supplierOrderDAO.getAll();
    }

    @Override
    public boolean add(SupplierOrderDTO supplierOrderDTO, ArrayList<SupplierOrderDetailDTO> allSupplierOrderDetails) {
        
        try {
            Connection connection = ConnectionFactory.getInstance().getConnection();
            
            connection.setAutoCommit(false);
            
            boolean result = supplierOrderDAO.add(supplierOrderDTO);
            
            if (result){
                
                for (SupplierOrderDetailDTO allSupplierOrderDetail : allSupplierOrderDetails) {
                    result = supplierOrderDetailDAO.add(allSupplierOrderDetail);
                    if (!result){
                        connection.rollback();
                        connection.setAutoCommit(true);
                        return false;
                    }
                }
                
                connection.setAutoCommit(true);
                return true;
                
            }else{
                connection.setAutoCommit(true);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierOrderControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(SupplierOrderControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
}
