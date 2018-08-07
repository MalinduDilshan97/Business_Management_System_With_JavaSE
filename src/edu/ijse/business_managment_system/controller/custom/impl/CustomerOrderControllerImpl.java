/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.CustomerOrderController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.BatchDAO;
import edu.ijse.business_managment_system.dao.custom.CustomerOrderDAO;
import edu.ijse.business_managment_system.dao.custom.CustomerOrderDetailDAO;
import edu.ijse.business_managment_system.dao.custom.ItemDAO;
import edu.ijse.business_managment_system.db.ConnectionFactory;
import edu.ijse.business_managment_system.dto.CustomerOrderDTO;
import edu.ijse.business_managment_system.dto.CustomerOrderDetailDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerOrderControllerImpl implements CustomerOrderController{
    
    private CustomerOrderDAO customerOrderDAO;
    private CustomerOrderDetailDAO customerOrderDetailDAO;
    private BatchDAO batchDAO;

    public CustomerOrderControllerImpl() {
         customerOrderDAO = (CustomerOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER_ORDER);
          customerOrderDetailDAO = (CustomerOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER_ORDER_DETAIL);
          batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    }
    
    

    @Override
    public boolean add(CustomerOrderDTO customerOrderDTO, ArrayList<CustomerOrderDetailDTO> allCustomerOrderDetails) {
        try {
            Connection connection = ConnectionFactory.getInstance().getConnection();
            
            connection.setAutoCommit(false);
            
            boolean result = customerOrderDAO.add(customerOrderDTO);
            
            if (result){
                
                for (CustomerOrderDetailDTO allCustomerOrderDetail : allCustomerOrderDetails) {
                    result = customerOrderDetailDAO.add(allCustomerOrderDetail);
                    
                    if (!result){
                        connection.rollback();
                        connection.setAutoCommit(true);
                        return false;
                    }
                }
                
                for (CustomerOrderDetailDTO allCustomerOrderDetail : allCustomerOrderDetails) {
                    result = batchDAO.updateBatchQty(allCustomerOrderDetail);
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

    @Override
    public boolean add(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
