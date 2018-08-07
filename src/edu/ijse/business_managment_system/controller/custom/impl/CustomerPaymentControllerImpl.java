/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.business_managment_system.controller.custom.impl;

import edu.ijse.business_managment_system.controller.custom.CustomerPaymentController;
import edu.ijse.business_managment_system.dao.DAOFactory;
import edu.ijse.business_managment_system.dao.custom.CustomerPaymentDAO;
import edu.ijse.business_managment_system.dto.CustomerPaymentDTO;
import java.util.ArrayList;

/**
 *
 * @author Happy Go Lucky
 */
public class CustomerPaymentControllerImpl implements CustomerPaymentController{
    
    private CustomerPaymentDAO customerPaymentDAO;
    
    public CustomerPaymentControllerImpl() {
        customerPaymentDAO = (CustomerPaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER_PAYMENT);          
    }

    @Override
    public boolean add(CustomerPaymentDTO customerPaymentDTO) throws Exception {
        return customerPaymentDAO.add(customerPaymentDTO);
    }

    @Override
    public boolean update(CustomerPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerPaymentDTO search(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerPaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
